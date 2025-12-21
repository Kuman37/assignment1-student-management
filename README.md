# **Student Management System (Assignment 1)**
## **A. Project Overview**

This project is an object-oriented student management system based on Java. The main goal is to show basic Java concepts such as data types, conditions, loops, and object-oriented ideas such as encapsulation and composition. The system allows you to track the records of each student and distribute them into classes. It also performs automatic calculations for average performance and credit tracking.

## **B. Class Descriptions**
### **1. Student Class**

The Student class represents an individual student profile.

- Fields: Private fields include name, id, major, gpa, and credits to ensure data hiding .
- Constructor: Initializes the student with a name, ID, and major, setting default values of 0.0 for GPA and 0 for credits .
- Methods:
  - Getters/Setters: Provide controlled access to private fields.
  - updateGPA(double): Updates the current GPA.
  - addCredits(int): Increases total earned credits.
  - isHonors(): Returns true if the student’s GPA is 3.5 or higher.

### **2. Course Class**

The Course class demonstrates a composition relationship by managing an array of Student objects.

- Fields: Includes the course name, instructor name, and a fixed-size array for students .
- Key Logic:
  - addStudent: Inserts a student into the course at a specific index with boundary checking.
  - courseAverageGPA: Calculates the mean GPA of all students currently in the course.
  - highestCreditStudent: Identifies and returns the student with the most earned credits.

## **C. Instructions to Compile and Run**
To run this program, ensure you have the Java Development Kit (JDK) installed. Use the following commands in your terminal:
### 1. Compile all files:
```
javac src/*.java
```

### 2. Run the Main program:
```
java src.Main
```

## **D. Screenshots**
<img width="882" height="242" alt="изображение" src="https://github.com/user-attachments/assets/3bf27f9f-f697-4177-81f6-8414d1843379" />

## **E. Reflection**

Through this project, I applied the principles of Encapsulation by using access modifiers to protect student data from direct external modification.  Working with Composition helped me understand how objects interact and how one class can serve as a container for others.

One of the main challenges was ensuring proper index handling when adding students to the array.  I learned that using methods like toString() significantly improves code readability and debugging efficiency
