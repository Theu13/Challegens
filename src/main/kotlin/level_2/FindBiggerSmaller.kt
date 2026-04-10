/*
Challenge: Find the bigger and the smaller number of a sequence.
Description: input numbers and find bigger and smaller.
Concepts used: fun, list, manipulation list, for.
Date: april/2026
*/

package level_2

fun main(args: Array<String>) {

    println("Write a list of numbers (ex: 5 3 6 2): ")
    val input = readLine()!!

    val numbers = input.split(" ").map { it.toInt() }

    findBiggerSmaller(numbers)

}

fun findBiggerSmaller(list: List<Int>) {

    var bigger = 0
    var smaller = 0

    //find bigger
    for (i in list.indices) {
        if (list[i] >= bigger) {
            bigger = list[i]
        } else {
            smaller = list[i]
        }
    }

    println("The Bigger number is $bigger and the smaller number is $smaller")
}

