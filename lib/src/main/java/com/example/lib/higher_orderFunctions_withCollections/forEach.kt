package com.example.lib.higher_orderFunctions_withCollections

/**
 Above the main() function, add the Cookie class. Each instance of Cookie represents
 an item on the menu, with a name, price, and other information about the cookie.
*/
class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)


/**
 * Below the Cookie class, outside of main(), create a list of cookies as shown.
 * The type is inferred to be List<Cookie>.
 * */
val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {

    // Loop over a list with forEach()
    /**
     * The first higher-order function that you learn about is the forEach()function.
     * The forEach() function executes the function passed as a parameter once for
     * each item in the collection. This works similarly to the repeat() function,
     * or a for loop. The lambda is executed for the first element, then the second
     * element, and so on, until it's executed for each element in the collection.
     * */

    // Use the forEach() function to print the items in the cookies list.
    cookies.forEach {
        println("Menu item: $it")
    }

    println("||||||||||||||||||||||||||||||")
    // Embed expressions in strings
    cookies.forEach {
        println("Menu item: $it.name")
    }

    println("||||||||||||||||||||||||||||||")

    // Surround it.name in curly braces to make it a lambda expression.
    cookies.forEach {
        println("Menu item: ${it.name}")
    }

}
