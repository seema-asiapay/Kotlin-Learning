package com.seema.kotlinsample

fun main(args: Array<String>) {

    var stringValue = "Hindustan"
    var emptyString = String()

    println(stringValue)
    println(emptyString)
    stringValue += "And LDelhi"
    var newString: String = stringValue
    println(stringValue)

    var charArray: CharArray = stringValue.toCharArray()
    println(charArray.toList())

    var byteArray: ByteArray = stringValue.toByteArray()
    println(byteArray.toList())

    var len: Int = stringValue.length
    println(len)

    for (i in 0 until stringValue.length) {

        println(stringValue.get(i))
    }


    var indexOf = stringValue.indexOf("L")
    var subString = stringValue.substring(indexOf)
    println(subString)

    var equals = stringValue.equals(newString.toUpperCase())
    println("Match ?  $equals")
}

