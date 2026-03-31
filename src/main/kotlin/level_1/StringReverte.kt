/*
Challenge: Reverse a string without reversed().
Description: .
Concepts used: using manipulation arrays.
Date: march/2026
 */


package level_1

fun main() {


    println("Write a string to reverse: ")
    var name = readLine()!!
    var result = ""

    for (i in name.length - 1 downTo 0) {
        result += name[i] //save each character
    }

    println("Result: $result")
}