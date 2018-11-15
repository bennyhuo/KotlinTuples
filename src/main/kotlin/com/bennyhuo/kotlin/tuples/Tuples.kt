package com.bennyhuo.kotlin.tuples

infix fun <R, T> R.U(other: T) = Tuple2(this, other)
data class Tuple1<T0>(val t0: T0) {

    infix fun <T> U(other: T) = Tuple2(t0, other)

    fun toList() = listOf(t0)
}

fun <T0> tupleOf(t0: T0) = Tuple1(t0)

fun <T> Tuple1<T>.toTypedList() = listOf(t0)

data class MutableTuple1<T0>(var t0: T0){
    infix fun <T> U(other: T) = MutableTuple2(t0, other)

    fun toList() = mutableListOf(t0)
}

fun <T0> mutableTupleOf(t0: T0) = MutableTuple1(t0)

fun <T> MutableTuple1<T>.toTypedList() = mutableListOf(t0)

data class Tuple2<T0, T1>(val t0: T0, val t1: T1) {

    infix fun <T> U(other: T) = Tuple3(t0, t1, other)

    fun toList() = listOf(t0, t1)
}

fun <T0, T1> tupleOf(t0: T0, t1: T1) = Tuple2(t0, t1)

fun <T> Tuple2<T, T>.toTypedList() = listOf(t0, t1)

data class MutableTuple2<T0, T1>(var t0: T0, var t1: T1){
    infix fun <T> U(other: T) = MutableTuple3(t0, t1, other)

    fun toList() = mutableListOf(t0, t1)
}

fun <T0, T1> mutableTupleOf(t0: T0, t1: T1) = MutableTuple2(t0, t1)

fun <T> MutableTuple2<T, T>.toTypedList() = mutableListOf(t0, t1)

data class Tuple3<T0, T1, T2>(val t0: T0, val t1: T1, val t2: T2) {

    infix fun <T> U(other: T) = Tuple4(t0, t1, t2, other)

    fun toList() = listOf(t0, t1, t2)
}

fun <T0, T1, T2> tupleOf(t0: T0, t1: T1, t2: T2) = Tuple3(t0, t1, t2)

fun <T> Tuple3<T, T, T>.toTypedList() = listOf(t0, t1, t2)

data class MutableTuple3<T0, T1, T2>(var t0: T0, var t1: T1, var t2: T2){
    infix fun <T> U(other: T) = MutableTuple4(t0, t1, t2, other)

    fun toList() = mutableListOf(t0, t1, t2)
}

fun <T0, T1, T2> mutableTupleOf(t0: T0, t1: T1, t2: T2) = MutableTuple3(t0, t1, t2)

fun <T> MutableTuple3<T, T, T>.toTypedList() = mutableListOf(t0, t1, t2)

data class Tuple4<T0, T1, T2, T3>(val t0: T0, val t1: T1, val t2: T2, val t3: T3) {

    infix fun <T> U(other: T) = Tuple5(t0, t1, t2, t3, other)

    fun toList() = listOf(t0, t1, t2, t3)
}

fun <T0, T1, T2, T3> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3) = Tuple4(t0, t1, t2, t3)

fun <T> Tuple4<T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3)

data class MutableTuple4<T0, T1, T2, T3>(var t0: T0, var t1: T1, var t2: T2, var t3: T3){
    infix fun <T> U(other: T) = MutableTuple5(t0, t1, t2, t3, other)

    fun toList() = mutableListOf(t0, t1, t2, t3)
}

fun <T0, T1, T2, T3> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3) = MutableTuple4(t0, t1, t2, t3)

fun <T> MutableTuple4<T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3)

data class Tuple5<T0, T1, T2, T3, T4>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4) {

    infix fun <T> U(other: T) = Tuple6(t0, t1, t2, t3, t4, other)

    fun toList() = listOf(t0, t1, t2, t3, t4)
}

fun <T0, T1, T2, T3, T4> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4) = Tuple5(t0, t1, t2, t3, t4)

fun <T> Tuple5<T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4)

data class MutableTuple5<T0, T1, T2, T3, T4>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4){
    infix fun <T> U(other: T) = MutableTuple6(t0, t1, t2, t3, t4, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4)
}

fun <T0, T1, T2, T3, T4> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4) = MutableTuple5(t0, t1, t2, t3, t4)

