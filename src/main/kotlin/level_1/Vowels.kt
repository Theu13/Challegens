/*
Challenge: .
Description: .
Concepts used:
Date: march/2026
 */

package level_1

fun main(args: Array<String>) {

    println("Input a string to check how many vowels it has.")
    var string = readLine()!!

    println("The String have ${vowels(string)} vowels.")

}

fun vowels(string:String) : Int {
    var quantity = 0

    for (i in string.length -1  downTo 0) {
        if (string[i] == 'a' || string[i] == 'e' || string[i] == 'i' || string[i] == 'o' || string[i] == 'u') {
            quantity++
        }

    }

    return quantity
}