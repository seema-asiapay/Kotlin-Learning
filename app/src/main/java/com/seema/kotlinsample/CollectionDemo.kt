package com.seema.kotlinsample

fun main(args:Array<String>){

    arrayDem()
    println("\n================== *** =================")
    listImmutableDem()
    println("\n================== *** =================")
    listMutableDem()
}

fun arrayDem() {
    //Arrays in Kotlin have a constant length

    val arrayname = arrayOf(1, 2, 3, 4, 5) //implicit type declaration
    for (i in 0..arrayname.size-1)
    {
        print(" "+arrayname[i])
    }
    println()
    // declaring an array using arrayOf<Int>
    val arrayname2 = arrayOf<Int>(10, 20, 30, 40, 50) //explicit type declaration
    for (i in 0..arrayname2.size-1)
    {
        print(" "+arrayname2[i])
    }

}

fun listImmutableDem(){

    /*
    //Immutable Collection

    val strings = listOf("Anne", "Karen", "Peter") // List<String>
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)  // Map<String, Int>
    val set = setOf("a", "b", "c")                 // Set<String>

    */

    val immutableList = listOf("Chaitanya","Nikhil","Arpita")

    // immutableList.add = "Gargi"    gives compile time error

    for(item in immutableList){
        println(item)
    }

}

fun listMutableDem(){

    /*
    //Mutable Collection

    val strings = mutableListOf("Anne", "Karen", "Peter") // List<String>
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)  // Map<String, Int>
    val set = mutableSetOf("a", "b", "c")                 // Set<String>

    */

    var mutableList = mutableListOf("Chaitanya","Nikhil","Arpita")


    mutableList[0] = "Gargi"   // we can modify the element

    mutableList.add("Shreya")  // add one more element in the list

    for(item in mutableList){
        println(item)
    }

}