fun <T> MutableTuple5<T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4)

data class Tuple6<T0, T1, T2, T3, T4, T5>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5) {

    infix fun <T> U(other: T) = Tuple7(t0, t1, t2, t3, t4, t5, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5)
}

fun <T0, T1, T2, T3, T4, T5> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5) = Tuple6(t0, t1, t2, t3, t4, t5)

fun <T> Tuple6<T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5)

data class MutableTuple6<T0, T1, T2, T3, T4, T5>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5){
    infix fun <T> U(other: T) = MutableTuple7(t0, t1, t2, t3, t4, t5, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5)
}

fun <T0, T1, T2, T3, T4, T5> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5) = MutableTuple6(t0, t1, t2, t3, t4, t5)

fun <T> MutableTuple6<T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5)

data class Tuple7<T0, T1, T2, T3, T4, T5, T6>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6) {

    infix fun <T> U(other: T) = Tuple8(t0, t1, t2, t3, t4, t5, t6, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6)
}

fun <T0, T1, T2, T3, T4, T5, T6> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6) = Tuple7(t0, t1, t2, t3, t4, t5, t6)

fun <T> Tuple7<T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6)

data class MutableTuple7<T0, T1, T2, T3, T4, T5, T6>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6){
    infix fun <T> U(other: T) = MutableTuple8(t0, t1, t2, t3, t4, t5, t6, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6)
}

fun <T0, T1, T2, T3, T4, T5, T6> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6) = MutableTuple7(t0, t1, t2, t3, t4, t5, t6)

fun <T> MutableTuple7<T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6)

data class Tuple8<T0, T1, T2, T3, T4, T5, T6, T7>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7) {

    infix fun <T> U(other: T) = Tuple9(t0, t1, t2, t3, t4, t5, t6, t7, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7) = Tuple8(t0, t1, t2, t3, t4, t5, t6, t7)

fun <T> Tuple8<T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7)

data class MutableTuple8<T0, T1, T2, T3, T4, T5, T6, T7>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7){
    infix fun <T> U(other: T) = MutableTuple9(t0, t1, t2, t3, t4, t5, t6, t7, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7) = MutableTuple8(t0, t1, t2, t3, t4, t5, t6, t7)

fun <T> MutableTuple8<T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7)

data class Tuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8) {

    infix fun <T> U(other: T) = Tuple10(t0, t1, t2, t3, t4, t5, t6, t7, t8, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8) = Tuple9(t0, t1, t2, t3, t4, t5, t6, t7, t8)

fun <T> Tuple9<T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8)

data class MutableTuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8){
    infix fun <T> U(other: T) = MutableTuple10(t0, t1, t2, t3, t4, t5, t6, t7, t8, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8) = MutableTuple9(t0, t1, t2, t3, t4, t5, t6, t7, t8)

fun <T> MutableTuple9<T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8)

data class Tuple10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9) {

    infix fun <T> U(other: T) = Tuple11(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9) = Tuple10(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)

fun <T> Tuple10<T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)

data class MutableTuple10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9){
    infix fun <T> U(other: T) = MutableTuple11(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9) = MutableTuple10(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)

fun <T> MutableTuple10<T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)

data class Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10) {

    infix fun <T> U(other: T) = Tuple12(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10) = Tuple11(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)

fun <T> Tuple11<T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)

data class MutableTuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10){
    infix fun <T> U(other: T) = MutableTuple12(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10) = MutableTuple11(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)

fun <T> MutableTuple11<T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)

data class Tuple12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10, val t11: T11) {

    infix fun <T> U(other: T) = Tuple13(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11) = Tuple12(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)

fun <T> Tuple12<T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)

data class MutableTuple12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10, var t11: T11){
    infix fun <T> U(other: T) = MutableTuple13(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11) = MutableTuple12(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)

fun <T> MutableTuple12<T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)

data class Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10, val t11: T11, val t12: T12) {

    infix fun <T> U(other: T) = Tuple14(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12) = Tuple13(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12)

fun <T> Tuple13<T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12)

data class MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10, var t11: T11, var t12: T12){
    infix fun <T> U(other: T) = MutableTuple14(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12) = MutableTuple13(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12)

fun <T> MutableTuple13<T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12)

