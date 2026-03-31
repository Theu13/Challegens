/*
Challenge: Greatest common divisor (GCD) between two numbers .
Description: Input two numbers and calculate GCD.
Concepts used: .
Date: march/2026
 */


package level_1


fun main(args: Array<String>) {

    while(true) {
        println("=== GCD ===")
        println("(1) Chose numbers")
        println("(0) Close program")
        println("-------------")
        println("Chose: ")

        var option = readLine()!!.toInt()

        if (option == 1) {
            println("Chose the first number:")
            var num1 = readLine()!!.toInt()
            println("Chose the second number:")
            var num2 = readLine()!!.toInt()

            gcd(num1, num2)

        } else break
    }

}

fun gcd( a: Int,  b: Int) {

    var a = a
    var b = b

    while (b != 0) {
        val c = a % b
         a = b
         b = c
    }

    println("GCD is $a.")
}