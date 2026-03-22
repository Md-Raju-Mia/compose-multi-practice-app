package com.example.lib.kotlinFundamentals



fun main() {

    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }

}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
/**
🧠 1. Main idea কী?
-----------------------
তুমি একটা function বানাইছো:
printFinalTemperature(...)
👉 এই function-এ:
    temperature input নিচ্ছে
    unit নিচ্ছে
    আর একটা formula function নিচ্ছে
✔️ ওই formula দিয়েই conversion করছে

⚙️ 2. Function signature বুঝি
 -------------------------------
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
)
🔍 এখানে important part:
    conversionFormula: (Double) -> Double
conversionFormula: (Double) -> Double
👉 মানে:
    এটা একটা function
    input: Double
    output: Double

🧩 3. সহজভাবে
---------------------
    👉 conversionFormula = একটা formula function
    👉 যেটা temperature convert করবে

🔥 4. ভিতরে কী হচ্ছে?
----------------------
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))

👉 step by step:
    initialMeasurement (যেমন 27.0)
    conversionFormula(initialMeasurement) → formula apply
    result → format করে 2 decimal বানাচ্ছে

📺 5. তারপর print
------------------------
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")

🧠 6. এখন main() দেখি
---------------------------
    🔹 1st line
        printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }

👉 এখানে:
    27.0 → input
    "Celsius" → initial unit
    "Fahrenheit" → final unit

👉 আর শেষের এইটা:
    { 9.0 / 5.0 * it + 32 }
✔️ এইটাই lambda (formula)

🔍 it কী?
👉 it = initialMeasurement

মানে:
    9.0 / 5.0 * 27 + 32

🧮 calculation
    = 48.6 + 32
    = 80.6

🖨️ output
    27.0 degrees Celsius is 80.60 degrees Fahrenheit.

 */