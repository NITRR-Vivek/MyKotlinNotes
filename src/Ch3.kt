
/****** Constructor ******/
// Primary Constructor
class Person constructor(val name:String, val age:Int) {

    // Properties
    var gender: String = "Female"

    // Member Function
    fun disp() {
        println("Name = $name")
        println("Age = $age")
        println("Gender = $gender")
    }
}
class Human (name: String, age: Int){
// Properties
    var hName: String
    var hAge: Int = age
    var gender: String = "Female"
// Initializer Block
    init {
        hName = name
    }
// Member Function
    fun disp(){
        println("Name = $hName")
        println("Age = $hAge")
        println("Gender = $gender")
    }
}
fun main (){
    val p1 = Person("Sonam", 27)
    p1.disp()
    val p2 = Person("Rahul", 20)
    p2.gender = "Male"
    println(p2.name)
    println(p2.age)
    println(p2.gender)

    val h1 = Human("Sonal", 26 )
    h1.disp()
    val h2 = Human("Rani", 20 )
    h2.disp()
}