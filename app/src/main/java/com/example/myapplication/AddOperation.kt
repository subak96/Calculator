package com.example.myapplication

class AddOperation : Calculator() {
    fun add (num1: Int, num2: Int): Double = (num1 + num2).toDouble()
}