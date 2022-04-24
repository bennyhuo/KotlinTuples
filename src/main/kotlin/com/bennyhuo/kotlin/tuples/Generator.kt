package com.bennyhuo.kotlin.tuples

import java.io.File
import java.util.*

const val OUTPUT_PATH = "tuples/src/commonMain/kotlin/com/bennyhuo/kotlin/tuples/Tuples.kt"
const val TUPLE_MAX_SIZE = 3
const val CONNECTOR_NAME = "U"
const val TUPLE_NAME_PREFIX = "Tuple"

data class TupleInfo(
    val name: String = "Tuple",
    val isMutable: Boolean = false,
    val parameterCount: Int
) {
    val classNamePrefix = (if (isMutable) "Mutable" else "") + name
    val className = classNamePrefix + parameterCount

    val builderFunctionName = className.replaceFirstChar { it.lowercase() } + "Of"

    val typeParameters = (0 until parameterCount).joinToString { "T$it" }

    val valueParametersWithType = (0 until parameterCount).joinToString { "val t$it: T$it" }

    val valueParameters = (0 until parameterCount).joinToString { "t$it" }

    val typeParametersT = (0 until parameterCount).joinToString { "T" }

    fun render(): String {
        val counterPart = this.copy(isMutable = !isMutable)
        return """
            data class $className<$typeParameters>($valueParametersWithType) 
            fun <$typeParameters> $builderFunctionName($valueParametersWithType) = $className($valueParameters)
            fun <T> $className<$typeParametersT>.toList() = listOf($valueParameters)
            ${if (parameterCount < TUPLE_MAX_SIZE)
                "fun <T, $typeParameters> $className<$typeParameters>.$CONNECTOR_NAME(other: T) = $classNamePrefix${parameterCount + 1}($valueParameters, other)"
            else ""}
            fun <$typeParameters> $className<$typeParameters>.to${counterPart.className}() = ${counterPart.builderFunctionName}($valueParameters)
            
            """.trimIndent()
    }
}

fun generatorTuple() {


    val MUTABLE_TUPLE_NAME_PREFIX = "MutableTuple"


    val file = File(OUTPUT_PATH)
    file.parentFile.mkdirs()
    file.writer().use { writer ->
        writer.write("package com.bennyhuo.kotlin.tuples\n\n")

        writer.write("infix fun <R, T> R.$CONNECTOR_NAME(other: T) = ${TUPLE_NAME_PREFIX}2(this, other)")
        writer.write("\n\n")

        (1..TUPLE_MAX_SIZE).joinToString("\n\n") {
            """
            data class $TUPLE_NAME_PREFIX$it<${(0 until it).joinToString { "T$it" }}>(${(0 until it).joinToString { "val t$it: T$it" }}) 
            fun <${(0 until it).joinToString { "T$it" }}> ${TUPLE_NAME_PREFIX.decapitalize(Locale.US)}Of(${(0 until it).joinToString { "t$it: T$it" }}) = $TUPLE_NAME_PREFIX$it(${(0 until it).joinToString { "t$it" }})
            fun <T> $TUPLE_NAME_PREFIX$it<${(0 until it).joinToString { "T" }}>.toList() = listOf(${(0 until it).joinToString { "t$it" }})
            ${if (it < TUPLE_MAX_SIZE)
                    "fun <T, ${(0 until it).joinToString { "T$it" }}> $TUPLE_NAME_PREFIX$it<${(0 until it).joinToString { "T$it" }}>.$CONNECTOR_NAME(other: T) = $TUPLE_NAME_PREFIX${it + 1}(${(0 until it).joinToString { "t$it" }}, other)" 
                else ""}
            fun <${(0 until it).joinToString { "T$it" }}> $TUPLE_NAME_PREFIX$it<${(0 until it).joinToString { "T$it" }}>.to$MUTABLE_TUPLE_NAME_PREFIX() = ${MUTABLE_TUPLE_NAME_PREFIX.replaceFirstChar { it.lowercase() }}Of(${(0 until it).joinToString { "t$it" }})
            
            data class $MUTABLE_TUPLE_NAME_PREFIX$it<${(0 until it).joinToString { "T$it" }}>(${(0 until it).joinToString { "var t$it: T$it" }})
            fun <${(0 until it).joinToString { "T$it" }}> ${MUTABLE_TUPLE_NAME_PREFIX.decapitalize(Locale.US)}Of(${(0 until it).joinToString { "t$it: T$it" }}) = $MUTABLE_TUPLE_NAME_PREFIX$it(${(0 until it).joinToString { "t$it" }})
            fun <T> $MUTABLE_TUPLE_NAME_PREFIX$it<${(0 until it).joinToString { "T" }}>.toList() = mutableListOf(${(0 until it).joinToString { "t$it" }})
            ${if (it < TUPLE_MAX_SIZE)
                    "fun <T, ${(0 until it).joinToString { "T$it" }}> $MUTABLE_TUPLE_NAME_PREFIX$it<${(0 until it).joinToString { "T$it" }}>.$CONNECTOR_NAME(other: T) = $MUTABLE_TUPLE_NAME_PREFIX${it + 1}(${(0 until it).joinToString { "t$it" }}, other)"
                else ""}
            fun <${(0 until it).joinToString { "T$it" }}> $MUTABLE_TUPLE_NAME_PREFIX$it<${(0 until it).joinToString { "T$it" }}>.to$TUPLE_NAME_PREFIX() = ${TUPLE_NAME_PREFIX.replaceFirstChar { it.lowercase() }}Of(${(0 until it).joinToString { "t$it" }})
            """.trimIndent()
        }.let(writer::write)
    }
}

fun main() {
    val file = File(OUTPUT_PATH)
    file.parentFile.mkdirs()
    file.writer().use { writer ->
        writer.write("package com.bennyhuo.kotlin.tuples\n\n")

        writer.write("infix fun <R, T> R.$CONNECTOR_NAME(other: T) = ${TUPLE_NAME_PREFIX}2(this, other)")
        writer.write("\n\n")

        (1..TUPLE_MAX_SIZE).forEach {
            writer.write(TupleInfo(TUPLE_NAME_PREFIX, false, it).render())
            writer.write("\n\n")
            writer.write(TupleInfo(TUPLE_NAME_PREFIX, true, it).render())
        }
    }
}