package com.example.kotlinpractice

class ClassExample(name:String) {
    var myName = name
    fun parameterFunction(){
//        println(name)  //Show Error
        println(myName)
    }
}
fun main(){
//    var obj = ClassExample("Mounika")
//    println(obj)  //com.example.kotlinpractice.ClassExample@6442b0a6
//    println(obj.myName)  //Mounika
//    println(obj.parameterFunction())   //Mounika



    var obj1 = ClassConstructorWithVarKeyword()

    obj1.forClass()
//    obj.myAge = 90
//    obj.forClass()

//    overrideDefaultFunctions()

var obj = VisibilityModifiersExample(20)
//    obj.count   // Through Error  Bcz count is Private
    obj.countFunction()
    obj.getGroupCount()
//    obj.groupCount  // Through Error Bcz getGroupCount is Private

}


private class VisibilityModifiersExample(private val count :Int){
    private var groupCount = 100

    fun countFunction(){
        println(count)
    }
  fun getGroupCount(){
      println(groupCount)
  }


}



fun overrideDefaultFunctions(){
    var  classObject = OverrideDefaultFunctions("Dog")
    println(classObject.toString())
}



class ClassConstructorWithVarKeyword (var age : Int = 45){
    var myAge = age
    fun forClass(){
//        println(age)
//        println(myAge)

        var obj = VisibilityModifiersExample(age)
        obj.toString()
    }


}

 class OverrideDefaultFunctions(var animal : String) {
    fun getName(){
        println(animal)
    }
    override fun toString(): String {
        return animal
    }
}




























