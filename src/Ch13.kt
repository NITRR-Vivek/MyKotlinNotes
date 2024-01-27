/******* Abstract Class and Abstract Method ******/
//5:56:30
//Abstract classes are by default open
abstract class Father4{
    // Properties
    var car: String = "Alt 100"

    // Member Function
    fun disp(){
        println("Father car: $car")

    }
    //Abstract Method
    abstract fun hello()
}
class Son4:Father4(){
//    Member Function
    fun show(){
        println("Father car: $car")
    }

    override fun hello() {  //Override is used to rewrite the inherited function
         println("Father's Abstract Method Hello! ")
    }
}

fun main() {
    val s1= Son4()
    s1.show()
    s1.disp()
    s1.hello()
}