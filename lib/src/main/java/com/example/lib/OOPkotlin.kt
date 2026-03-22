package com.example.lib

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

    fun printDeviceInfo(){
        println("Device name: $name, category: $category, type: $deviceType")
    }
}


class SmartTvDevice(deviceName: String, deviceCategroy: String) :
    SmartDevice(name = deviceName, category = deviceCategroy) {

    override val deviceType = "Smart TV"
    private var speakerVolume by RangeRegulator(2, 0, 100)

    private var channelNumber by RangeRegulator(1, 0, 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun decreaseVolume() {
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    fun previousChannel() {
        channelNumber--
        println("Channel number decreased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println("$name is turned on. Speaker volume is set to $speakerVolume and channel number is set to $channelNumber.")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(2, 0, 100)

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    fun decreaseBrightness() {
        brightnessLevel--
        println("Brightness decreased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")

    }

}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {

        if(smartTvDevice.deviceStatus != "on"){
            deviceTurnOnCount++
            smartTvDevice.turnOn()
        }
    }
    fun turnOffTv() {
        if(smartTvDevice.deviceStatus == "on"){
            deviceTurnOnCount--
            smartTvDevice.turnOff()
        }
    }

    fun increaseTvVolume() {
        if(smartTvDevice.deviceStatus == "on") {
            smartTvDevice.increaseSpeakerVolume()
        } else {
            println("Smart TV is not turned on.")
        }
    }

    fun decreaseTvVolume(){
        if(smartTvDevice.deviceStatus == "on") {
            smartTvDevice.decreaseVolume()
        } else {
            println("Turn on the TV first.")
        }
    }

    fun changeTvChannelToNext() {
        if(smartTvDevice.deviceStatus == "on") {
            smartTvDevice.nextChannel()
        } else {
            println("Turn on the TV first.")
        }
    }

    fun changeTvChannelToPrevious(){
        if(smartTvDevice.deviceStatus == "on") {
            smartTvDevice.previousChannel()
        } else {
            println("Turn on the TV first.")
        }
    }

    fun printSmartTVInfo(){
        smartTvDevice.printDeviceInfo()
    }

    fun turnOnLight() {
        if(smartLightDevice.deviceStatus != "on") {
            deviceTurnOnCount++
            smartLightDevice.turnOn()
        }
    }

    fun turnOffLight() {
        if(smartLightDevice.deviceStatus == "on") {
            deviceTurnOnCount--
            smartLightDevice.turnOff()
        }
    }

    fun increaseLightBrightness() {
        if(smartLightDevice.deviceStatus == "on") {
            smartLightDevice.increaseBrightness()
        }else {
            println("Turn on the light first.")
        }
    }

    fun decreaseLightBrightness() {
        if(smartLightDevice.deviceStatus == "on") {
            smartLightDevice.decreaseBrightness()
        }else {
            println("Turn on the light first.")
        }
    }

    fun printSmartLightInfo(){
        smartLightDevice.printDeviceInfo()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}


class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: Int
    ) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }

}

fun main() {

    val smartHome = SmartHome(
        SmartTvDevice("Android TV", "Entertainment"),
        SmartLightDevice("Google Light", "Utility")
    )

    smartHome.printSmartTVInfo()
    smartHome.printSmartLightInfo()

    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
    println()

    smartHome.turnOnTv()
    smartHome.increaseTvVolume()
    smartHome.decreaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.changeTvChannelToPrevious()

    println()

    smartHome.turnOnLight()
    smartHome.increaseLightBrightness()
    smartHome.decreaseLightBrightness()

    println()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")

    println()
    smartHome.turnOffAllDevices()

    println()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")


}