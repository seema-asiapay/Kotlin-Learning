fun main() {


    validate(101,"123")

    annonymFunc(102,"122")

    lambdaFunc(101,"111")

    higherOrderFunc(lambdaFunc)

}

//Basic Function
fun validate(id:Int,password:String)
{
    println("\nBasic Function")
    if(id==101 && password.equals("123")){

        println("Valid Detail")
    }else{
        println("Invalid Detail")
    }

}


//Annoymous Functions
var annonymFunc= fun(id:Int,password:String){

    println("\nAnnoymous Functions")
    if(id==101 && password.equals("123")){

        println("Valid Detail")
    }else{
        println("Invalid Detail")
    }
}

//Lambda Function

val lambdaFunc:(Int,String)-> Unit  = { id , password ->

    println("\nLambda Function")
    if(id==101 && password.equals("123")){

        println("Valid Detail")
    }else{
        println("Invalid Detail")
    }  }


/*
 * Higher-Order Functions
	A higher-order function is a function that takes functions as parameters, or returns a function.
*
*/

fun higherOrderFunc(lmbd:(Int,String)->Unit){

    println("\nHigher Order Function")
    lmbd(101,"123")
}
