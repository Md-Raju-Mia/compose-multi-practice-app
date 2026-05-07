package com.example.lib.collections

// A set is a collection that does not have a specific order and does not allow duplicate values.
// Sets have two important properties:

/**
 Searching for a specific element in a set is fast—compared with lists—especially for
 large collections. While the indexOf() of a List requires checking each element from the
 beginning until a match is found, on average, it takes the same amount of time to check if an
 element is in a set, whether it's the first element or the hundred thousandth.
 */

/**
Sets tend to use more memory than lists for the same amount of data,
since more array indices are often needed than the data in the set.
 */


//Use a MutableSet in Kotlin

fun main() {

    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    // Print the size of the set using the size property.
    println(solarSystem.size)


    /** Like MutableList, MutableSet has an add() method. Add "Pluto" to the solarSystem set using the add() method.
     It only takes a single parameter for the element being added.
     Elements in sets don't necessarily have an order, so there's no index!
     */
    solarSystem.add("Pluto")

    println(solarSystem.size)


    /** The contains() function takes a single parameter and checks if the specified element is contained in the set. If so, it returns true.
     Otherwise, it returns false. Call contains() to check if "Pluto" is in solarSystem.
     */
    println(solarSystem.contains("Pluto"))


    /**As mentioned before, sets can't contain duplicates. Try adding "Pluto" again.
     * Print the size of the set again.
     * */

    solarSystem.add("Pluto")
    println(solarSystem.size)


    /**
     * Remember that sets are an unordered collection.
     * There's no way to remove a value from a set by its index, as sets don't have indices.
     * Use the remove() function to remove "Pluto".
     * */

    solarSystem.remove("Pluto")

    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))

}

