interface Runner{
    fun runDis()
}

fun main(args:Array<String>) {
    var runner:Runner=object :Runner{
        override fun runDis() {
            println("Runs upto 5 KM")
        }
    }
    runner.runDis()

}