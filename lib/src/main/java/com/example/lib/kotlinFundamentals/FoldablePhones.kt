package com.example.lib.kotlinFundamentals


open class Phone(var isScreenLigtOn: Boolean = false){

    open fun switchOn() {
        isScreenLigtOn = true
    }

    fun switchOff() {
        isScreenLigtOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLigtOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }

}

class FoldablePhones(var isFolded: Boolean = true): Phone(){

    override fun switchOn(){
        if(!isFolded) {
            isScreenLigtOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }

}

fun main() {
    val newFoldablePhone = FoldablePhones()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()

}