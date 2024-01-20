/****** Getter and Setter ******/
class User(_id:Int, _name:String, _age:Int){

    val id:Int = _id
        get() = field

    var name:String = _name
        get() = field
        set(value) {
            field = value
        }
    var age:Int = _age
        get() = field
        set(value){
            field = value
        }
}

fun main() {
    val u1 = User(1,"Sonam", 27)
    println("Id: "+u1.id+" Name: "+u1.name+" Age: "+u1.age) // get Property

    u1.name = "Roshni"
    u1.age = 23
    println(u1.name)
    println(u1.age)
}