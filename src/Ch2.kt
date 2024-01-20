/****** Class and Object ******/
// Creating Class
class Mobile{
    // Properties
    var model : String = "LG 100K"
    var price : Float = 1233.50F
    // Member Function
    fun disp(){
        println("Model = $model")
        println("Price = $price")
    }
}
fun main(){
    val lg = Mobile()       // Creating Object
    lg.model = "LG K38"     // Assessing Properties using Object
    lg.price = 3999.60f     // Accessing Properties using Object
    lg.disp()               // Calling Function Member using Object

    val realme = Mobile()   // Creating another Object
    realme.model = "Real 10t"
    realme.price = 11000f
    realme.disp()
}