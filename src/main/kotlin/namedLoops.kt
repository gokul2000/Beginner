import lombok.ToString

fun main(args: Array<String>) {
   MyLabel@ for (i in 0..13 step 2){
       if(i == 4)
           break@MyLabel
       println(i)
   }
    for (i in 13 downTo 0 step 4)
        println("$i in this loop")
    for( i in 0.rangeTo(55).filter { x->x%2==0 })
        println(i)

    val programmer = object :HumanBeings{
        override fun think() {
            println("I am programmer and also a Human")
        }

    }
   programmer.think()

    var list:MutableList<BookLibrary> = ArrayList<BookLibrary>();
    list.add(BookLibrary(createBook(author="Deshpande",id=1,nameOfBook="C A Fundamental Language",type="Book",jonour = "Programming")))
    list.add(BookLibrary(createBook(author = "Nagoor Kani",id=29,nameOfBook = "Electronic Devices",type = "Book",jonour = "Electronics")))
    println(list)
}

class BookLibrary(var books: Books) : Comparator<BookLibrary>{
    override fun compare(o1: BookLibrary?, o2: BookLibrary?): Int {
       return o1!!.books.nameOfBook().compareTo(o2!!.books.nameOfBook())
    }

    override fun toString(): String {
        return "{bookName=${books.nameOfBook()}\tbookAuthor=${books.getAuthors()}}"
    }


}

fun createBook(author:String,id:Int,nameOfBook:String,type:String,jonour:String):Books {
    return object :Books{
        override fun nameOfBook(): String {
            return nameOfBook
        }

        override fun type(): String {
            return type;
        }

        override fun ID(): Int {
            return id
        }

        override fun getJonour(): String {
            return jonour
        }

        override fun getAuthors(): String {
            return author
        }

    }
}

interface HumanBeings {
    fun think()
}

interface Books{
    fun nameOfBook():String
    fun type():String
    fun ID():Int
    fun getJonour():String
    fun getAuthors():String

}