/**
 * Every class needs a toString()
 * Every class needs a .equal()
 * as int the case of data class it itself generates all the necessaries
 */
data class Laptop(var brand:String,var price:Int)

data class Book(var name:String , var price: Int)

//for Singleton class
object BookShelf{

    var books= arrayListOf<Book>()
    fun showBooks(){
        for(i in books)
            println(i)
    }
}

fun main(args:Array<String>) {
    BookShelf.books.add(Book("Java",50))
    BookShelf.books.add(Book("Python",60))
    BookShelf.books.add(Book("Kotlin",80))
    BookShelf.showBooks()

}