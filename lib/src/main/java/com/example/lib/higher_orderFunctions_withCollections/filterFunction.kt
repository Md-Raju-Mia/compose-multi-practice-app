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

class Cookie2(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)


/**
 * Below the Cookie class, outside of main(), create a list of cookies as shown.
 * The type is inferred to be List<Cookie>.
 * */
val cookies2 = listOf(
    Cookie2(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie2(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie2(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie2(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie2(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie2(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie2(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {

   // create a new variable called softBakedMenu, and set it to the result of calling
    // filter() on the cookies list.

    /**
     * In the lambda's body, add a boolean expression to check if the cookie's
     * softBaked property is equal to true. Because softBaked is a Boolean
     * itself, the lambda body only needs to contain it.softBaked.
     * */

    val softBakedMenu = cookies2.filter {
        it.softBaked
    }

    // Print the contents of softBakedMenu using forEach().
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}
