package com.seema.kotlinsample

fun main(args: Array<String>) {
    print("Enter your City : ")
    var city = readLine()






    when (city) {
        "Mumbai" -> println("You live in Maharastra")
        "Ahmedabad,Surat,Vadodara" -> println("You live in Gujrat")
        else -> println("Unknown location")
    }

    var prpy = when (city) {
        "Mumbai" -> "Maharashtra"
        "Ahmedabad" -> "Gujrat"
        else -> "Unknown location"
    }


   /* var age = 33
    when (age) {
        in 0..18 -> {
            println(" Not eligible")
        }
        in 19..50 -> println("Eligible")
        else
        -> println("done..........")

    }*/

}