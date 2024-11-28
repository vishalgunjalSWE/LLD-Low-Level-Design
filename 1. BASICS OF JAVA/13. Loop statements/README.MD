# Loop Statements in Java

This contains a Java program demonstrating three fundamental types of loop statements: `for`, `while`, and `do-while`. Loops are an essential part of programming, enabling repetitive execution of code based on conditions. Understanding these constructs is crucial for building efficient and maintainable programs.

---

## Table of Contents

1. [Overview](#overview)
2. [Features](#features)
3. [Code Explanation](#code-explanation)
4. [How to Run the Program](#how-to-run-the-program)
5. [Detailed Walkthrough](#detailed-walkthrough)
6. [Further Reading](#further-reading)

---

## Overview

This program showcases how to:

- Use a **`for` loop** to iterate over a range of values.
- Implement a **`while` loop** for condition-based iteration.
- Utilize a **`do-while` loop** for at least one guaranteed execution, even if the condition evaluates to false initially.

The program incorporates real-world examples, making it easier to understand the use cases for each loop type.

---

## Features

- **Interactive Input**: Prompts the user for input to calculate the factorial of a number.
- **Simple Examples**:
  - **`for` loop**: Printing numbers sequentially.
  - **`while` loop**: Calculating the factorial of a number.
  - **`do-while` loop**: Printing even numbers within a range.
- **Clean Output**: Organized and easy-to-read console output.

---

## Code Explanation

Below is a quick summary of what each part of the program does:

1. **`for` Loop**:
   - Prints numbers from `1` to `5`.
   - Demonstrates basic iteration over a fixed range.

2. **`while` Loop**:
   - Calculates the factorial of a user-input number.
   - Stops execution once the condition (`counter <= number`) is no longer true.

3. **`do-while` Loop**:
   - Prints even numbers between `2` and `10`.
   - Ensures the block of code executes at least once, even if the condition is initially false.

---

## Detailed Walkthrough

### 1. **For Loop**

```java
System.out.println("Using for loop:");
for (int i = 1; i <= 5; i++) {
    System.out.print(i + " ");
}
System.out.println(); // Move to the next line
```

- **Purpose**: Iterates through numbers from `1` to `5`.
- **Explanation**:
  - `int i = 1`: Initializes the loop variable.
  - `i <= 5`: Condition to run the loop.
  - `i++`: Increments the loop variable after each iteration.

**Output**:
```
Using for loop:
1 2 3 4 5
```

---

### 2. **While Loop**

```java
System.out.print("Enter a number to calculate its factorial: ");
int number = scanner.nextInt();
int factorial = 1;
int counter = 1;

System.out.println("Using while loop:");
while (counter <= number) {
    factorial *= counter;
    counter++;
}
System.out.println("Factorial of " + number + " is: " + factorial);
```

- **Purpose**: Calculates the factorial of a given number.
- **Explanation**:
  - User inputs a number (e.g., `5`).
  - Multiplies `factorial` by `counter` until `counter` exceeds `number`.

**Example Input**: `5`  
**Output**:
```
Enter a number to calculate its factorial: 5
Using while loop:
Factorial of 5 is: 120
```

---

### 3. **Do-While Loop**

```java
int evenNumber = 2;
System.out.println("Using do-while loop:");
do {
    System.out.print(evenNumber + " ");
    evenNumber += 2;
} while (evenNumber <= 10);
```

- **Purpose**: Prints even numbers from `2` to `10`.
- **Explanation**:
  - The block executes at least once, even if the condition evaluates to false initially.
  - Adds `2` to `evenNumber` in each iteration.

**Output**:
```
Using do-while loop:
2 4 6 8 10
```

---

## Further Reading

To deepen your understanding of loop constructs in Java, explore the following resources:

- [Official Java Documentation - Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Loops in Java - GeeksforGeeks](https://www.geeksforgeeks.org/loops-in-java/)
- [Java Programming Basics](https://www.w3schools.com/java/)

---

By understanding these loops, you'll be well-equipped to handle repetitive tasks in Java efficiently. Happy coding! 🚀