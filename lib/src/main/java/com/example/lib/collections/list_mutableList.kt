package com.example.lib.collections

/**
   -A list is an ordered, resizable collection, typically implemented as a resizable array.
    When the array is filled to capacity and you try to insert a new element, the array is copied to a new bigger array.

   -With a list, you can also insert new elements between other elements at a specific index.
 */

fun main() {
    val solarSystem1 = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem1.size)

    println(solarSystem1[2])

    println(solarSystem1.get(2))

    println(solarSystem1.indexOf("Earth")) //Run your code. An element matches "Earth", so the index, 2, is printed.

    println(solarSystem1.indexOf("Pluto")) //There isn't an element that matches "Pluto", so -1 is printed.


//  Iterate over list elements using a for loop
    for (planet in solarSystem1) {
        println(planet)
    }

//    Add elements to a list
/**
The ability to add, remove, and update elements in a collection is exclusive to classes that implement the MutableList interface.
If you were keeping track of newly discovered planets, you'd likely want the ability to frequently add elements to a list.
You need to specifically call the mutableListOf() function, instead of listOf(), when creating a list you wish to add and remove elements from.
 */

val solarSystem2 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem2.add("Pluto") //insert in end

    println()
    println("------------------------------------")

    //  Iterate over list elements using a for loop
    for (planet in solarSystem2) {
        println(planet)
    }

    solarSystem2.add(3, "Theia") //Insert "Theia" at index 3, between "Earth" and "Mars".


    //Update elements at a specific index

    solarSystem2[3] = "Future Moon"

    println("------------------------------------")

    //  Iterate over list elements using a for loop
    for (planet in solarSystem2) {
        println(planet)
    }

    println("------------------------------------")
    println(solarSystem2[3])
    println(solarSystem2[9])


//    Remove elements from a list
    /**
    Elements are removed using the remove() or removeAt() method.
    You can either remove an element by passing it into the remove() method or by its index using removeAt().
     */

    solarSystem2.removeAt(9)
    solarSystem2.remove("Future Moon")

    println(solarSystem2.contains("Pluto")) //List provides the contains() method that returns a Boolean if an element exists in a list. Print the result of calling contains() for "Pluto".

    println("Future Moon" in solarSystem2) //An even more concise syntax is to use the in operator. You can check if an element is in a list using the element, the in operator, and the collection. Use the in operator to check if solarSystem contains "Future Moon".
}
