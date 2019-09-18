fun reverse(myList: List<Int>): List<Int> {

    // Initialise
    val result = arrayListOf<Int>()
    val end = myList.size-1

    // Computation
    for (i in 0..end){
        result.add(myList[end - i])
    }

    return result
}

fun kotlinReverse(myList: List<Int>): List<Int> {

    // Initialise
    val result = arrayListOf<Int>()
    val end = myList.size-1

    // Computation
    for (i in end downTo 0){  // this use a Kotlin function 'downTo'
        result.add(myList[i])
    }

    return result
}

fun main(args: Array<String>) {

    // Initialise
    val myData = listOf(1,2,3,4,5)

    // Computation
    println(reverse( myData ))
    println(kotlinReverse( myData ))

}

