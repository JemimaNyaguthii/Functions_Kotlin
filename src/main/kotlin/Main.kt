fun main() {
usersDetails("Jemima",20,"Kenyan")
   println(  allSum(23,4,56,78))
    println( averageNum(12,23,34,45,56))
   personRecords("jemima",20,"792035101","jemimanyaguthii@gmail.com",
     60.0,"Kenyan")

}
//Create and invoke a function that takes in a users name, age, and nationality and prints out
// “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am
// 23 years old and I am from Kenya” (2 points)
fun usersDetails(name:String,age:Int,nationality:String){
    println("Hello my name is $name,I am $age and I am from $nationality")
}

//. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun allSum(num: Int, num1: Int, num2: Int, num3: Int): Int {
    return num + num1 + num2 + num3
}
//Create and invoke a function that given any 5 numbers, it returns their average
fun averageNum(num4:Int,num5:Int,num6:Int,num7:Int,num8:Int):Int{
    val averageNums= (num4+num5+num6+num7+num8)/5
    return averageNums
}
///You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not.
fun personRecords(name:String,age:Int,phoneNumber:String,email:String,weight:Double,citizen:String){
if(citizen=="Ugandan"){
    println("I am Ugandan")
}
    else{
        println("I am not Ugandan")
    }
}