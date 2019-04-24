abstract class Person(open val name: String) {
   init {
       println("Object created!")
   }

    abstract fun greet()
}

class Student(override val name: String): Person(name) {

    override fun greet() {
        println("I am a Student")
    }

}

class Professor(override val name: String): Person(name) {

    override fun greet() {
        println("I am a Professor")
    }
}

fun main() {
    var dave = Student("Dave")

    dave.greet()

}
