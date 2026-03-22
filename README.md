#Compose Article - Solution Code

This project contains solution code for Compose Article practice problem. In the exercise, you need to build a screen which displays article about Jetpack Compose Tutorial.

##Solution
1. Download the image from the URL [BannerImage](https://github.com/google-developer-training/basic-android-kotlin-compose-training-practice-problems/blob/main/Unit%201/Pathway%203/ComposeArticle/app/src/main/res/drawable-nodpi/bg_compose_background.png)
2. Import the image in the ComposeArticle project
3. Use Column composable function to arrange the components vertically:
    Column(){
        // Load image using painterResource()
        Image(...)
        // Load text using stringResource()
        Text(...)
        // Load text using stringResource()
        Text(...)
    }



