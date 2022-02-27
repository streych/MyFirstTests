package com.example.myfirsttests

import junit.framework.Assert.*
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class ClassForTestsTest {


    @Test
    fun classForTestsTest_CorrectPhone() {
        assertEquals("+7964442", ClassForTests.myPhone())
    }

    @Test
    fun classForTestsTest_NotCorrectPhone() {
        assertNotEquals("+796444", ClassForTests.myPhone())
    }

    @Test
    fun classForTestsTest_ArrayCorrect() {
        val arr = arrayOf(1, 2, 3, 4, 5)

        assertArrayEquals(arr, ClassForTests.myArray())
    }

    @Test
    fun classForTestsTest_TestNull() {
        assertNull(ClassForTests.myNull())
    }

    @Test
    fun classForTestsTest_ArrayNotNull() {
        assertNotNull(ClassForTests.myArray())
    }

    @Test
    fun classForTestsTest_CatSameCat() {
        val cat1 = ClassForTests.Cat(0)
        assertSame(cat1, cat1)
    }
}