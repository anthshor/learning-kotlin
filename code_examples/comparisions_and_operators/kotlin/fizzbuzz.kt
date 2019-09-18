fun main(args: Array<String>) {

    for (item in 0..100) {
        if ( item % 15 ==0) {
            println("FizzBuzz $item")
        } else if (item % 3 == 0 ) { // if the number is divisible by 2, or multiple of 2
            println("Fizz $item")
        } else if ( item % 5 == 0) {
            println("Buzz $item")
        }

    }
    
}
