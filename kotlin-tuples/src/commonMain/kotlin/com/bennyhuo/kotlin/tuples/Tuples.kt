package com.bennyhuo.kotlin.tuples

infix fun <R, T> R.U(other: T) = tupleOf(this, other)
infix fun <R, T> R.V(other: T) = mutableTupleOf(this, other)



data class Tuple1<T1>(val _1: T1) 
fun <T1> tupleOf(_1: T1) = Tuple1(_1)
fun <T> Tuple1<T>.toList() = listOf(_1)
fun <T1> Tuple1<T1>.toMutableTuple() = mutableTupleOf(_1)
fun <T1> Tuple1<T1>.size() = 1
infix fun <T, T1> Tuple1<T1>.U(other: T) = Tuple2(_1, other)



data class MutableTuple1<T1>(var _1: T1) 
fun <T1> mutableTupleOf(_1: T1) = MutableTuple1(_1)
fun <T> MutableTuple1<T>.toList() = listOf(_1)
fun <T1> MutableTuple1<T1>.toTuple() = tupleOf(_1)
fun <T1> MutableTuple1<T1>.size() = 1
infix fun <T, T1> MutableTuple1<T1>.V(other: T) = MutableTuple2(_1, other)

data class Tuple2<T1, T2>(val _1: T1, val _2: T2) 
fun <T1, T2> tupleOf(_1: T1, _2: T2) = Tuple2(_1, _2)
fun <T> Tuple2<T, T>.toList() = listOf(_1, _2)
fun <T1, T2> Tuple2<T1, T2>.toMutableTuple() = mutableTupleOf(_1, _2)
fun <T1, T2> Tuple2<T1, T2>.size() = 2
infix fun <T, T1, T2> Tuple2<T1, T2>.U(other: T) = Tuple3(_1, _2, other)



data class MutableTuple2<T1, T2>(var _1: T1, var _2: T2) 
fun <T1, T2> mutableTupleOf(_1: T1, _2: T2) = MutableTuple2(_1, _2)
fun <T> MutableTuple2<T, T>.toList() = listOf(_1, _2)
fun <T1, T2> MutableTuple2<T1, T2>.toTuple() = tupleOf(_1, _2)
fun <T1, T2> MutableTuple2<T1, T2>.size() = 2
infix fun <T, T1, T2> MutableTuple2<T1, T2>.V(other: T) = MutableTuple3(_1, _2, other)

data class Tuple3<T1, T2, T3>(val _1: T1, val _2: T2, val _3: T3) 
fun <T1, T2, T3> tupleOf(_1: T1, _2: T2, _3: T3) = Tuple3(_1, _2, _3)
fun <T> Tuple3<T, T, T>.toList() = listOf(_1, _2, _3)
fun <T1, T2, T3> Tuple3<T1, T2, T3>.toMutableTuple() = mutableTupleOf(_1, _2, _3)
fun <T1, T2, T3> Tuple3<T1, T2, T3>.size() = 3
infix fun <T, T1, T2, T3> Tuple3<T1, T2, T3>.U(other: T) = Tuple4(_1, _2, _3, other)



data class MutableTuple3<T1, T2, T3>(var _1: T1, var _2: T2, var _3: T3) 
fun <T1, T2, T3> mutableTupleOf(_1: T1, _2: T2, _3: T3) = MutableTuple3(_1, _2, _3)
fun <T> MutableTuple3<T, T, T>.toList() = listOf(_1, _2, _3)
fun <T1, T2, T3> MutableTuple3<T1, T2, T3>.toTuple() = tupleOf(_1, _2, _3)
fun <T1, T2, T3> MutableTuple3<T1, T2, T3>.size() = 3
infix fun <T, T1, T2, T3> MutableTuple3<T1, T2, T3>.V(other: T) = MutableTuple4(_1, _2, _3, other)

data class Tuple4<T1, T2, T3, T4>(val _1: T1, val _2: T2, val _3: T3, val _4: T4) 
fun <T1, T2, T3, T4> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4) = Tuple4(_1, _2, _3, _4)
fun <T> Tuple4<T, T, T, T>.toList() = listOf(_1, _2, _3, _4)
fun <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4)
fun <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4>.size() = 4
infix fun <T, T1, T2, T3, T4> Tuple4<T1, T2, T3, T4>.U(other: T) = Tuple5(_1, _2, _3, _4, other)



