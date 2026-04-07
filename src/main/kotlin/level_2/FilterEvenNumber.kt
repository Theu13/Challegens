/*
Challenge: Find even numbers of a list.
Description: .
Concepts used: List, map, filer, split.
Date: april/2026
 */

package level_2

fun main(args: Array<String>) {

    println("Write a list of numbers (ex: 5 3 6 2): ")
    val input = readLine()!!

    //transform
    val numbers = input.split(" ").map { it.toInt() }

    //print with filter
    println("New list of even numbers: ${numbers.filter { it % 2 ==0 }}")

}