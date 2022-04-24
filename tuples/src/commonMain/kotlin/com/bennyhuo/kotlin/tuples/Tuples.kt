package com.bennyhuo.kotlin.tuples

infix fun <R, T> R.U(other: T) = tupleOf(this, other)
infix fun <R, T> R.V(other: T) = mutableTupleOf(this, other)



data class Tuple1<T0>(val _0: T0) 
fun <T0> tupleOf(_0: T0) = Tuple1(_0)
fun <T> Tuple1<T>.toList() = listOf(_0)
fun <T0> Tuple1<T0>.toMutableTuple() = mutableTupleOf(_0)
fun <T0> Tuple1<T0>.size() = 1
infix fun <T, T0> Tuple1<T0>.U(other: T) = Tuple2(_0, other)



data class MutableTuple1<T0>(var _0: T0) 
fun <T0> mutableTupleOf(_0: T0) = MutableTuple1(_0)
fun <T> MutableTuple1<T>.toList() = listOf(_0)
fun <T0> MutableTuple1<T0>.toTuple() = tupleOf(_0)
fun <T0> MutableTuple1<T0>.size() = 1
infix fun <T, T0> MutableTuple1<T0>.V(other: T) = MutableTuple2(_0, other)

data class Tuple2<T0, T1>(val _0: T0, val _1: T1) 
fun <T0, T1> tupleOf(_0: T0, _1: T1) = Tuple2(_0, _1)
fun <T> Tuple2<T, T>.toList() = listOf(_0, _1)
fun <T0, T1> Tuple2<T0, T1>.toMutableTuple() = mutableTupleOf(_0, _1)
fun <T0, T1> Tuple2<T0, T1>.size() = 2
infix fun <T, T0, T1> Tuple2<T0, T1>.U(other: T) = Tuple3(_0, _1, other)



data class MutableTuple2<T0, T1>(var _0: T0, var _1: T1) 
fun <T0, T1> mutableTupleOf(_0: T0, _1: T1) = MutableTuple2(_0, _1)
fun <T> MutableTuple2<T, T>.toList() = listOf(_0, _1)
fun <T0, T1> MutableTuple2<T0, T1>.toTuple() = tupleOf(_0, _1)
fun <T0, T1> MutableTuple2<T0, T1>.size() = 2
infix fun <T, T0, T1> MutableTuple2<T0, T1>.V(other: T) = MutableTuple3(_0, _1, other)

data class Tuple3<T0, T1, T2>(val _0: T0, val _1: T1, val _2: T2) 
fun <T0, T1, T2> tupleOf(_0: T0, _1: T1, _2: T2) = Tuple3(_0, _1, _2)
fun <T> Tuple3<T, T, T>.toList() = listOf(_0, _1, _2)
fun <T0, T1, T2> Tuple3<T0, T1, T2>.toMutableTuple() = mutableTupleOf(_0, _1, _2)
fun <T0, T1, T2> Tuple3<T0, T1, T2>.size() = 3




data class MutableTuple3<T0, T1, T2>(var _0: T0, var _1: T1, var _2: T2) 
fun <T0, T1, T2> mutableTupleOf(_0: T0, _1: T1, _2: T2) = MutableTuple3(_0, _1, _2)
fun <T> MutableTuple3<T, T, T>.toList() = listOf(_0, _1, _2)
fun <T0, T1, T2> MutableTuple3<T0, T1, T2>.toTuple() = tupleOf(_0, _1, _2)
fun <T0, T1, T2> MutableTuple3<T0, T1, T2>.size() = 3

