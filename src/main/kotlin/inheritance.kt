/**
 * Abstract classes with inheritance
 */
abstract class HumanBeing(){
    var  age:Int=0

    abstract fun think()
    fun talk(){
        println("talking")
    }
}
class Doctor:HumanBeing(){
    override fun think() {
        println("Critical thinking")
    }
}
class Aleins: HumanBeing(){

    override fun think(){
        println("Virtual thinking")
    }
}
fun main() {
    var gokul:HumanBeing = Aleins()
    gokul.think()
    gokul.talk()

}