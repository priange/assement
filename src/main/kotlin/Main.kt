import kotlin.math.max

fun main() {
//    println(void("Join","Isaac"))
   println(all(2,7))
println(all(2,7))
String()
    println(minus(7,3))
    println(multiply(3,7))
}
//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length. (4 pts)
//fun void(valid1:Int,valid2:Int) {





//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements (7 pts)
//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output. (3 pts)
//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it. (4 pts)
//5. Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions

//fun two(name1:String,name2:String):String{
//    var both=(name1).isequalsto(name2)



//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements (7 pts)

fun all(name1:Int,name2:Int):Int{
    var names=arrayOf(2,7)
    return (names.min())

//    var bolds=arrayOf(2,7)
return (names.max())

//    return (names.average())

}
//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it. (4 pts)
//fun string(name1:String,name2:String):String{
//    var named=arrayOf("Mike"+"jack")
////    return named
//
//
//}
//5. Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions


class calculations(var multiply:Int,var subtract:Int,var add:Int){
//    var addition=num1,num2
//            println(addition)


}
fun minus(num1:Int,num2:Int):Int{
    var subtraction=num1-num2
return subtraction
}
fun multiply(num:Int,nam:Int):Int{
    var multiplication=num%nam
    return multiplication


}