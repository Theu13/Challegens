/*
Challenge: Convert temperature (Celsius → Fahrenheit and vice versa).
Description: Chose a temperature type to convert.
Concepts used: .
Date: march/2026
 */

package level_1

fun main(args: Array<String>) {


    //While for loop menu
    while(true) {

        //Menu for chose what you want
        println("=== Convert Temperature ===")
        println("(1) Celsius → Fahrenheit")
        println("(2) Fahrenheit → Celsius")
        println("(0) Leave")
        println("==========================")

        println("Chose a type to convert:")
        var option = readLine()!!.toInt()

        //Options chose
        if (option == 1) {
            println("Write the temperature number in Celsius:")
            var num = readLine()!!.toDouble()
            CelciusToFahrenheit(num)

        } else if (option == 2) {
            println("Write the temperature number in Fahrenheit:")
            var num = readLine()!!.toDouble()
            FahrenheitToCelsius(num)

        } else break

    }
}

//function 1 conversion
fun CelciusToFahrenheit(number:Double) {

    var temperature = ( number * (9/5.0) + 32 )
    println("$number Celsius -> $temperature Fahrenheit")

}

//function 2 conversion
fun FahrenheitToCelsius(number:Double) {

    var temperature = (number - 32) * (5/9.0)
    println("$number Fahrenheit -> $temperature Celsius")

}

