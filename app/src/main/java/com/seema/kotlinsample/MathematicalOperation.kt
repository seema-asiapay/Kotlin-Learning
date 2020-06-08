package com.seema.kotlinsample

fun main(args: Array<String>) {

    var num1 = 7
    var num2 = 4

    // basic arithmetic operation
    println(message = "$num1 + $num2  ${num1 + num2}")
    println(message = "$num1 - $num2  ${num1 - num2}")
    println(message = "$num1 * $num2  ${num1 * num2}")
    println(message = "$num1 / $num2  ${num1 / num2}")
    println(message = "$num1 % $num2  ${num1 % num2}")

    //Unary Operator
    num1 = 5
    //num++ //post increment
    //++num1// prefix increment
    println("num1++ is : ${num1++}")
    println("++num1 is : ${++num1}")

    num2 = 7
    //num-- //post decrement
    //--num1// prefix decrement
    println("num1-- is : ${num1--}")
    println("--num1 is : ${--num1}")


    //Compound Assignment
//    num1 += 4// num1=num1+4 // compound addition assignment operator
//    println("num1 is = $num1")
//
//    num1 -= 4// num1=num1-4 // compound Subtraction assignment operator
//    println("num1 is = $num1")
//
//
//    num1 *= 4// num1=num1*4 // compound Multiplication assignment operator
//    println("num1 is = $num1")
//
//    num1 /= 4// num1=num1/4 // compound division assignment operator
//    println("num1 is = $num1")
//
//
//    num1 %= 4// num1=num1%4 // compound modulus assignment operator
//    println("num1 is = $num1")

}