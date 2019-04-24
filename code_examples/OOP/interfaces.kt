interface Flyable {
    fun flying()
    fun landing()
    fun parked()
}

interface FireSafe {
    fun detector() {
        println("default smoke alarms fitted")
    }
}

class Plane() : Flyable, FireSafe {

    //override fun detector() {
    //    println("Special plane detectors added\n")
    //}
    override fun parked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun landing() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun flying() {
        println("I am flying with wings\n")
    }
}

class Helicopter() : Flyable {
    override fun parked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun landing() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun flying() {
        print("I am flying with rotors!\n")
    }
}

fun main() {
    var chopper = Helicopter()

    chopper.flying()

    var jumbo  = Plane()

    jumbo.flying()
    jumbo.detector()

    var jet : Flyable = Plane()
    jet.flying()
    //jet.detector()
}
