/*
Challenge: Check if a word is palindrome.
Description: Input a word and check vice versa.
Concepts used: input, .reversed()
Date: march/2026
 */

package level_1

fun main(args: Array<String>) {

    println("Write a word to check if its is a palindrome: ")
    val word = readLine()!!

    val word2 = word.reversed()

    if (word2 == word) {
        println("The word $word is a palindrome.")
    } else println("The word $word is not a palindrome.")
}