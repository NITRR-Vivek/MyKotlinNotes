import java.util.Scanner

/*
 Main Function
 An entry point of a kotlin application is the main function
*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//fun main() {
//    println("Hello, Kotlin !")
//}


fun main(array: Array<String>) {

//  var - Variables that can be reassigned
//   Dynamic Type
//    var roll = 10                   //Integer
//    var mobilenumber = 9990000000L  //Long
//    var price = 83.12f              //float
//    var totalcost = 6324.3215       //double
//    var gender = 'F'                //char
//    var name = "Vivek"              //string
//    var isActive = true             //boolean

    println("Hello, Kotlin !")
//    println(roll)
//    println(mobilenumber)
//    roll = 125
//    mobilenumber = 9876543210
//    println("*** value reassigned ***")
//    println(roll)
//    println(mobilenumber)

//    variable()
//    value()
//    add()
//    arithemeticOperations()
//    comparisonOperations()
////    userInput()
//    stringOperations()
//    conditionalOperations()
//      loops()

//    val multi = multi(b=10,a=20) // function with named arguments
//    println(multi)
//
//    h0F(12,15, :: add)      // calling higher order function
//
//    val addl = { a:Int, b:Int -> a + b}  // Lambda expression
//    println(addl(20,30))
//
//    val addl2:(Int,Int)-> Int = {a,b -> a+b}  // Lambda expression
//    println(addl2(12,28))
//
//    h0F(10,20) { a: Int, b: Int -> a + b } // Higher order function with Lambda Expressions
//
//    val sum = fun( a:Int, b:Int):Int{ return a+b}
//    println(sum(22,32))

//    nullSafety()
//    arrays()
//    lists()
//    sets()
//    maps()



}
/**** Function - Kotlin functions are declared using the fun keyword ****/
// Functions are with and without parameters

fun variable(){

    //  Spesific data Type
    var roll:Int = 10                   //Integer
    var mobilenumber:Long = 9990000000L  //Long
    var price:Float = 83.12f              //float
    var totalcost:Double = 6324.3215       //double
    var gender:Char = 'F'                //char
    var name:String = "Vivek"              //string
    var isActive:Boolean = true             //boolean

    println(roll)
    println(mobilenumber)

    roll = 125
    println("*** Integer Value only can be assigned to roll number ***")
    println(roll)
}
fun value(){

    // val can't be reassigned
    val roll = 123
    val mobile = 9638527410
    val price:Float = 83.12f
    println("Printing the val assigned data types...")
    println(roll)
    println(mobile)
    println(price)
}

fun add(){

    println("** Printing the values **")
    println(" Hello Vivek ")
    val a = 12
    val b = 20
    println(" Hello "+a)
    println(" Hello $a")
    println(" Addition of $a + $b")
    println(" Addition is ${a+b}")
}
fun arithemeticOperations(){
    println(" ** Arithemetic Operations **")
    val a = 5
    val b = 2
    val addition = a + b
    println("Addition "+ addition)
    print("Difference is ")
    println(a-b)
    println("Multiplication is ${a*b}")
    println(b..a)
    print("Range is ")
    for (i in b..a)
        print(i)
    println()
}
fun comparisonOperations(){
    var a = 5
    val b = 3
    val c = 5
    println("*** Printing the Comparison operations ***")
    println(a > b)
    println(a != b)
    println( (a>b) && (a<c) )

    // Increment and decrement operatora
    println(++a)
    println(a--)
    // assigment operator
    a+=5
    println(a)
}
fun userInput(){
    print("Enter your name: ")
    val name: String? = readLine()
    print("Enter your roll: ")
    val roll = readLine()!!.toInt()
    println("Name: $name")
    println("Roll: $roll")
    println(name!!::class.simpleName)
    println(roll::class.simpleName)


    val scanner = Scanner(System.`in`)
    print("Enter your branch: ")
    val branch = scanner.next()
    println("Branch: $branch")
    println(name::class.simpleName)
    print("Enter the fees: ")
    val fee = scanner.nextFloat()
    println("Fee is $fee")

}
fun stringOperations(){
    /*
    Strings ara immutable. Once you initialize a string, you can't change the value or assign a new value to it. All operations that transform strings return their results in an new String object, leaving the original string unchanged.
     */
    val str = "Hello"
    val str2 = " Kotlin"
    print(str)
    print(str[1])
    println("\nThis is "+ str + str2 + 50)

    //String Literals
    println("Hello\t World")

    //Raw String
    val message = """ Dear Sir/Madam, 
        I would like to request you kindly recheck my exam 
        copy and reevaluate the marks.
    """.trimMargin()
    print(message)

    //String Template
    val str3 = "Kotlin"
    val cart = 50
    val quantity = 3
    println("\nThis is ${str3.uppercase()}, your cart value is $cart. \nand total price is: $cart * $quantity = ${cart*quantity}")
}
fun conditionalOperations(){
    val a = 10
    val b = 15
    var max = 0

    if (a < b){
        println("This is IF Expressions")
    }

//    if(a>b) max = a
//    else max = b

    max = if(a>b) a else b

    println("Max expressions is $max")

    if (a>b) println("\nThis is If statement: , $a")
    else println("This is else statement: , $b")

    // Other Method for If-else statement

    max = if(a>b){
        a
    } else{
        b
    }
    println(max)

    //**** When Expression ****

    print("Enter the number: ")
    val x = readlnOrNull()?.toInt()

    when(x){
        1 -> print("One")
        2 -> print("Two")
        3 -> print("Three")
        4,5 -> print("Four or Five")
        in 6..8 -> {
            print("Six ")
            print("or Seven ")
            print("or Eight")
        }

        else -> print("Not Valid")
    }
    when("Monday"){
        "Sunday" -> println("Holiday")
        "Monday" -> println("Workday")
    }
}

