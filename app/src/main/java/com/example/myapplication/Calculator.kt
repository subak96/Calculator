package com.example.myapplication

open class Calculator(){
    fun add(num3: AddOperation, num1: Double, num2: Double): Double {

        return num1 + num2
    }
    fun Substract(num3: SubstractOperation, num1: Double, num2: Double): Double {

        return num1 - num2
    }
    fun Multiply(num3: MultiplyOperation, num1: Double, num2: Double) : Double {

        return num1 * num2
    }
    fun divide(num3: DivideOperation, num1: Double, num2: Double) : Double {

        return num1 / num2
    }
}