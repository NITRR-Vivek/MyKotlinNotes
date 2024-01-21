/****** Inheritance with Primary and Secondary Constructor with overriding *******/

open class Father2(_car: String, _money: Int) {
    // Properties
    open var car: String = _car
    var money: Int = _money

    // Member Function
    open fun disp() {
         println("Father Class Disp")
    }
}

class Son2 : Father2 {
    // Properties
    var bike: String
    override var car:String = "BMW"     // Overriding Properties of father
    var fcar:String = super.car

    // Secondary Constructor
    constructor(_car: String, _money: Int, _bike: String) : super(_car, _money) {
        this.bike = _bike
    }

    // Member Function
    fun show() {
        println("Son bike: $bike")
        println("Son car: $car")
        println("Father car: $fcar")
        println("Father Money: $money")
    }
    override fun disp (){
        println("Son Class Disp")
    }
}

fun main() {
    println("*********")

    // Using the secondary constructor
    val s1 = Son2("Alt 100", 1000, "K10")
    s1.show()
    s1.disp()
    println("*********")
    val f1 = Father2("ZLX Super",5000)
    f1.disp()

}
