fun myFun(company:String,product:String,fn:(String,String)->String):Unit{
    var result:String = fn(company,product)
    println(result)

}
/**
 * Fuctions wiht function as a parameter
 */

fun main(args:Array<String>) {
    var fn:(String,String)->String={org,portal->"$org developes $portal"}
    myFun("JetBrains","Kotlin",fn)
}