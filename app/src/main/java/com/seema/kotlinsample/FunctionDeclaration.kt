package com.seema.kotlinsample

fun main() {
    println("Welcome to Kotlin Function")
    sum(10, 13.5)

}

fun myFunction() {
    println("Printing from inside the function")
}

fun sum(num1: Int, num2: Double) {
    println("Sum of $num1 & $num2 is ${num1 + num2}")
}