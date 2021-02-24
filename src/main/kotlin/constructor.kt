class Human (var n:String)
{
    var name:String=""
    var age:Int=0
    //constructor chaining
    constructor(age:Int,name:String) : this(name){
        this.age=age

    }
    init {
        name=n
        println("Human named $n is born")
    }

    fun think(){
        println("Kotlin is Awesome... $name is of age $age")
    }
}
fun main(args:Array<String>) {
    var gokul=Human(21,"Gokul")
    gokul.think()


}