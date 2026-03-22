# Compose Article - Solution Code

This project contains the solution code for the **Compose Article** practice problem. In this exercise, you build a screen that displays a tutorial about Jetpack Compose.

## Solution Steps

1. **Download the Asset**: Get the [Banner Image here](https://github.com/google-developer-training/basic-android-kotlin-compose-training-practice-problems/blob/main/Unit%201/Pathway%203/ComposeArticle/app/src/main/res/drawable-nodpi/bg_compose_background.png)
2. **Import**: Add the image to your project's `res/drawable` folder.
3. **Compose**: Use a `Column` composable to arrange the components vertically:

   ```kotlin
   Column() {
       // 1. Banner Image
       Image(
           painter = painterResource(id = R.drawable.bg_compose_background),
           contentDescription = null
       )

       // 2. Title Text
       Text(text = stringResource(R.string.title))

       // 3. Body Content
       Text(text = stringResource(R.string.body))
   }
