package com.example.myfirsttests

class ClassForTests {

    companion object {

        fun myPhone(): String {
            return "+7964442"
        }

        fun myArray(): Array<Int> {
            val arr = arrayOf(1, 2, 3, 4, 5)
            return arr
        }

        fun myNull(): String? {
            return null
        }

    }

    class Cat(int: Int) {
        private val i = int
    }

}