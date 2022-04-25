package com.bennyhuo.kotlin.tuples

import java.io.File

const val OUTPUT_PATH = "kotlin-tuples/src/commonMain/kotlin/com/bennyhuo/kotlin/tuples/Tuples.kt"
const val TUPLE_MAX_SIZE = 22
const val TUPLE_NAME_PREFIX = "Tuple"

data class TupleInfo(
    val isMutable: Boolean,
    val size: Int
) {
    val op = if (isMutable) "V" else "U"
    val prefix = if (isMutable) "MutableTuple" else "Tuple"
    val name = prefix + size
    val builderName = prefix.replaceFirstChar { it.lowercase() } + "Of"

    private fun enumerate(transform: ((Int) -> CharSequence)): String {
        return (1 .. size).joinToString(transform = transform)
    }

    fun render(): String {
        val invert = this.copy(isMutable = !isMutable)

        val Tn = enumerate { "T$it" }
        val val_n_type = enumerate { "${if(isMutable) "var" else "val"} _$it: T$it" }
        val _n_type = enumerate { "_$it: T$it" }
        val _n = enumerate { "_$it" }
        val T = enumerate { "T" }

        return """
            
            data class $name<$Tn>($val_n_type) 
            fun <$Tn> $builderName($_n_type) = $name($_n)
            fun <T> $name<$T>.toList() = listOf($_n)
            fun <$Tn> $name<$Tn>.to${invert.prefix}() = ${invert.builderName}($_n)
            fun <$Tn> $name<$Tn>.size() = $size
            ${if (size < TUPLE_MAX_SIZE)
            "infix fun <T, $Tn> $name<$Tn>.$op(other: T) = $prefix${size + 1}($_n, other)"
            else ""}
            """.trimIndent()
    }
}

fun main() {
    val file = File(OUTPUT_PATH)
    file.parentFile.mkdirs()
    file.writer().use { writer ->
        with(writer) {
            appendLine("package com.bennyhuo.kotlin.tuples")
            appendLine()
            appendLine("infix fun <R, T> R.U(other: T) = tupleOf(this, other)")
            appendLine("infix fun <R, T> R.V(other: T) = mutableTupleOf(this, other)")

            (1..TUPLE_MAX_SIZE).forEach {
                appendLine(TupleInfo(false, it).render())
                appendLine(TupleInfo(true, it).render())
            }
        }
    }
}