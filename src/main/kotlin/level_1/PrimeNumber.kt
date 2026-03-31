/*
Challenge: Check if a number is prime.
Description: input a number and check with a function if number is prime.
Concepts used: fun, input.
Date: march/2026
 */

package level_1

fun main(args: Array<String>) {

    println("Input a number to check if its prime number:")
    var number = readLine()!!.toInt()
    primeTest(number)

}

fun primeTest(num:Int) {
    if (num == 1 || num == 2 || num == 3 || num == 5 || num == 7) {
        println("The number $num is a prime number.5")
    } else if (num % 2 == 0) {
        println("Number is not a prime number.")
    } else if (num % 3 == 0) {
        println("Number is not a prime number.")
    } else if  (num % 5 == 0) {
        println("Number is not a prime number.")
    } else if (num % 7 == 0) {
        println("Number is not a prime number.")
    } else println("The number $num is a prime number.")
}