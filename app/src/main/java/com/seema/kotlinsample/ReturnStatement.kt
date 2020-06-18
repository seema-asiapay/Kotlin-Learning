package com.seema.kotlinsample

fun main() {
    println("Welcome to Kotlin Function")

    var result = sumValue(10, 13.5)

    println("Result is $result")
}

fun myFunctionPrint() {

    println("Printing from inside  the function")
}

fun sumValue(num1: Int, num2: Double) {
    println("Sum is ${num1 + num2}")
}