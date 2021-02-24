import java.math.BigInteger

fun main(args:Array<String>) {
    var num=70000
    println(factorial(BigInteger(num.toString()), BigInteger.ONE))
}
tailrec fun  factorial(num:BigInteger,result: BigInteger):BigInteger{
    if (num== BigInteger.ZERO)
        return result
    else
    return factorial(num-BigInteger.ONE,num*result)
}