package com.example.lib.higher_orderFunctions_withCollections

/**
 * The map() function lets you transform a collection into a new collection with the same
 * number of elements. For example, map() could transform a List<Cookie>
 * into a List<String> only containing the cookie's name, provided you tell
 * the map() function how to create a String from each Cookie item.
 * */

class Cookie1(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)


/**
 * Below the Cookie class, outside of main(), create a list of cookies as shown.
 * The type is inferred to be List<Cookie>.
 * */
val cookies1 = listOf(
    Cookie1(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie1(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie1(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie1(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie1(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie1(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie1(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {

    //In the lambda's body, add a string formatted to include the name and price of it.

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    /**
     * Print the contents of fullMenu. You can do this using forEach(). The fullMenu collection
     * returned from map() has type List<String> rather than List<Cookie>.
     * Each Cookie in cookies corresponds to a String in fullMenu.
     * */

    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }
}
