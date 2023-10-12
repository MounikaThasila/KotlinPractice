package com.example.kotlinpractice

class TutflixPractice {
}

fun main(){
//    println("helloworld")
//    var myAge : Int = 20
//    val actualAge = 26
//    var age=30
//    myAge = age
//    var actual = 40
//    actualAge = actual
//    println(age)
//    println(actual)
//    println(myAge)
//    println(actualAge)

//    var floatValue  = 0.9876543F
//    val intValue = 10
//    val stringValue = "mounika"
//    val charValue = 'q'
//    val booleanFalse = false
//    val booleanTrue = true
//    println(stringValue + floatValue + intValue )
//    println(charValue + intValue)
//    println(intValue + charValue) error
////    println(booleanFalse + booleanTrue)  error
//
//val myName = "Mounika"
//    println(kotlinFunctions())
//    println(expressionBodyFunction(b= 20))
//    println("My name is : $myName")  //String Template
//
//    val trippleMarginStrings = """Prints the given message and the line separator
//        #to the standard output stream. Prints the given message and the line separator
//        # to the standard output stream. Prints the given message and the line separator to the
//        # standard output stream.""".trimMargin("#")
//println(trippleMarginStrings)
    loopsExample()

//    println( 't' in "kotlin")  //true
//    println( 't' !in "kotlin")  //false

}


fun loopsExample(){
    val num =1 until 9  // or 1..9
    val rangeDownTo = 10 downTo 2
    val rangeStep = 10 downTo 1 step 3
    println("Range")
    for (i in num){
        println(i)  // 1 2 3 4 5 6 7 8 9
    }
    println("RangeDownTo")
    for (i in rangeDownTo){
        println(i) //10 9 8 7 6 5 4 3 2
    }
    println("RangeDownToStep")
    for (i in rangeStep){
        println(i)  // 10 7 4 1
    }



fun kotlinFunctions():Int {
    val a = 10
    val b =20
    return a+b
}
fun expressionBodyFunction(a:Int=80,b:Int) = a+b



}