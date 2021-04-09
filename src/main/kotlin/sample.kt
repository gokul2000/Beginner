fun main(args: Array<String>) {
    var largeNumber =maximum(4,6)
    println(largeNumber)

}

fun maximum(a: Int, b: Int):Int = if (a>b) {
    println("${a}is greater than ${b}")
    a} else {
        println("${b} is greater than ${a}")
        b}