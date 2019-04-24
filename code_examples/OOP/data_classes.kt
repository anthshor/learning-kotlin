data class Book (val title: String, val author: String, val price: Double){}

fun main() {
    val book1 = Book("Dune", "Frank Herbet", 10.99)
    val book2 = Book("The Shining", "Stephen King", 5.99)
    println(book1)
    println(book2.equals(book1))
    val book3 = book2.copy()
    println(book2.equals(book3))

    val (title, author,price) = book3

    println(title)
    println(price)

    val set = hashSetOf(book1,book2,book3)
    println(set)
}
