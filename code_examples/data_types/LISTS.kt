var x = arrayListOf("a","c","d","e","f","g")

    println(x.contains("c"))
    println("Empty? "+ x.isEmpty())

    x.add("h")
    x.add(1,"b")
    x.remove("h")

    println(x.size)
    println(x)
    println(x.subList(1,5))
