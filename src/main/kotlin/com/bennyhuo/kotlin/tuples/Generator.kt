package com.bennyhuo.kotlin.tuples

import java.io.File

const val OUTPUT_PATH = "tuples/src/commonMain/kotlin/com/bennyhuo/kotlin/tuples/Tuples.kt"
const val TUPLE_MAX_SIZE = 3
const val TUPLE_NAME_PREFIX = "Tuple"

data class TupleInfo(
    val isMutable: Boolean,
    val size: Int
) {
    val connector = if (isMutable) "V" else "U"
    val prefix = if (isMutable) "MutableTuple" else "Tuple"
    val name = prefix + size
    val builderName = prefix.replaceFirstChar { it.lowercase() } + "Of"

    private fun enumerate(transform: ((Int) -> CharSequence)): String {
        return (0 until size).joinToString(transform = transform)
    }

    fun render(): String {
        val counterPart = this.copy(isMutable = !isMutable)

        val Tn = enumerate { "T$it" }
        val val_n_type = enumerate { "${if(isMutable) "var" else "val"} _$it: T$it" }
        val _n_type = enumerate { "_$it: T$it" }
        val _n = enumerate { "_$it" }
        val T = enumerate { "T" }

        return """
            
            data class $name<$Tn>($val_n_type) 
            fun <$Tn> $builderName($_n_type) = $name($_n)
            fun <T> $name<$T>.toList() = listOf($_n)
            fun <$Tn> $name<$Tn>.to${counterPart.prefix}() = ${counterPart.builderName}($_n)
            fun <$Tn> $name<$Tn>.size() = $size
            ${if (size < TUPLE_MAX_SIZE)
            "infix fun <T, $Tn> $name<$Tn>.$connector(other: T) = $prefix${size + 1}($_n, other)"
            else ""}
            
            """.trimIndent()
    }
}

fun main() {
    val file = File(OUTPUT_PATH)
    file.parentFile.mkdirs()
    file.writer().use { writer ->
        writer.write("package com.bennyhuo.kotlin.tuples\n\n")

        writer.write("infix fun <R, T> R.U(other: T) = tupleOf(this, other)\n")
        writer.write("infix fun <R, T> R.V(other: T) = mutableTupleOf(this, other)\n")
        writer.write("\n\n")

        (1..TUPLE_MAX_SIZE).forEach {
            writer.write(TupleInfo(false, it).render())
            writer.write("\n\n")
            writer.write(TupleInfo(true, it).render())
        }
    }
}