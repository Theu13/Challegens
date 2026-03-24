/*

Challenge: Check if the number written is even or odd.
Des: Input a number to determine if it is even or odd.
Concepts used: if-else, while
Date: march/2026

 */


package Level_1

fun main() {

    println("Write a number to check if it is EVEN or ODD (write 0 to leave): ")
    val number = readln().toInt()

    if (number % 2 == 0) {
        println("The number written is even!")
    } else {
        println("The number written is odd!")
    }

}