data class Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10, val t11: T11, val t12: T12, val t13: T13) {

    infix fun <T> U(other: T) = Tuple15(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13) = Tuple14(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)

fun <T> Tuple14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)

data class MutableTuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10, var t11: T11, var t12: T12, var t13: T13){
    infix fun <T> U(other: T) = MutableTuple15(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13) = MutableTuple14(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)

fun <T> MutableTuple14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)

data class Tuple15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10, val t11: T11, val t12: T12, val t13: T13, val t14: T14) {

    infix fun <T> U(other: T) = Tuple16(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14) = Tuple15(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)

fun <T> Tuple15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)

data class MutableTuple15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10, var t11: T11, var t12: T12, var t13: T13, var t14: T14){
    infix fun <T> U(other: T) = MutableTuple16(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14) = MutableTuple15(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)

fun <T> MutableTuple15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)

data class Tuple16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10, val t11: T11, val t12: T12, val t13: T13, val t14: T14, val t15: T15) {

    infix fun <T> U(other: T) = Tuple17(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15) = Tuple16(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)

fun <T> Tuple16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)

data class MutableTuple16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10, var t11: T11, var t12: T12, var t13: T13, var t14: T14, var t15: T15){
    infix fun <T> U(other: T) = MutableTuple17(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15) = MutableTuple16(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)

fun <T> MutableTuple16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)

data class Tuple17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10, val t11: T11, val t12: T12, val t13: T13, val t14: T14, val t15: T15, val t16: T16) {

    infix fun <T> U(other: T) = Tuple18(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16) = Tuple17(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)

fun <T> Tuple17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)

data class MutableTuple17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10, var t11: T11, var t12: T12, var t13: T13, var t14: T14, var t15: T15, var t16: T16){
    infix fun <T> U(other: T) = MutableTuple18(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16) = MutableTuple17(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)

fun <T> MutableTuple17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)

data class Tuple18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10, val t11: T11, val t12: T12, val t13: T13, val t14: T14, val t15: T15, val t16: T16, val t17: T17) {

    infix fun <T> U(other: T) = Tuple19(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16, t17: T17) = Tuple18(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)

fun <T> Tuple18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)

data class MutableTuple18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10, var t11: T11, var t12: T12, var t13: T13, var t14: T14, var t15: T15, var t16: T16, var t17: T17){
    infix fun <T> U(other: T) = MutableTuple19(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16, t17: T17) = MutableTuple18(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)

fun <T> MutableTuple18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)

data class Tuple19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10, val t11: T11, val t12: T12, val t13: T13, val t14: T14, val t15: T15, val t16: T16, val t17: T17, val t18: T18) {

    infix fun <T> U(other: T) = Tuple20(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, other)

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16, t17: T17, t18: T18) = Tuple19(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18)

fun <T> Tuple19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18)

data class MutableTuple19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10, var t11: T11, var t12: T12, var t13: T13, var t14: T14, var t15: T15, var t16: T16, var t17: T17, var t18: T18){
    infix fun <T> U(other: T) = MutableTuple20(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, other)

    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16, t17: T17, t18: T18) = MutableTuple19(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18)

fun <T> MutableTuple19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18)

data class Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(val t0: T0, val t1: T1, val t2: T2, val t3: T3, val t4: T4, val t5: T5, val t6: T6, val t7: T7, val t8: T8, val t9: T9, val t10: T10, val t11: T11, val t12: T12, val t13: T13, val t14: T14, val t15: T15, val t16: T16, val t17: T17, val t18: T18, val t19: T19) {

    fun toList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> tupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16, t17: T17, t18: T18, t19: T19) = Tuple20(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19)

fun <T> Tuple20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = listOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19)

data class MutableTuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(var t0: T0, var t1: T1, var t2: T2, var t3: T3, var t4: T4, var t5: T5, var t6: T6, var t7: T7, var t8: T8, var t9: T9, var t10: T10, var t11: T11, var t12: T12, var t13: T13, var t14: T14, var t15: T15, var t16: T16, var t17: T17, var t18: T18, var t19: T19){
    fun toList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19)
}

fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> mutableTupleOf(t0: T0, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16, t17: T17, t18: T18, t19: T19) = MutableTuple20(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19)

fun <T> MutableTuple20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toTypedList() = mutableListOf(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19)