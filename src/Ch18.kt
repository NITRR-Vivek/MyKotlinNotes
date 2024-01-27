/***** Calling Java from Kotlin (MyJava) *****/
/***** Calling Kotlin from Java (MyJava) *****/

fun main() {
    val obj = MyJava()
    obj.setValue(10)
    println(obj.getValue())
}
fun addition(a:Int,b:Int):Int{
    return (a+b)
}