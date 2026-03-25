/*
Challenge: Calculate factorial.
Description: Input a number and calculate your factorial.
Concepts used: Recursion, if-else, function.
Date: march/2026
 */

package level_1


fun main(args: Array<String>) {
    println("Enter a number to calculate factorial: ")
    var number = readLine()!!.toInt()

    if (number < 0) {
        println("Invalid input.")
    } else {
        println("$number! = ${factorial(number)}")
    }
}

fun factorial(n: Int): Int {
    if (n <= 1) {
        return 1
    } else {
        return n * factorial(n - 1)
    }

}