package com.seema.kotlinsample

/*
 * Kotlin properties can declared either as mutable using var keyword, or as immutable using val keyword.
 *
 * */

fun main() {

    val obj=PropertyDemo()

    obj.name="Nikhil"

    obj.age=4
    println("Hello, "+obj.name+"\nAge  : "+obj.age)
}

class PropertyDemo{

    var name:String="Chaitanya"

        get()=field  //getter

        set(value){field=value} //setter

    var age :Int=18

        //custom getter
        get(){
            return if(field >18) field else 18
        }


}