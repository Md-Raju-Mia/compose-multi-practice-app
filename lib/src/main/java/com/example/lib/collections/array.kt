package com.example.lib.collections

// What is an array?
// An array is the simplest way to group an arbitrary number of values in your programs.
    // An array contains multiple values called elements, or sometimes, items.
    // The elements in an array are ordered and are accessed with an index.

fun main(){

    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")

    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val solarSystem = rockPlanets + gasPlanets
    solarSystem[3] = "Little Earth"


    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])



}