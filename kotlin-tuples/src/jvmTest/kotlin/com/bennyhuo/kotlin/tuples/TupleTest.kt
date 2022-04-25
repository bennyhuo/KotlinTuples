package com.bennyhuo.kotlin.tuples

import org.junit.Test

class TupleTest {

    @Test
    fun test() {
        val tuple3 = 1 U 2 U 3

        assert(tuple3 == tupleOf(1, 2, 3))
        assert(tuple3._2 == 3)
        assert(tuple3.toList() == listOf(1, 2, 3))
        assert(tuple3.toMutableTuple() == mutableTupleOf(1, 2, 3))

        val mutableTuple3 = 1 V 2 V 3
        assert(mutableTuple3.toTuple() == tupleOf(1, 2, 3))
        assert(mutableTuple3.toList() == listOf(1, 2, 3))

        mutableTuple3._0 = 0
        assert(mutableTuple3 == mutableTupleOf(0, 2, 3))

    }

}