package com.example.kotlinpractice



//fun main(){
//    val list = listOf("sdfjfd","sfdhb",4)
//    for (i in list.indices){
//        println(i)
////        println(list)
//    }
//    val set = setOf(1,23,"vdhbj","23nds")
//    for (i in set.indices){
//        println(set)
//        println(i)
//    }
//    val map = mapOf(0 to "mahipal", 9 to "6341941729$#", 4 to "mahipal", 3 to "fjssk42")
//    for (i in map){
////        println(map[i])
//        println(i)
//    }
//}


//class ArrayExample{
//     val arr:IntArray  = intArrayOf(10,20,30,50)
//
//    fun sampleArray(args:Array){
//        var t:IntArray = arr[0]
//        for (i in arr.indices)
//        {
//
////            print(" "+arr[i])
//            if (arr[i] < i){
//                t = i
//                print(" $t")
//            }
//        }
//    }
//}
//
//

fun main() {
    val numberArray: IntArray = intArrayOf(1, 2, 6, 10, 4, 5, -1, 15)
    var element: Int

    println(numberArray.indices)  /* 0..7 */
    println(numberArray.size)     /* 8 */
    for (i in numberArray.indices) {
        for (j in i + 1 until numberArray.size) {
            if (numberArray[i] < numberArray[j]) {
                element = numberArray[i]
                numberArray[i] = numberArray[j]
                numberArray[j] = element
            }
        }
    }
    for (l in numberArray) {
        print(" $l")
    }
}


////base class
//open class baseClass{
//    val name = "GeeksforGeeks"
//    fun A(){
//        println("Base Class")
//    }
//}
////derived class
//class derivedClass: baseClass() {
//    fun B() {
//        A()
//        println(name)           //inherit name property
//        println("Derived class")
//    }
//}
//fun main(args: Array<String>) {
//    val derived = derivedClass()
//    derived.A()         // inheriting the  base class function
//    derived.B()         // calling derived class function
//}


////base class
//open class Employee(var1: Int,var2: String) {
//    init{
//        println("Name of the Employee is $var1")
//        println("Age of the Employee is $var2")
//    }
//    fun function1(){
//        println("dcbhjbjhbdc")
//    }
//}
//// derived class
//class CEO( name: String, age: Int, salary: Double): Employee(age,name) {
//    init {
//        println("Salary per annum is $salary crore rupees")
//        fun function2(){
//            println("dvhbibds")
//        }
//        function2()
//    }
//    fun function3(){
//        println("ugscuhbhj")
//    }
//}
//fun main(args: Array<String>) {
//    var obj = CEO("Sunder Pichai", 42, 450.00)
//    obj.function1()
//    obj.function3()
//}


//// base class
//open class Phone() {
//    var color = "Rose Gold"
//    fun displayCompany(name:String) {
//        println("Company is: $name")
//    }
//}
//// derived class
//class iphone: Phone() {
//    fun displayColor(){
//
//        // calling the base class property color
//        println("Color is: "+color)
//
//        // calling the base class member function
//        displayCompany("Apple")
//    }
//}
//fun main(args: Array<String>) {
//    val p = iphone()
//    p.displayColor()
//}