data class MutableTuple4<T1, T2, T3, T4>(var _1: T1, var _2: T2, var _3: T3, var _4: T4) 
fun <T1, T2, T3, T4> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4) = MutableTuple4(_1, _2, _3, _4)
fun <T> MutableTuple4<T, T, T, T>.toList() = listOf(_1, _2, _3, _4)
fun <T1, T2, T3, T4> MutableTuple4<T1, T2, T3, T4>.toTuple() = tupleOf(_1, _2, _3, _4)
fun <T1, T2, T3, T4> MutableTuple4<T1, T2, T3, T4>.size() = 4
infix fun <T, T1, T2, T3, T4> MutableTuple4<T1, T2, T3, T4>.V(other: T) = MutableTuple5(_1, _2, _3, _4, other)

data class Tuple5<T1, T2, T3, T4, T5>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5) 
fun <T1, T2, T3, T4, T5> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5) = Tuple5(_1, _2, _3, _4, _5)
fun <T> Tuple5<T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5)
fun <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5)
fun <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5>.size() = 5
infix fun <T, T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5>.U(other: T) = Tuple6(_1, _2, _3, _4, _5, other)



data class MutableTuple5<T1, T2, T3, T4, T5>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5) 
fun <T1, T2, T3, T4, T5> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5) = MutableTuple5(_1, _2, _3, _4, _5)
fun <T> MutableTuple5<T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5)
fun <T1, T2, T3, T4, T5> MutableTuple5<T1, T2, T3, T4, T5>.toTuple() = tupleOf(_1, _2, _3, _4, _5)
fun <T1, T2, T3, T4, T5> MutableTuple5<T1, T2, T3, T4, T5>.size() = 5
infix fun <T, T1, T2, T3, T4, T5> MutableTuple5<T1, T2, T3, T4, T5>.V(other: T) = MutableTuple6(_1, _2, _3, _4, _5, other)

data class Tuple6<T1, T2, T3, T4, T5, T6>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6) 
fun <T1, T2, T3, T4, T5, T6> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6) = Tuple6(_1, _2, _3, _4, _5, _6)
fun <T> Tuple6<T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6)
fun <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6)
fun <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6>.size() = 6
infix fun <T, T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6>.U(other: T) = Tuple7(_1, _2, _3, _4, _5, _6, other)



data class MutableTuple6<T1, T2, T3, T4, T5, T6>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6) 
fun <T1, T2, T3, T4, T5, T6> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6) = MutableTuple6(_1, _2, _3, _4, _5, _6)
fun <T> MutableTuple6<T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6)
fun <T1, T2, T3, T4, T5, T6> MutableTuple6<T1, T2, T3, T4, T5, T6>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6)
fun <T1, T2, T3, T4, T5, T6> MutableTuple6<T1, T2, T3, T4, T5, T6>.size() = 6
infix fun <T, T1, T2, T3, T4, T5, T6> MutableTuple6<T1, T2, T3, T4, T5, T6>.V(other: T) = MutableTuple7(_1, _2, _3, _4, _5, _6, other)

data class Tuple7<T1, T2, T3, T4, T5, T6, T7>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7) 
fun <T1, T2, T3, T4, T5, T6, T7> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7) = Tuple7(_1, _2, _3, _4, _5, _6, _7)
fun <T> Tuple7<T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7)
fun <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7)
fun <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7>.size() = 7
infix fun <T, T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7>.U(other: T) = Tuple8(_1, _2, _3, _4, _5, _6, _7, other)



data class MutableTuple7<T1, T2, T3, T4, T5, T6, T7>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7) 
fun <T1, T2, T3, T4, T5, T6, T7> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7) = MutableTuple7(_1, _2, _3, _4, _5, _6, _7)
fun <T> MutableTuple7<T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7)
fun <T1, T2, T3, T4, T5, T6, T7> MutableTuple7<T1, T2, T3, T4, T5, T6, T7>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7)
fun <T1, T2, T3, T4, T5, T6, T7> MutableTuple7<T1, T2, T3, T4, T5, T6, T7>.size() = 7
infix fun <T, T1, T2, T3, T4, T5, T6, T7> MutableTuple7<T1, T2, T3, T4, T5, T6, T7>.V(other: T) = MutableTuple8(_1, _2, _3, _4, _5, _6, _7, other)

