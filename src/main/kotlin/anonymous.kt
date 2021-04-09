interface Runners{
    fun runDis()
}

fun main(args:Array<String>) {
    var runner:Runners=object :Runners{
        override fun runDis() {
            println("Runs upto 5 KM")
        }
    }
    runner.runDis()

}