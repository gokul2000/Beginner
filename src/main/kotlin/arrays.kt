fun main(args: Array<String>) {
    var nums= intArrayOf(10,12,14,16)
    nums[1]=13
    nums.set(index = 3,value = 4)
    for ((index,element) in nums.withIndex())
        println("The number in index $index is ${element}")
    var numbers = IntArray(4);
    numbers.set(index=0,value = 10)
    numbers.set(index=1,value = 20)
    numbers.set(index=2,value = 30)
    numbers.set(index=3,value = 40)
//    var  dynamicArray= Array<String>(2,{i->i.toString()})
//    for (element in dynamicArray)
//        println(element)
    var values= mutableListOf<Int>(8,9,4,2)
    values.add(1,10)
    values.forEach { x -> println(x) }
}