/*
Challenge: Calculate the average of a list of grades and determine if a student passed or failed.
Description: Input a list of grades. Calculate the average and determine if a student passed or failed.
Rules: Grades 6 >= Passed; 6 < failed.
Concepts used: input, fun,
Date: march/2026
 */

package level_1

fun main(args: Array<String>) {


    println("Write 1st the grade: ")
    var num1 = readLine()!!.toInt()
    println("Write 2st the grade: ")
    var num2 = readLine()!!.toInt()
    println("Write 3rd the grade: ")
    var num3 = readLine()!!.toInt()

    average(num1, num2, num3)

}

fun average(num1:Int, num2:Int, num3:Int) {

    var sum = num1 + num2 + num3
    var averageSum = sum / 3.0
    println("The average of the grades was $averageSum.")

    if(averageSum >= 6.0) {
        println("Congratulations! Passed.")
    } else println("Fail! Grade was below 6.")

}