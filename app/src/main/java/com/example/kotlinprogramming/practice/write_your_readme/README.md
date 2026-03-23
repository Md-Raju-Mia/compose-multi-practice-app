# 📘 README.md Writing Cheat Sheet (Markdown Guide)

This guide helps you write and format a clean and professional README file using Markdown.

---

# 🧱 1. Headings (Title & Sections)

```md
# Main Title
## Section Title
### Sub Section
#### Smaller Section
```

👉 Example:

# Main Title

## Section

### Sub Section

---

# ✍️ 2. Text Formatting

```md
**Bold text**
*Italic text*
~~Strikethrough~~
```

👉 Example:
**Bold**
*Italic*
~~Removed~~

---

# 📋 3. Lists

## 🔹 Unordered List

```md
- Item 1
- Item 2
  - Sub item
```

👉 Result:

* Item 1
* Item 2

    * Sub item

---

## 🔹 Ordered List

```md
1. First
2. Second
3. Third
```

👉 Result:

1. First
2. Second
3. Third

---

# 🔗 4. Links

```md
[Link text](https://example.com)
```

👉 Example:
[Google](https://google.com)

---

# 🖼️ 5. Images

```md
![Alt text](image_url)
```

👉 Example:
![Sample](https://via.placeholder.com/150)

---

# 💻 6. Code Blocks

## 🔹 Inline Code

```md
Use `Column()` in Compose
```

👉 Result:
Use `Column()` in Compose

---

## 🔹 Code Block

````md
```kotlin
fun main() {
    println("Hello")
}
```
````

👉 Result:

```kotlin
fun main() {
    println("Hello")
}
```

---

# 📦 7. Blockquote

```md
> This is a note
```

👉 Result:

> This is a note

---

# 📊 8. Table

```md
| Name | Age |
|------|-----|
| Raju | 22  |
```

👉 Result:

| Name | Age |
| ---- | --- |
| Raju | 22  |

---

# ➖ 9. Divider (Line)

```md
---
```

## 👉 Result:

---

# 📌 10. Checklist

```md
- [x] Done
- [ ] Not Done
```

👉 Result:

* [x] Done
* [ ] Not Done

---

# 🧠 11. Section Structure (Best Practice)

````md
# Project Name

## 📌 Description
Short explanation of project

## 🚀 Features
- Feature 1
- Feature 2

## 📂 Project Structure
- folder1
- folder2

## 💻 Code Example
```kotlin
// example
````
# 🖼️ 12. Adding Screenshots (Step-by-Step)
To add a screenshot to your project and display it in your `README.md`, follow these steps:
### Step 1: Create a Folder
Switch to the **Project** view in Android Studio and create a folder named `screenshots` (e.g., at the root of your package or project).
### Step 2: Add your Image
Paste your screenshot image into that folder (e.g., `preview.png`).
### Step 3: Use the Markdown Syntax
Use the following syntax to display the image. **Note the `!` at the beginning.**
```md
![Alt Text](path_to_image)
 ```
### Step 4: Handle Relative Paths
If your `README.md` and `screenshots` folder are in different locations, you need to navigate the directory tree:
- Same folder: `![Preview](./preview.png)`
- Folder inside current directory: `![Preview](./screenshots/preview.png)`
- Folder two levels up: `![Preview](../../screenshots/preview.png)`
---


# 🖼️ 13. Adding & Resizing Screenshots
To add a screenshot to your project and control its size, use **HTML `<img>` tags** instead of standard Markdown.

### Step 1: Create a Folder
Create a folder named `screenshots` at the root of your package or project.

### Step 2: Add your Image
Paste your screenshot image into that folder (e.g., `preview.png`).

### Step 3: Use the HTML Syntax for Resizing
Standard Markdown `![Alt]()` does not support resizing. Use this instead:

 ```html
 <img src="path_to_image" width="300" />
 ```

- **width**: Adjust the number (e.g., 200, 300, 500) to change the size.
- **height**: (Optional) You can also set `height="600"`, but usually setting just `width` is better to keep the aspect ratio.

### Step 4: Handle Relative Paths
- Same folder: `<img src="./preview.png" width="300" />`
- Folder inside current directory: `<img src="./screenshots/preview.png" width="300" />`
- Folder two levels up: `<img src="../../screenshots/preview.png" width="300" />`
---

## 🛠 Tech Stack

* Kotlin
* Jetpack Compose

## 📚 Learning

What you learned

## 👨‍💻 Author

Your name

````

---

# ⚠️ Common Mistakes

❌ Missing closing ```
❌ Writing ```markdown unnecessarily  
❌ No spacing between sections  
❌ No headings (everything in one paragraph)

---

# 🎯 Pro Tips

✔ Use emoji for readability  
✔ Keep sections short  
✔ Use code blocks for examples  
✔ Use bullet points instead of long text  

---

# 🔥 Final Tip

👉 README = First impression of your project  
👉 Keep it clean, simple, structured

---
````

