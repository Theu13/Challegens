/*
Challenge: Remove duplicate of a list.
Description: Enter the numbers and check for duplicates. If there are any, remove them.
Concepts used: toSet(), fun -> for.
Date: april/2026
*/

package level_2

fun main(args: Array<String>) {

    println("Write a list of numbers (ex: 5 3 6 2): ")
    val input = readLine()!!

    val numbers = input.split(" ").map { it.toInt() }

    println("(1) List without duplicate: ${numbers.toSet()}")

    removeDuplicates(numbers)
}


fun removeDuplicates(numbers: List<Int>) {

    var mutable = numbers.toMutableList()

    for (i in 0 until mutable.size) {
        for (j in mutable.size - 1 downTo i + 1) {
            if (mutable[i] == mutable[j]) {
                mutable.removeAt(j)
            }
        }
    }
    println("(2) List without duplicate: $mutable")



}

