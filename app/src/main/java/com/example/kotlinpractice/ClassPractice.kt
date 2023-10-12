//package com.example.kotlinpractice
//
////class ClassPractice {
////    class Nested{
////        fun values(){
////            println("hello")
////        }
////    }
////}
////fun main(args:Array<String>){
////    val objectName = ClassPractice.Nested()
////    objectName.values()
////}
//
//class Student (var name: String) {
//
//    var id: Int = -1
//
//    init{
//        println("Student has got a name as $name")
//        println("Student has got a name as $id")
//    }
////
////    constructor(secname: String, id: Int) : this(secname) {
////        this.id = id
////    }
//}
//
//fun main(args:Array<String>){
//    val objectName = Student("ncbsf")
//    objectName.id
//    objectName.name
//}


fun main() {
    sampleFunction()
}
fun sampleFunction(){
    var value1  = 10
    var value2  = 20
    var  value = value1+value2
    println("Addition of value1 and value2 is = $value")
}