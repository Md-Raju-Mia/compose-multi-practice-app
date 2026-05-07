package com.example.lib.higher_orderFunctions_withCollections


/**
 * If you had a list of numbers, you could use filter() to create a new list that
 * only contains numbers divisible by 2.
 * */


// The map() function always creates a new collection with the same number of items
// as the original collection.

// The filter() function creates a new collection that can have the same number of items
// or fewer items than the original collection because it removes items that do not match a condition.

// Also, unlike map(), the new collection keeps the same data type. For example,
// if you filter a List<Cookie>, the result will still be a List<Cookie>.


/**
 * The map() function lets you transform a collection into a new collection with the same
 * number of elements. For example, map() could transform a List<Cookie>
 * into a List<String> only containing the cookie's name, provided you tell
 * the map() function how to create a String from each Cookie item.
 * */

class Cookie3(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)


/**
 * Below the Cookie class, outside of main(), create a list of cookies as shown.
 * The type is inferred to be List<Cookie>.
 * */
val cookies3 = listOf(
    Cookie3(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie3(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie3(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie3(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie3(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie3(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie3(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {

    val groupedMenu = cookies.groupBy {
        it.softBaked
    }

    /**
     * Create a softBakedMenu variable containing the value of groupedMenu[true],
     * and a crunchyMenu variable containing the value of groupedMenu[false].
     * Because the result of subscripting a Map is nullable, you can use the
     * Elvis operator (?:) to return an empty list.
     * */

    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    // Add code to print the menu for soft cookies, followed by the menu for crunchy cookies.
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}
