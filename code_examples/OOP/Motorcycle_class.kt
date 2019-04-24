class Motorcycle(var name: String, var year: Int, var oilChangeInterval: Int = 20000, var lastOilChange: Int = 0) {

    val wheels: Int = 2

    fun print () {
        println("Motorcycle")
        println("----------")
        println("name: $name")
        println("year: $year")
        println("Oil change internal: $oilChangeInterval")
        println("Last oil change: $lastOilChange\n")
    }

    fun startup () {
        println(this.name + "BBBrrrrmmmm")
    }

    fun oilChange (currentMileage: Int): Boolean {

        if ((currentMileage - this.lastOilChange) > this.oilChangeInterval ) {
            return true
        } else {
            return false
        }
    }
}


fun main() {
    var aprilia = Motorcycle( name = "Aprilia", year = 2017, oilChangeInterval = 5000, lastOilChange = 12000)
    var honda = Motorcycle("Honda", 2008, 10000, 0)

    println("Aprilia" )
    println(aprilia.wheels)
    println(aprilia.name)
    println(aprilia.oilChangeInterval)

    aprilia.oilChangeInterval = 5000

    println(aprilia.oilChangeInterval)

    aprilia.startup()

    aprilia.print()

    println("Oil change required? " + aprilia.oilChange(16650))

    println("\n\nHonda")
    println("-----")
    honda.print()
    println("Oil change required? " + honda.oilChange(45000))

}