fun loops(){
/**** for loop ****/
// Syntax :-  for ( item in collection ) print ( item)

    for( item in 1..5) println(item)

    for( item in 5 downTo 1){
        print("Step: ")
        println(item)
    }

/**** while loop ****/
    var x = 0
    while (x<5){
        x++
        println(x)
    }

//    while(true){
//        println("Always True")
//    }

/**** do while ****/
    do{
        x++
        println(x)
    } while (x < 5)

//    do{
//        println("Always True")
//    } while (true)

/**** Break and Continue ****/
    while (x<10){
        x++
        if (x == 5) continue
        if (x == 8) break
        println(x)
    }
}

fun multi(a:Int,b:Int=5): String{ // Funtion with return type, arguments and default value of arguments
    return("Multiplication of $a and $b is: ${a*b}")
}

fun add (a:Int, b:Int= 10): Int{
    return a+b
}
// higher order function
fun h0F(a:Int, b:Int, callback:(Int, Int)-> Int){
    println(callback(a,b))
}
fun nullSafety(){
    /****** Null Safety ******/
    var name1:String = "Sonal"
//    name1 = null    // Not Allowed
    var name2:String? = "Rahul Kumar"
    name2 = null     // Allowed

    println(name1.length)   // will not work on null variable
    println(if(name2 !=null)name2.length else -1) // Option 1
    println(name2?.length)  // Option 2 : Safe Call
//    println(name2!!.length)   // Option 3: The !! Operator : Throws exception if null
}
fun arrays(){
/***** Array ******/
    val names = arrayOf("Sonam","Rahul","Gaurav", 399,'M')

    names.forEach {name -> println(name) }

    val num = arrayOf<Int>(20,399,21)  // array of integers
    num[1]= 25  // updating the value of index
    num.set(0,22)   // set method for setting in the indexes
    for (i in num.indices){
        println("In Index $i = ${num[i]}")
    }
    println(num.size)
    println(names.get(0))   //get method
    /***** Array Constructor*****/
    val roll1 = Array(5,{ i -> i*2})
    for (rl in roll1){
        println(rl)
    }
    /****** Built-in Methods ******/
    val roll2 = intArrayOf(101,102,103)
    for (rl in roll2){
        println(rl)
    }
    val gender2 = charArrayOf('M','F')
    /******** User Input Array ********/
    print("Enter Number of Student: ")
    val num3 = readln().toInt()
    println("The Student Name: ")
    val students = Array(num3) { readln() }
    for (student in students){
        println(student)
    }
}
fun lists(){
/********* List *********/
// List is an ordered collection with access to elements by indices - integer numbers that reflect position. Elements can occur more than once in a list.
    val data = listOf("Sonam", "Sumit", 100, 'M',"Sonam")
    println(data)           // All values in a list are printed but this will not in case of Array
    println("${data.get(0)} and Size: "+data.size)
//    data[0] = "Sona"  //cannot add or modify to this List i.e. Immutable
    data.indices.forEach{dt -> print("$dt = ${data[dt]}\t")}    // printing using for loop and indices
    val data2 = listOf<String>("Sonal","Sonam","Soan","Sona", 20.toString())
    val s = data2.size
    for (i in 0..s-1){
        println("$i = ${data2[i]}")
    }
    /**** Mutable List ****/
    val data3 = mutableListOf(40,"Sonal","Sonam","Soan","Sona")
    data3[0]="Sonu"                             // updating the list
    data3.add(data3.size,"Solution")    // adding in the list
    data3.removeAt(1)                     // removing the data
    data3.forEach{dt ->  println(dt) }

    /**** User Input List ****/
    print("Enter Number of Student: ")
    val nd4 = readln().toInt()
    println("The Student Name: ")
    val data4 = List<String>(nd4) { readln() }
    for (student in data4){
        println(student)
    }
}
fun sets(){
/******* Set *******/
// Set is a collection of unique elements. It reflects the mathematical abstraction of set: a group of objects without repetitions. Generally, the order of set elements has no significance. also there is no index in sets
    val data5 = mutableSetOf("Sonam","Rahul", "Sonam", "Sumit","Rahul",20,50)      //  SetOf can also be used for immutable set
    println("Data is: "+data5 +" and size is: "+ data5.size)     // It will print after removing all the duplicates
    data5.add("Saurav")
    data5.remove("Sonam")
    println(data5)
}
fun maps(){
/***** Map or Dictionary *****/
// Map (or dictionary) is a set of key-value pairs. Keys are unique, and each of them maps to exactly one value. The values can be duplicates. Maps are useful for storing logical connections between objects, for example, an employee's ID and their positions.

    val data6 = mapOf(1 to "Sonal", "key2" to "Sumit", "key3" to "Rahul", 4 to 100)
    print("Size: "+data6.size+", Values: "+data6)
    println(data6.get(5))
    data6.forEach{dt -> print("Key: "+dt.key+", "); print("Value: "+dt.value+ " \n") }

    val data7 = mutableMapOf<Int,String>(1 to "Abhi", 2 to "Raj", 3 to "Kallu", 4 to "Shyam")
    data7[2] = "Raju"       // update
    data7.put(1, "Abhiraj") // update
    data7.put(5,"Kavalya")  //add
    data7.remove(3)     //remove
    data7.keys.remove(4) // can be removed on the basis of either keys or values
    println(data7)
}

