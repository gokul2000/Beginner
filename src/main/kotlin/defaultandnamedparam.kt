fun main(args:Array<String>) {
    var finalAmount=calcAmount(intrest = 0.03,amount = 50)
    println(finalAmount)
}
@JvmOverloads
fun calcAmount(amount:Int,intrest:Double=0.04):Int{
    return (amount+amount*intrest).toInt()

}