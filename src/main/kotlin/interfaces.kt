interface A
{
    fun show()
    fun abc(){
        println("in abc A")
    }
}
interface B
{
    fun display()
    fun abc(){
        println("in abc B")
    }
}
class C :A,B{
    override fun show() {
        println("Show ")
    }

    override fun display() {
        println("Display")
    }

    override fun abc() {
        super<A>.abc()
    }
}
fun main(args:Array<String>) {
    var obj = C()
    obj.show()
    obj.display()
    obj.abc()
}