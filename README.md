# 📦 Java OOP Shop (Base)

A simple Java console application that models products in a shop using basic Object-Oriented Programming principles.

## 🚀 Features

- Defines a `Prodotto` class with:
  - Private fields: `code`, `name`, `description`, `price`, and `iva`
  - Getters and setters for controlled access to fields
  - Constructor overload for default and custom initialization
  - Methods to:
    - Retrieve base price and price with VAT
    - Generate an extended product name with code and name
- Demonstrates usage in the `Main` class with multiple product instances

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
16.0                   # base price
19.2                   # price with VAT
23-Monopoly            # extended name
```

(Note: The product code is randomly generated and will vary each time you run the program.)

## 👨‍💻 Author

[@Mattia Zecchinato](https://www.github.com/MattiaZecchinato)
