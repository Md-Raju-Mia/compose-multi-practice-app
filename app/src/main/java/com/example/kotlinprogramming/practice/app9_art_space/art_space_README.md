# Art Space App 🎨

## What is this app?
Art Space is a simple digital gallery. It lets you browse through different pictures (artworks) by clicking "Next" or "Previous" buttons. It's built using **Jetpack Compose**, which is the modern way to make Android apps.

---

## 💡 What I Learned (In Simple Words)

To build this app, I used several key "tools" from Jetpack Compose. Here is what they are and why they are useful:

### 1. The App's Memory (**State**)
*   **`mutableIntStateOf`**: This is like a small notebook where the app writes down which picture it is currently showing. 
*   **`remember`**: This tells the app, "Don't forget what's in your notebook even if you have to refresh the screen." Without this, the app would reset to the first picture every time you tilt the phone!

### 2. Making Decisions (**When**)
*   **`when` statement**: This is the app's brain. It looks at the number in its "notebook" (the State) and says: *"If the number is 1, show the Lemon Tree. If it's 2, show the Squeeze picture."*

### 3. Building Blocks (**Layouts**)
*   **`Column`**: Stacks items on top of each other (Top to Bottom).
*   **`Row`**: Places items side-by-side (Left to Right) — used for the buttons.
*   **`Box`**: A container that lets you put things on top of each other (like putting a picture inside a frame).

### 4. Customizing Items (**Modifiers**)
*   **`Modifier.weight(1f)`**: This tells a component (like the image) to take up all the "extra" space available. It makes sure the image is big while the buttons stay at the bottom.
*   **`safeDrawingPadding()`**: This is like a safety zone. It prevents your app's content from being hidden behind the phone's camera hole or the status bar at the top.
*   **`padding`**: Adds "breathing room" or empty space around an element so it doesn't look crowded.

### 5. Stylish Containers (**Cards**)
*   **`Card`**: This gives the UI a "physical" look. It adds rounded corners and a slight shadow (elevation) to make the artwork look like it's sitting on a real gallery wall.

---

## 📱 How the App Looks

The app has a clean design with a large area for the art, a dedicated info box for the title/artist, and easy-to-use navigation buttons.

| Art Space Preview |
| :---: |
| <img src="screenshots/art_space_preview.png" width="300" alt="Art Space App Preview" /> |

---

## 🚀 Key Features
*   **Interactive Buttons:** Tap "Next" or "Previous" to cycle through the gallery.
*   **Smart Looping:** When you reach the last picture and click "Next," it goes back to the first one automatically.
*   **Responsive:** The image shrinks or grows to fit your screen perfectly using `ContentScale.Fit`.

---
*Created with ❤️ while learning Android Development.*
