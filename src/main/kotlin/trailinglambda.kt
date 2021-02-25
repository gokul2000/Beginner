import kotlin.math.abs

fun main(args: Array<String>) {
    addition(10,11){y-> println(y)}
    addition(10,20,::printfunction)
    subtraction({x-> println(x)},3,4)
    subtraction(::printfunction,10,6)
}

fun printfunction(`val`:Int){
    println(`val`)
}
fun addition(x:Int,y:Int,fn:(x:Int)->Unit){
    fn(x+y)
}
fun subtraction(fn:(x:Int)->Unit,x:Int,y:Int){
    fn(abs(x-y))
}