data class Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8) 
fun <T1, T2, T3, T4, T5, T6, T7, T8> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8) = Tuple8(_1, _2, _3, _4, _5, _6, _7, _8)
fun <T> Tuple8<T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8)
fun <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8)
fun <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>.size() = 8
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>.U(other: T) = Tuple9(_1, _2, _3, _4, _5, _6, _7, _8, other)



data class MutableTuple8<T1, T2, T3, T4, T5, T6, T7, T8>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8) 
fun <T1, T2, T3, T4, T5, T6, T7, T8> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8) = MutableTuple8(_1, _2, _3, _4, _5, _6, _7, _8)
fun <T> MutableTuple8<T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8)
fun <T1, T2, T3, T4, T5, T6, T7, T8> MutableTuple8<T1, T2, T3, T4, T5, T6, T7, T8>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8)
fun <T1, T2, T3, T4, T5, T6, T7, T8> MutableTuple8<T1, T2, T3, T4, T5, T6, T7, T8>.size() = 8
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8> MutableTuple8<T1, T2, T3, T4, T5, T6, T7, T8>.V(other: T) = MutableTuple9(_1, _2, _3, _4, _5, _6, _7, _8, other)

data class Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9) = Tuple9(_1, _2, _3, _4, _5, _6, _7, _8, _9)
fun <T> Tuple9<T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.size() = 9
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.U(other: T) = Tuple10(_1, _2, _3, _4, _5, _6, _7, _8, _9, other)



data class MutableTuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9) = MutableTuple9(_1, _2, _3, _4, _5, _6, _7, _8, _9)
fun <T> MutableTuple9<T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> MutableTuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> MutableTuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.size() = 9
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9> MutableTuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.V(other: T) = MutableTuple10(_1, _2, _3, _4, _5, _6, _7, _8, _9, other)

data class Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10) = Tuple10(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10)
fun <T> Tuple10<T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.size() = 10
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.U(other: T) = Tuple11(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, other)



data class MutableTuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10) = MutableTuple10(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10)
fun <T> MutableTuple10<T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> MutableTuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> MutableTuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.size() = 10
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> MutableTuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.V(other: T) = MutableTuple11(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, other)

data class Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11) = Tuple11(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)
fun <T> Tuple11<T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.size() = 11
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.U(other: T) = Tuple12(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, other)



data class MutableTuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11) = MutableTuple11(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)
fun <T> MutableTuple11<T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> MutableTuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> MutableTuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.size() = 11
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> MutableTuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.V(other: T) = MutableTuple12(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, other)

data class Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12) = Tuple12(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)
fun <T> Tuple12<T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.size() = 12
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.U(other: T) = Tuple13(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, other)



data class MutableTuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12) = MutableTuple12(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)
fun <T> MutableTuple12<T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> MutableTuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> MutableTuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.size() = 12
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> MutableTuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.V(other: T) = MutableTuple13(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, other)

data class Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13) = Tuple13(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)
fun <T> Tuple13<T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.size() = 13
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.U(other: T) = Tuple14(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, other)



data class MutableTuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13) = MutableTuple13(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)
fun <T> MutableTuple13<T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> MutableTuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> MutableTuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.size() = 13
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> MutableTuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.V(other: T) = MutableTuple14(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, other)

data class Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13, val _14: T14) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14) = Tuple14(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14)
fun <T> Tuple14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.size() = 14
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.U(other: T) = Tuple15(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, other)



data class MutableTuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13, var _14: T14) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14) = MutableTuple14(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14)
fun <T> MutableTuple14<T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> MutableTuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> MutableTuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.size() = 14
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> MutableTuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.V(other: T) = MutableTuple15(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, other)

data class Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13, val _14: T14, val _15: T15) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15) = Tuple15(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15)
fun <T> Tuple15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.size() = 15
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.U(other: T) = Tuple16(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, other)



data class MutableTuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13, var _14: T14, var _15: T15) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15) = MutableTuple15(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15)
fun <T> MutableTuple15<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> MutableTuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> MutableTuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.size() = 15
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> MutableTuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.V(other: T) = MutableTuple16(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, other)

data class Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13, val _14: T14, val _15: T15, val _16: T16) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16) = Tuple16(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)
fun <T> Tuple16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.size() = 16
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.U(other: T) = Tuple17(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, other)



data class MutableTuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13, var _14: T14, var _15: T15, var _16: T16) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16) = MutableTuple16(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)
fun <T> MutableTuple16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> MutableTuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> MutableTuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.size() = 16
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> MutableTuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.V(other: T) = MutableTuple17(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, other)

