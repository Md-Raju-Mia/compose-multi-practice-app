# 📰 Compose Article App

## 🌟 Project Overview
The **Compose Article** app is a clean, single-page UI built to practice the most common layout components in Jetpack Compose. It displays a tutorial-style article with a header image, a bold title, and structured body text.

This project is perfect for learning how to stack elements vertically and apply precise spacing.

---

## 🛠️ What I Learned (Key Concepts)

### 1. **The `Column` Layout**
Everything in this app is stacked from top to bottom. I used the `Column` composable to host the image and text blocks in a vertical sequence.

### 2. **Working with Images**
I learned how to use the `Image` composable along with `painterResource`.
- `painter = painterResource(R.drawable.bg_compose_background)`: Loads the banner image from the resources folder.
- `contentDescription = null`: Used for decorative images that don't need screen reader descriptions.

### 3. **Text Styling & Formatting**
- **FontSize**: Used `24.sp` for the title to make it stand out.
- **TextAlign**: Applied `TextAlign.Justify` to the description paragraphs. This makes the text line up neatly on both the left and right sides, giving it a professional "magazine" look.

### 4. **Mastering `Modifier.padding()`**
I practiced how to create "breathable" space:
- `Modifier.padding(16.dp)`: Adds equal space around all sides.
- `Modifier.padding(start = 16.dp, end = 16.dp)`: Specifically adds space only to the left and right, keeping the text away from the screen edges.

### 5. **Externalizing Strings**
Instead of hardcoding text, I used `stringResource(R.string...)`. This is a best practice for Android development because it makes translating the app into other languages (localization) much easier later on.

---

## 🚀 How the Code is Structured

1.  **`ComposeArticleApp`**: The main "entry" function that gathers all the data (strings and images) and passes them down.
2.  **`ArticleCard`**: A private helper function that takes the data and actually builds the UI. Keeping this separate makes the code more organized.
3.  **`Preview`**: I set up a Preview function so I can see the UI changes instantly in Android Studio without needing to launch an emulator.

---

## 📸 UI Components Checklist
- [x] Full-width Header Image
- [x] Large Title (24sp)
- [x] Short Intro Paragraph
- [x] Justified Long Description
- [x] Balanced Padding

---

## 📸 Final Look
<img src="screenshots/compose_article_preview.png" width="300" />

---
*Keep Composing! Every small app is a step toward becoming a Pro Developer.* 🚀✍️