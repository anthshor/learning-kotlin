abstract class Car {
    open fun doors(){
        println("4 doors")
    }

    open fun start(){
        println("phut phut")
    }
}

interface Drivable {
    fun start(){
        println("Egnine has started")
    }

}

class Coupe : Car(), Drivable {
    override fun doors(){
        println("2 doors")
    }

    final override fun start(){
        super<Car>.start()
    }

}

fun main() {
    var nissan = Coupe()

    nissan.doors()
    nissan.start()
}
