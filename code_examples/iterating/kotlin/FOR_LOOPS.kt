    for (x in 1..10) {
        println(x)
    }

    var y = listOf("a","b","c","d","e")

    for (item in y){
        println(item)
    }

    for((index,item) in y.withIndex()){
        println(""+ index + ". " + item)
    }
