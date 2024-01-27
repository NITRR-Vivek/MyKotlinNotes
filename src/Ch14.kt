/***** Interface *****/
interface Father5 {
    //Properties
    var car:String  //by default Abstract Property: cannot be initialized in interface class
    //Member Function
    fun disp(){
        println("Father Car: $car")
    }
    fun hello()     //Abstract Method
}
class Son5: Father5{
    //Properties
    var bike:String = "K10"
    // Member Function
    fun show(){
        println("Son's Member Function")
    }
    // Implementing Father's Abstract Property
    override var car: String = "Alt 100"
    // Implementing Father's Abstract Method
    override fun hello() {
        println("Father's Abstract Method Hello")
    }
}

fun main() {
    val s1= Son5()
    s1.show()
    s1.disp()
    s1.hello()

//    val f1 = Father5()  // Object of Interface cann't be created
}