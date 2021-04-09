fun main(args: Array<String>) {
    var list= arrayListOf<Int>(123456,23,1,56,897,2425,9854)
    list.sortWith(compare())

//    for (k in list)
//        println(k)
    val k:Any = "90"
    when(k){
        is Int -> println("Int")
        is String -> print("String")
    }
}
class compare :Comparator<Int>{
    override fun compare(o1: Int?, o2: Int?):Int {
        if(o1!=null&&o2!=null) {
            return o1.kinder().compareTo(o2.kinder())
        }
        return 0
    }

}
fun Int.kinder():Int{
    return this.toString().length
}