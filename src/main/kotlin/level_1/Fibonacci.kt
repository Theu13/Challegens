/*
Challenge: Print the first n terms of the Fibonacci sequence.
Description: Input a number and calculate the Nth term of the sequence.
Concepts used: Recursion, if-else, function.
Date: march/2026
 */

package level_1

fun main(args: Array<String>) {
    println("Enter a number to find the value in the sequence: ")
    var n = readLine()!!.toInt()

    if (n < 0) {
        println("Invalid input")
    } else {
        println("The term $n in the sequence is: ${fibonacci(n)}")
    }

}

fun fibonacci(n: Int): Int {
    if (n == 1) return 1
    if (n == 0) return 0
    return  fibonacci(n - 1) + fibonacci(n - 2)
}