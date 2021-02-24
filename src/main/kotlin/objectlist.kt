data class Helper(var name:String,var points:Int)

fun main(args: Array<String>) {
    var values= listOf<Helper>(Helper("Lokul",90),Helper("Harish",70),Helper("Raki",45))
    values=values.sortedBy { helper ->helper.name[helper.name.length-1]  }.toList()
    values.forEach { println(it) }
    values.forEach(::println)
    values.filter { it.points%2==0 }.map { helper: Helper ->Helper(helper.name,helper.points*2)  }.forEach({ println(it) })

}