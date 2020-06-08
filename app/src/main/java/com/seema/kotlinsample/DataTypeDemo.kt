package com.seema.kotlinsample

fun main(args: Array<String>) {
    val myLove = "\"India \nZindabad\""
    val rawString: String = """ India 
        | Zindabad
    """.trimMargin()

    print(myLove)
    val char = 'c'
    val exampleInt =
        123// we r assigning initial value. variable initialization self infer by compiler

    val exampleInt1: Int//we r declaring one variable but not assigning any value

    exampleInt1 = 1234;


    val exampleLong = 123L
    val exampleFloat = 123.8F
    val exampleDouble = 123.8
    val exampleBoolean = true
    val exampleByte: Byte = 123
    val exampleShort: Short = 123
}