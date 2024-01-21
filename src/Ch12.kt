/******* Visibility Modifiers *******/
/*
* private means visible inside this class only (including all its members).
* protected is the same as private but is also visible in subclasses.
* internal means that any client inside this module who seed the declaring class sees its internal members.
* public means that any client who sees the declaring class sees its public members.
* */

open class Father3{
//    Properties
    private var a:Int = 10      // private can be access inside this class only
    protected var b:Int = 20    // protected can be used inside inherited classes only
    internal var c: Int = 30    // internal can be accessed inside this module only
    var d: Int = 40             // public can be accessed from anywhere

    //    Member Function
    fun disp(){
        println("A: $a")
        println("B: $b")
        println("C: $c")
        println("D: $d")
    }
    fun hello(){
        println("Hello Father !")
    }
}
class Son3:Father3(){
//    Properties
    var bike:String = "K 10"

//    Member Function
    fun show(){
//        println("A: $a")        // cannot be access as it is private
        println("B: $b")          // protected can be used inside inherited classes only
        println("C: $c")
        println("D: $d")
        hello()
    }
}

fun main() {
    val s1 = Son3()
    s1.show()
//    s1.a = 100    // cannot be access as it is private
//    s1.b = 101      // protected can be used inside inherited classes only
    s1.c = 102      // internal can be accessed inside this module only
    s1.d = 103
    s1.disp()
    s1.hello()
    val f1 = Father3()
//    f1.a = 110      // can't be accessed as it is private
//    f1.b = 111      // can't be accesses as it is protected
    f1.c = 123
}
//class Father3 private constructor(a:Int){....}
