import java.io.*

val OUTPUT_PATH = "./src/main/kotlin/com/bennyhuo/kotlin/tuples/Tuples.kt"
val TUPLE_MAX_SIZE = 20
val TUPLE_NAME_PREFIX = "Tuple"
val MUTABLE_TUPLE_NAME_PREFIX = "MutableTuple"
val CONNECTOR_NAME = "U"

val file = File(OUTPUT_PATH)
file.writer().use { writer ->
    writer.write("package com.bennyhuo.kotlin.tuples\n\n")

    writer.write("""
        infix fun <R, T> R.$CONNECTOR_NAME(other: T) = ${TUPLE_NAME_PREFIX}2(this, other)

    """.trimIndent())

    (1..TUPLE_MAX_SIZE).map {
        """
                data class $TUPLE_NAME_PREFIX$it<${(0 until it).map { "T$it" }.joinToString()}>(${(0 until it).map { "val t$it: T$it" }.joinToString()}) {
                ${if (it < TUPLE_MAX_SIZE) """
                    infix fun <T> $CONNECTOR_NAME(other: T) = $TUPLE_NAME_PREFIX${it + 1}(${(0 until it).map { "t$it" }.joinToString()}, other)
                """ else ""}
                    fun toList() = listOf(${(0 until it).map { "t$it" }.joinToString()})
                }

                fun <${(0 until it).map { "T$it" }.joinToString()}> tupleOf(${(0 until it).map { "t$it: T$it" }.joinToString()}) = $TUPLE_NAME_PREFIX$it(${(0 until  it).map { "t$it" }.joinToString()})

                fun <T> $TUPLE_NAME_PREFIX$it<${(0 until it).map { "T" }.joinToString()}>.toTypedList() = listOf(${(0 until it).map { "t$it" }.joinToString()})

                data class $MUTABLE_TUPLE_NAME_PREFIX$it<${(0 until it).map { "T$it" }.joinToString()}>(${(0 until it).map { "var t$it: T$it" }.joinToString()}){${if (it < TUPLE_MAX_SIZE) """
                    infix fun <T> $CONNECTOR_NAME(other: T) = $MUTABLE_TUPLE_NAME_PREFIX${it + 1}(${(0 until it).map { "t$it" }.joinToString()}, other)
                """ else ""}
                    fun toList() = mutableListOf(${(0 until it).map { "t$it" }.joinToString()})
                }

                fun <${(0 until it).map { "T$it" }.joinToString()}> mutableTupleOf(${(0 until it).map { "t$it: T$it" }.joinToString()}) = $MUTABLE_TUPLE_NAME_PREFIX$it(${(0 until  it).map { "t$it" }.joinToString()})

                fun <T> $MUTABLE_TUPLE_NAME_PREFIX$it<${(0 until it).map { "T" }.joinToString()}>.toTypedList() = mutableListOf(${(0 until it).map { "t$it" }.joinToString()})
            """.trimIndent()
    }.joinToString("\n\n").let(writer::write)
}

