package com.seema.kotlinsample

fun main(array: Array<String>) {

    println("Variable in Kotlin")

    var num1 :Int= 30
    println("Value of num1 is $num1")
    println("Dta type of num1 is ${num1::class.simpleName}")

    num1 = 3456
    println("Value of num1 is $num1")

    var num2: Double = 300.55
    println("Value of num2 is $num2")

    val sanjay="sanjay kumar barfa"
    println("My name is  $sanjay")

  //  sanjay="my nick name is Sanju"
}