// Secondary Constructor
class People{
    //    Properties
    var gender:String = "Female"
    var name: String
    var hAge: Int
    constructor(name:String, age: Int){
        println("Secondary Constructor Called")
        this.name = name
        hAge = age
    }
    //    Member Function
    fun disp(){
        println("Name = $name")
        println("Age = $hAge")
        println("Gender = $gender")
    }
}
fun main(){
    val p1 = People("Sonam",28)
    p1.disp()
}