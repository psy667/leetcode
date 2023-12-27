fun fizzBuzz(n: Int) = (1..n).map {
    when ((it % 3 == 0) to (it % 5 == 0)) {
        (true to true) -> "FizzBuzz"
        (false to true) -> "Buzz"
        (true to false) -> "Fizz"
        else -> it.toString()
    }
}
