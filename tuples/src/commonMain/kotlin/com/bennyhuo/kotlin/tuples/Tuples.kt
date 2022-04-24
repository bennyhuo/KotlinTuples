package com.bennyhuo.kotlin.tuples

infix fun <R, T> R.U(other: T) = Tuple2(this, other)

data class Tuple1<T0>(val t0: T0) 
fun <T0> tuple1Of(val t0: T0) = Tuple1(t0)
fun <T> Tuple1<T>.toList() = listOf(t0)
fun <T, T0> Tuple1<T0>.U(other: T) = Tuple2(t0, other)
fun <T0> Tuple1<T0>.toMutableTuple1() = mutableTuple1Of(t0)


data class MutableTuple1<T0>(val t0: T0) 
fun <T0> mutableTuple1Of(val t0: T0) = MutableTuple1(t0)
fun <T> MutableTuple1<T>.toList() = listOf(t0)
fun <T, T0> MutableTuple1<T0>.U(other: T) = MutableTuple2(t0, other)
fun <T0> MutableTuple1<T0>.toTuple1() = tuple1Of(t0)
data class Tuple2<T0, T1>(val t0: T0, val t1: T1) 
fun <T0, T1> tuple2Of(val t0: T0, val t1: T1) = Tuple2(t0, t1)
fun <T> Tuple2<T, T>.toList() = listOf(t0, t1)
fun <T, T0, T1> Tuple2<T0, T1>.U(other: T) = Tuple3(t0, t1, other)
fun <T0, T1> Tuple2<T0, T1>.toMutableTuple2() = mutableTuple2Of(t0, t1)


data class MutableTuple2<T0, T1>(val t0: T0, val t1: T1) 
fun <T0, T1> mutableTuple2Of(val t0: T0, val t1: T1) = MutableTuple2(t0, t1)
fun <T> MutableTuple2<T, T>.toList() = listOf(t0, t1)
fun <T, T0, T1> MutableTuple2<T0, T1>.U(other: T) = MutableTuple3(t0, t1, other)
fun <T0, T1> MutableTuple2<T0, T1>.toTuple2() = tuple2Of(t0, t1)
data class Tuple3<T0, T1, T2>(val t0: T0, val t1: T1, val t2: T2) 
fun <T0, T1, T2> tuple3Of(val t0: T0, val t1: T1, val t2: T2) = Tuple3(t0, t1, t2)
fun <T> Tuple3<T, T, T>.toList() = listOf(t0, t1, t2)

fun <T0, T1, T2> Tuple3<T0, T1, T2>.toMutableTuple3() = mutableTuple3Of(t0, t1, t2)


data class MutableTuple3<T0, T1, T2>(val t0: T0, val t1: T1, val t2: T2) 
fun <T0, T1, T2> mutableTuple3Of(val t0: T0, val t1: T1, val t2: T2) = MutableTuple3(t0, t1, t2)
fun <T> MutableTuple3<T, T, T>.toList() = listOf(t0, t1, t2)

fun <T0, T1, T2> MutableTuple3<T0, T1, T2>.toTuple3() = tuple3Of(t0, t1, t2)
