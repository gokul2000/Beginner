import lombok.Getter

fun main(args: Array<String>) {
val stu = Student()

    stu.name ="Henry"
    println(stu.name)


}
class Student{
    var name:String=""
    get (){ return field }


}