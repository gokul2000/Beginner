@file:JvmName("Main")
import java.lang.Exception
import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {

    val num :Int=6
//    var str=when(num){
//        1 -> "One"
//        2->"Two"
//        3->"Three"
//        else -> "Give a proper input"
//    }
//    var kinder = if (num==6){"Six"}
//    else{
//        "Nothing"
//    }
//     var nums= 'A'..'z'
//    for (a in nums){
//        println(a)
//    }
//    println(addition(90,90))
//    println(maxOfTwo(9,67))
//    var string:String="4"
//    var value:Int=try {
//        string.toInt()
//    }catch (e:NumberFormatException){
//        0
//    }
//    println(value)
    var a1 =Alien()
    a1.skills="Java"
    a1.show()
    var a2=Alien()
    a2.skills="Python"
    a2.show()
    var a3 = a1 + a2
    a3.show()
    var a4= a3 plus a1
    a4.show()

}
//Extension functions.... with infix and operator overloading
operator infix fun Alien.plus(a:Alien):Alien{
    var newAlien=Alien()
    newAlien.skills=this.skills+" "+a.skills
    return newAlien
}
fun addition(x:Int,y:Int):Int=x+y
fun maxOfTwo(a:Int,b:Int):Int= if (a>b) a else b