/******* Constructor ******/
// Primary & Secondary Constructor
class Registration2(_email:String, _password:String){
    //    Properties
    var name:String = ""
    var age:Int? = null
    var email:String = _email
    var password:String
    var gender:String = "Female"
    //    Secondary Constructor
    constructor(name:String, age:Int, _email: String, _password: String):this(_email,_password){
        this.name = name
        this.age = age
    }
    //    Initializer Block
    init {
        this.password = _password
    }
    //    Member Function
    fun disp(){
        println("Name = $name")
        println("Age = $age")
        println("Email = $email")
        println("Password = $password")
        println("Gender = $gender")
    }
}

fun main() {
    val user1 = Registration2("Aashu",21,"aa@gmail.com","123456")
    user1.disp()

}