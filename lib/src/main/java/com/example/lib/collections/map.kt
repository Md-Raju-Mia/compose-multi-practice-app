package com.example.lib.collections

/**
 * A Map is a collection consisting of keys and values. It's called a map because unique keys are mapped to other values.
 * A key and its accompanying value are often called a key-value pair.
 */

/**
 * Accessing a value from a map by its key is generally faster than searching through a large list, such as with indexOf().
 */


/**
 * Maps can be declared using the mapOf() or mutableMapOf() function.
 * Maps require two generic types separated by a comma—one for the keys and another for the values.
 * */


// Let's take a closer look at how to use maps, and some useful properties and methods.

fun main() {

    // Create a map called solarSystem using mutableMapOf() with initial values as shown.

    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    // Like lists and sets, Map provides a size property, containing the number of key-value pairs.
    // Print the size of the solarSystem map.

    println(solarSystem.size)

    // Set the key "Pluto" to a value of 5.
    solarSystem["Pluto"] = 5

    println(solarSystem.size)

    //Print the number of moons for the key "Pluto".
    println(solarSystem["Pluto"])

    // You can also access values with the get() method. Whether you use subscript syntax or call get(),
    // it's possible that the key you pass in isn't in the map. If there isn't a key-value pair,
    // it will return null. Print the number of moons for "Theia".
    println(solarSystem.get("Theia"))


    // The remove() method removes the key-value pair with the specified key.
    // It also returns the removed value, or null, if the specified key isn't in the map.
    solarSystem.remove("Pluto")
    println(solarSystem.size)


    //Subscript syntax, or the put() method, can also modify a value for a key that already exists.
    // Use subscript syntax to update Jupiter's moons to 78 and print the new value.
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])


}