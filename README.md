# 📦 Java OOP Shop (Base)

A simple Java console application that models products in a shop using basic Object-Oriented Programming principles.

## 🚀 Features

- Defines a `Prodotto` class with attributes:
  - Product code (randomly generated)
  - Name
  - Description
  - Price (base and with VAT)
- Includes methods to:
  - Get the base price
  - Calculate the price with VAT
  - Generate an extended name with code and name
- Demonstrates usage in the `Main` class

## 📁 Project Structure

```
java-oop-shop-base/
├── src/
│   ├── org/
│   │   └── lessons/
│   │       └── java/
│   │            └── shop/
│   │                ├── Prodotto.java
│   │                └── Main.java
├── README.md
```

## ⚙️ How to Compile and Run

1️⃣ **Compile**

```bash
cd src
javac org/lessons/java/shop/Prodotto.java
javac org/lessons/java/shop/Main.java
```

2️⃣ **Run**

```bash
java org.lessons.java.shop.Main
```

## 📌 Example Output

```plaintext
16.0 #price
19.2 #price with iva
23-Monopoly #code + name
```

(Note: The product code is randomly generated and will vary each time you run the program.)

## Author

[@Mattia Zecchinato](https://www.github.com/MattiaZecchinato)
