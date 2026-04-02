package com.example.kotlinprogramming

import com.example.kotlinprogramming.practice.app8_tip_calculator.calculateTip
import org.junit.Assert.assertEquals
import java.text.NumberFormat
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)

    }
}