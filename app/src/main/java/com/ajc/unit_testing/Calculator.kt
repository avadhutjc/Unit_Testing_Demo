package com.ajc.unit_testing

class Calculator() {

    fun addition(num1 : Int, num2: Int) : Int{
        return num1 + num2
    }

    fun division(num1 : Int, num2 : Int) : Int {
        if (num2 != 0) {
            return num1 / num2
        } else {
            return 0
        }
    }

    fun sub(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun equation(num1: Int, num2: Int) {
        if (num2 != 0) {
            val sum = addition(num1, num2)
            val div = division(num1, num2)
            val sub = sum * div
        }
    }

}