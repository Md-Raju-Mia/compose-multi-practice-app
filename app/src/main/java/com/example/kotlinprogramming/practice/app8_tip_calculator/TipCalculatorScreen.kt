package com.example.kotlinprogramming.practice.app8_tip_calculator

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinprogramming.R
import com.example.kotlinprogramming.ui.theme.KotlinProgrammingTheme
import java.text.NumberFormat

@Composable
fun TipCalculatorApp(){
    var amountInput by remember { mutableStateOf("") }
    var tipInput by remember { mutableStateOf("") }

    val amount = amountInput.toDoubleOrNull() ?: 0.0
    val tipPercent = tipInput.toDoubleOrNull() ?: 0.0
    val tip = calculateTip(amount, tipPercent)

    Column(
        modifier = Modifier
            .padding(40.dp),
            // 🔹 status bar (top system area) এর সাথে overlap এড়ানোর জন্য padding দেয়
           /** .statusBarsPadding()*/

            // 🔹 left ও right পাশে 40dp space দেয় (UI সুন্দর ও readable করার জন্য)
           /** .padding(horizontal = 40.dp)*/

            // 🔹 Column-কে vertically scrollable করে (content বেশি হলে scroll করা যাবে)
           /** .verticalScroll(rememberScrollState())*/

            // 🔹 system UI (status bar + navigation bar) safe area maintain করে
            // 🔹 অর্থাৎ content যেন screen edge / system bar-এর নিচে না ঢুকে যায়
            /**.safeDrawingPadding(),*/

        // 🔹 Column-এর সব child horizontally center-এ থাকবে
        horizontalAlignment = Alignment.CenterHorizontally,

        // 🔹 Column-এর সব content vertically center-এ থাকবে
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = stringResource(R.string.calculate_tip),

            modifier = Modifier
                // 🔹 Text-এর উপরে 40dp এবং নিচে 16dp space দেয়
            /**    .padding(bottom = 16.dp, top = 40.dp)*/
                .padding(bottom = 16.dp)

                // 🔹 Column-এর center alignment override করে এই Text-টাকে left (start)-এ নিয়ে যায়
                .align(alignment = Alignment.Start)
        )
        EditNumberField(
            label = R.string.bill_amount,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            value = amountInput,
            onValueChanged = { amountInput = it},
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth()

        )
        EditNumberField(
            label = R.string.how_was_the_service,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            value = tipInput,
            onValueChanged = { tipInput = it },
            modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth()
        )

        Text(
            text = stringResource(R.string.tip_amount, tip),

            // 🔹 বড় font style (MaterialTheme থেকে নেওয়া predefined typography)
            style = MaterialTheme.typography.displaySmall
        )

        // 🔹 নিচে extra space তৈরি করার জন্য (layout spacing control)
        Spacer(modifier = Modifier.height(150.dp))
    }
}

/**
 * Calculates the tip based on the user input and format the tip amount
 * according to the local currency.
 * Example would be "$10.00".
 */
private fun calculateTip(amount: Double, tipPercent: Double): String {
    val tip = tipPercent / 100 * amount
    return NumberFormat.getCurrencyInstance().format(tip)
}

@Composable
fun EditNumberField(
    @StringRes label: Int,
    keyboardOptions: KeyboardOptions,
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier
){

    TextField(
        /*The value parameter is a text box that displays the string value you pass here.*/
        value = value,
        onValueChange = onValueChanged,
        /*The onValueChange parameter is the lambda callback that's triggered when the user enters text in the text box.*/
        singleLine = true,
        label = {
            Text(
                stringResource(label)
            )
        },
        keyboardOptions = keyboardOptions,
        modifier = modifier,
    )
}


@Preview(showBackground = true)
@Composable
fun TipCalculatorPreview(){
    KotlinProgrammingTheme{
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            TipCalculatorApp()
        }

    }
}