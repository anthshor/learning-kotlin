    var myLight: Int = -1

    when(myLight){
        1 -> println("Red")
        2 -> println("Amber")
        3 -> println("Green")
        else -> {
            println("Alert. Invalid choice")
            println("Please make sure value is 1,2,3")
        }
    }
