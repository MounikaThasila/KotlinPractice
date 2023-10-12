package com.example.kotlinpractice

//Nested Class
//class OuterClass {
//    var outerVariable = 10
//    fun outerFunction(){
//        println("Outer functions called")
//    }
//    class NestedClass{
//        var nestedVariable = 20
//        fun nestedFunction(){
//            println("Nested function called")
//        }
//    }
//}
//
//fun main() {
//    println(OuterClass.NestedClass().nestedVariable)
//    println(OuterClass.NestedClass().nestedFunction())
//    println(OuterClass().outerFunction())
//    println(OuterClass().outerVariable)
//}

/*InnerClass*/
//class OuterClass {
//    var outerVariable = 10
//    fun outerFunction(){
//        println("Outer functions called")
//        return
//    }
//   inner class InnerClass{
//        var innerVariable = 20
//        fun innerFunction(){
//            var result = innerVariable + outerVariable
//            println(result)
//            println("Inner function called")
//            return
//        }
//    }
//}
//
//fun main() {
//    var innerObject = OuterClass().InnerClass()
//    println("inner class properties")
//    println(innerObject.innerFunction())
//    println(innerObject.innerVariable)
//    println("Outer class properties")
//    println(OuterClass().outerVariable)
//    println(OuterClass().outerFunction())
//}
