# Tower Program

This program provides functionality to calculate the area and perimeter of rectangular towers and to print triangular towers.

## Table of Contents
1. [Introduction](#introduction)
2. [RectangularTower Class](#rectangulartower-class)
3. [TriangleTower Class](#triangletower-class)
4. [Main Class](#main-class)
5. [How to Use](#how-to-use)
6. [Dependencies](#dependencies)
7. [Examples](#examples)

## Introduction
This Java program consists of three classes: `Tower`, `RectangularTower`, and `TriangleTower`. 
The `Tower` class is an abstract base class for towers, providing methods to calculate area and perimeter. 
The `RectangularTower` class extends `Tower` and calculates either the area or the perimeter based on certain conditions. 
The `TriangleTower` class also extends `Tower` and allows the user to choose between calculating the perimeter or printing a triangular tower. 
The `Main` class serves as the entry point to the program, allowing users to interact with the tower functionalities.

## RectangularTower Class
- This class extends the abstract `Tower` class.
- It calculates either the area or the perimeter of a rectangular tower based on the width and height provided.
- If the width and height are equal or their difference is greater than 5, the perimeter is calculated; otherwise, the area is calculated.
- If the perimeter is calculated, it is printed; otherwise, the area is printed.

## TriangleTower Class
- This class extends the abstract `Tower` class.
- It allows the user to choose between calculating the perimeter of a triangle tower or printing the tower.
- The perimeter is calculated using the Pythagorean theorem.
- The printing functionality prints a triangular tower based on the width and height provided.
- The triangular tower is printed with asterisks (*) in a specific pattern.

## Main Class
- This class serves as the entry point to the program.
- It prompts the user to choose between a rectangular tower, a triangular tower, or exiting the program.
- Users can input the width and height of the tower they want to create.
- Based on the user's choice, either a `RectangularTower` or a `TriangleTower` object is created and appropriate actions are taken.
- The program continues to run until the user chooses to exit.

## How to Use
1. Compile the Java files: `javac Main.java`
2. Run the compiled program: `java Main`
3. Follow the on-screen instructions to choose between a rectangular tower, a triangular tower, or exiting the program.
4. If choosing a rectangular tower, provide the width and height as prompted.
5. If choosing a triangular tower, provide the width and height as prompted, then choose between calculating the perimeter or printing the tower.
6. Follow the on-screen instructions until you choose to exit the program.

## Dependencies
- Java SE Development Kit (JDK) installed on your system.
- A Java compiler to compile the source code.
- Standard Input/Output for user interaction.

  ## Examples
  ![image](https://github.com/ReutShilony/TwiterTowers/assets/164930346/b946be91-fb33-4881-81ca-d4109db629b0)
  ![image](https://github.com/ReutShilony/TwiterTowers/assets/164930346/45f8ed5d-39a9-4bc1-ab16-5d90d0048e0b)

  ![image](https://github.com/ReutShilony/TwiterTowers/assets/164930346/056d0ffd-6977-4031-bbf5-e07927f345fb)
  ![image](https://github.com/ReutShilony/TwiterTowers/assets/164930346/3ce850a5-0b68-42c5-9d55-bc12796b89b5)





