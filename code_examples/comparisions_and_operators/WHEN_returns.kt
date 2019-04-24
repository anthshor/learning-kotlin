    var myLight: Int = 2

    val result = when(myLight){
        1 -> "Red"
        2 -> "Amber"
        3 -> "Green"
        else -> {
            println("Alert. Invalid choice")
            "Please make sure value is 1,2,3"
        }
    }
    println(result)
