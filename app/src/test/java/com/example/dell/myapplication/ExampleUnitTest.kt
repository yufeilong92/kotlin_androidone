package com.example.dell.myapplication

import com.backpacker.UtilsLibrary.java.TimeUtil
import com.backpacker.UtilsLibrary.kotlin.DateUtil
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun text() {
        val list = mutableListOf<Int>()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)
        for (id in list.indices) {
            println("第一层 id2=" + id)
            for (ids in list.indices) {
                if (ids == 2) {
                    println("第二层 ids==" + ids)
                    break
                }
            }
        }
    }

    @Test
    fun time() {
        val chinese = DateUtil.getNewDateWithChinese()
        println(chinese)
        val stamp = TimeUtil.getStringTimeStamp("2019-3-31 20:20:20")
        println(stamp)

    }
}
