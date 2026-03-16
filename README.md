# 🎯 Java Quiz Game

A **console-based quiz application built in Java** that tests users across multiple categories such as **Computer Science, General Knowledge, and Science**.
The program presents multiple-choice questions, checks answers, tracks the score, and displays the final result with a performance rating.

---

# 📌 Features

* 🧠 Multiple categories of questions
* 📊 Automatic score calculation
* ❌ Handles wrong and correct answers
* 🧾 Displays final percentage
* ⭐ Performance rating system
* 🔒 Input validation for user answers
* 🧩 Object-Oriented Programming design

---

# 🏗 Project Structure

```
Java-Quiz-Game/
│
├── QuizGame.java        # Main class (program entry point)
├── Question.java      # Handles question data and logic
├── Quiz.java          # Controls quiz flow and scoring
├── QuizCategory.java  # Optional category grouping
└── README.md
```

---

# 🧠 Concepts Used

This project demonstrates several **Java programming concepts**:

* Classes and Objects
* Encapsulation
* Constructors
* Lists (`ArrayList`)
* Input handling with `Scanner`
* Loops and conditionals
* Basic error handling
* Modular program design

---

# ▶️ How to Run the Program

## 1️⃣ Compile the Program

Open a terminal in the project folder and run:

```bash
javac QuizGame.java
```

## 2️⃣ Run the Program

```bash
java QuizGame
```

---

# 🎮 How the Quiz Works

1. The program displays a **welcome screen**.
2. Each question is shown with **4 options**.
3. The user enters an answer between **1 and 4**.
4. The program checks whether the answer is correct.
5. After all questions are answered:

   * Final score is shown
   * Percentage is calculated
   * Performance rating is displayed.

---

# 🏆 Example Output

```
Welcome to Java Quiz Game!

--- Question 1 of 20 ---
What is the main function of a router?

1. Store files
2. Encrypt data
3. Direct network traffic
4. Process data

Enter your answer (1-4): 3

*****CORRECT*****
```

---

# 📊 Performance Rating System

| Score     | Rating            |
| --------- | ----------------- |
| 90%+      | Excellent 🌟      |
| 70%+      | Good 👍           |
| 50%+      | Fair 📚           |
| Below 50% | Needs Practice 💪 |

---

# 🚀 Possible Improvements

Future enhancements could include:

* 🎲 Randomized questions
* 🗂 Category selection
* ⏱ Timed quiz mode
* 📁 Load questions from a file or database
* 🖥 GUI version using Java Swing or JavaFX
* 🌐 Web version with Java backend

---

# 👨‍💻 Author

Gorogodo Takunda Leonard

Created as a **Java learning project** to practice Object-Oriented Programming and console application development.

---

# 📜 License

This project is open-source and free to use for learning purposes.
