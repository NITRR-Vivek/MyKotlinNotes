/******* Inheritance *******/
open class Father{
//    Properties
    var car:String = "Alt 100"
    var money:Int = 10000

//    Member Function

    fun disp(){
        println("Father Car: $car")
        println("Father Money: $money")
    }
}
class Son:Father(){
//    Properties
    var bike:String = "K 20"

//    Member Function
    fun show(){
        println("Son bike: $bike")
    }
}
class Daughter : Father(){
//    Properties
    var bike:String = "KT9"
    fun show(){
        println("Daughter bike: $bike")
    }
}
fun main() {

    println("*********")
    val f1 = Father()
    f1.disp()
    println("*********")
    val s1 = Son()
    s1.show()
    s1.car = "ZSV"
    s1.money = 8000
    s1.disp()
    println("*********")
    val d1 = Daughter()
    d1.show()
    d1.disp()
//    5:20:30
}