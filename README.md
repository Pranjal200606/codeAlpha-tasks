# CodeAlpha Java Internship Tasks

A collection of three console-based Java projects developed as part of my **CodeAlpha Java Programming Internship**. These projects demonstrate core Java concepts, object-oriented programming, collections, input validation, and basic application logic.

## Projects

### 1. Student Grade Tracker
A console application that records student names and grades, then generates a summary report.

**Features**
- Accepts the number of students, names, and grades.
- Validates grades to keep them within the range of 0–100.
- Calculates the average, highest, and lowest grade.
- Displays each student's grade in a summary report.

**Main concepts:** `ArrayList`, `Scanner`, loops, conditional statements, input validation, and basic calculations.

**Run**
```bash
javac StudentGradeTracker.java
java StudentGradeTracker
```

### 2. Hotel Reservation System
A console-based hotel booking application with sample rooms in Standard, Deluxe, and Suite categories.

**Features**
- Displays available rooms.
- Books a room for a guest.
- Prevents booking a room that is already booked.
- Cancels an existing booking.
- Displays current bookings.
- Simulates payment processing.

**Main concepts:** Classes and objects, `ArrayList`, `List`, `HashMap`, loops, methods, and switch statements.

**Run**
```bash
javac HotelReservationSystem.java
java HotelReservationSystem
```

### 3. Stock Trading Platform
A console-based stock trading simulation that lets users explore sample stocks and manage a portfolio.

**Features**
- Displays a sample stock market.
- Allows users to buy and sell shares.
- Tracks portfolio holdings.
- Uses an initial balance of $10,000.
- Provides a menu for market viewing, buying, selling, portfolio viewing, and exiting.

**Main concepts:** Classes and objects, collections, methods, loops, and conditional logic.

**Run**
```bash
javac StockTradingPlatform.java
java StockTradingPlatform
```

## Technologies Used

- Java
- Java Collections Framework (`ArrayList`, `List`, `HashMap`, and `Map`)
- Java console input/output (`Scanner` and `System.out`)
- Object-oriented programming fundamentals

## Project Structure

Keep the three Java source files in the same folder:

```text
CodeAlpha-Tasks/
├── StudentGradeTracker.java
├── HotelReservationSystem.java
├── StockTradingPlatform.java
└── README.md
```

## Prerequisites

- Install a Java Development Kit (JDK).
- Verify Java is available in your terminal:

```bash
java -version
javac -version
```

Compile and run each project from the folder containing its `.java` file, using the commands listed above.

## About

These projects were created to practise Java programming and apply core programming concepts through small, interactive console applications as part of the CodeAlpha Java Programming Internship.

---

**Author:** Pranjal Gaikwad
