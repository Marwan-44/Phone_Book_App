# 📒 Contact Manager App (Kotlin Console)

A simple **phone contact management system** built using Kotlin.  
This project simulates a basic phonebook where users can store, search, delete, and display contacts.

---

## 🚀 Overview

This app is a menu-driven console program that allows users to manage contacts efficiently using a `MutableMap`.

Each contact consists of:
- 👤 Name
- 📞 Phone Number

---

## ⚙️ Features

✔ Add new contact  
✔ Search contact by name  
✔ Search contact by phone number  
✔ Delete contact by name  
✔ Display all contacts  
✔ Simple interactive menu  

---

## 🧠 How It Works

The program stores data using:

```kotlin id="contact_map"
val contact = mutableMapOf<String, Int>()
````

* Key → Contact Name
* Value → Phone Number

---

## 📂 Project Structure
```
src/
 └── ContactManager.kt
   id="structure_01"
```
---

## 🧪 Example Menu

```
Choose option:
1 -> Add
2 -> Search
3 -> Delete
4 -> Show
5 -> Exit

```

---

## 🔍 Search Options

- Search by **name**
- Search by **number**

---

## 🛠️ Technologies Used

- Kotlin (JVM)
- Mutable Maps
- Loops & Conditions
- Console Input/Output
- Basic search algorithms

---

## 🚀 Future Improvements

- Save contacts permanently (file/database)
- Add contact validation (duplicate check)
- Add sorting (A-Z)
- Convert to Android app 📱

---

## 👨‍💻 Author

Built by Marwan 🚀  
Aspiring Android Developer
