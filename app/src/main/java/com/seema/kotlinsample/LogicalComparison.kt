package com.seema.kotlinsample

fun main(args: Array<String>) {

    var bolOne = true
    var bolTwo = false

    println("$bolOne && $bolTwo = ${isUserNameValid() and isPasswordValid()}")
    println("------------------")
    println("$bolOne || $bolTwo = ${isPasswordValid() or isUserNameValid()}")

    bolOne = !bolOne
    bolOne = !bolOne

    println("bolOne is : $bolOne")

    println("Comparision Operator")


    println("10 > 20 ${10 > 20}")
    println("10 < 20 ${10 < 20}")
    println("10==20 ${10 == 20}")
    println("5 <=10 ${5 <= 10}")
    println("20 >= 20${20 >= 20}")

    println("10 != 20${10 != 20}")

    println("2 < 3 && 10 > 40 || 3 < 5 = ${2 > 3 && (10 > 40 || 3 < 5)}")


}

fun isUserNameValid(): Boolean {
    println("User Name is invalid")
    return true
}

fun isPasswordValid(): Boolean {
    println("password is valid")
    return false
}