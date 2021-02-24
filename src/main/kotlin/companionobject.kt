class Example{
    /**
     * Its not a static behaviour
     * If we want to use static inside companion object we have to use @JvmStatic
     */
    companion object{
        fun create():Example = Example()
    }
    fun show(){
        println("in show")
    }
}

fun main(args:Array<String>) {

    var A:Example= Example.create()
    A.show()
}