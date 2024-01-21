/******* Inheritance with Primary Constructor  *******/
open class Father1(_car:String, _money:Int){
    //    Properties
    var car:String = _car
    var money:Int = _money

//    Member Function

    fun disp(){
        println("Father Car: $car")
        println("Father Money: $money")
    }
}
class Son1(_car: String, _money: Int, _bike:String):Father1(_car,_money){
    //    Properties
    var bike:String = _bike

    //    Member Function
    fun show(){
        println("Son bike: $bike")
    }
}

fun main() {


    println("*********")
    val s1 = Son1("Alt 100",1000,"K10")
    s1.show()
//    s1.car = "ZSV"
//    s1.money = 8000
    s1.disp()
    println("*********")

}