data class Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13, val _14: T14, val _15: T15, val _16: T16, val _17: T17) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17) = Tuple17(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17)
fun <T> Tuple17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.size() = 17
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.U(other: T) = Tuple18(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, other)



data class MutableTuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13, var _14: T14, var _15: T15, var _16: T16, var _17: T17) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17) = MutableTuple17(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17)
fun <T> MutableTuple17<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> MutableTuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> MutableTuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.size() = 17
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> MutableTuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.V(other: T) = MutableTuple18(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, other)

data class Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13, val _14: T14, val _15: T15, val _16: T16, val _17: T17, val _18: T18) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18) = Tuple18(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18)
fun <T> Tuple18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.size() = 18
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.U(other: T) = Tuple19(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, other)



data class MutableTuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13, var _14: T14, var _15: T15, var _16: T16, var _17: T17, var _18: T18) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18) = MutableTuple18(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18)
fun <T> MutableTuple18<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> MutableTuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> MutableTuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.size() = 18
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> MutableTuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.V(other: T) = MutableTuple19(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, other)

data class Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13, val _14: T14, val _15: T15, val _16: T16, val _17: T17, val _18: T18, val _19: T19) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18, _19: T19) = Tuple19(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19)
fun <T> Tuple19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.size() = 19
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.U(other: T) = Tuple20(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, other)



data class MutableTuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13, var _14: T14, var _15: T15, var _16: T16, var _17: T17, var _18: T18, var _19: T19) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18, _19: T19) = MutableTuple19(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19)
fun <T> MutableTuple19<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> MutableTuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> MutableTuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.size() = 19
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> MutableTuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.V(other: T) = MutableTuple20(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, other)

data class Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13, val _14: T14, val _15: T15, val _16: T16, val _17: T17, val _18: T18, val _19: T19, val _20: T20) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18, _19: T19, _20: T20) = Tuple20(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20)
fun <T> Tuple20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.size() = 20
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.U(other: T) = Tuple21(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, other)



data class MutableTuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13, var _14: T14, var _15: T15, var _16: T16, var _17: T17, var _18: T18, var _19: T19, var _20: T20) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18, _19: T19, _20: T20) = MutableTuple20(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20)
fun <T> MutableTuple20<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> MutableTuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> MutableTuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.size() = 20
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> MutableTuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.V(other: T) = MutableTuple21(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, other)

data class Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13, val _14: T14, val _15: T15, val _16: T16, val _17: T17, val _18: T18, val _19: T19, val _20: T20, val _21: T21) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18, _19: T19, _20: T20, _21: T21) = Tuple21(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21)
fun <T> Tuple21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.size() = 21
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.U(other: T) = Tuple22(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, other)



data class MutableTuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13, var _14: T14, var _15: T15, var _16: T16, var _17: T17, var _18: T18, var _19: T19, var _20: T20, var _21: T21) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18, _19: T19, _20: T20, _21: T21) = MutableTuple21(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21)
fun <T> MutableTuple21<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> MutableTuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> MutableTuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.size() = 21
infix fun <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> MutableTuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.V(other: T) = MutableTuple22(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, other)

data class Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9, val _10: T10, val _11: T11, val _12: T12, val _13: T13, val _14: T14, val _15: T15, val _16: T16, val _17: T17, val _18: T18, val _19: T19, val _20: T20, val _21: T21, val _22: T22) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> tupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18, _19: T19, _20: T20, _21: T21, _22: T22) = Tuple22(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)
fun <T> Tuple22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.toMutableTuple() = mutableTupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.size() = 22




data class MutableTuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(var _1: T1, var _2: T2, var _3: T3, var _4: T4, var _5: T5, var _6: T6, var _7: T7, var _8: T8, var _9: T9, var _10: T10, var _11: T11, var _12: T12, var _13: T13, var _14: T14, var _15: T15, var _16: T16, var _17: T17, var _18: T18, var _19: T19, var _20: T20, var _21: T21, var _22: T22) 
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> mutableTupleOf(_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12, _13: T13, _14: T14, _15: T15, _16: T16, _17: T17, _18: T18, _19: T19, _20: T20, _21: T21, _22: T22) = MutableTuple22(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)
fun <T> MutableTuple22<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T>.toList() = listOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> MutableTuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.toTuple() = tupleOf(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> MutableTuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.size() = 22

