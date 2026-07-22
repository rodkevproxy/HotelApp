# Hotel Room Manager


![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status: Completed](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![Module: Software Dev II](https://img.shields.io/badge/Module-Software_Dev_II-blue?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/rodkevproxy/HotelApp?style=for-the-badge)
## Description
This repository contains a Java-based console application designed to manage hotel room occupancy and guest records. The application was built as the final lab-based assessment for the university module "4COSC005W - Software Development II". It features an interactive command-line interface that allows a user to perform basic hotel administration tasks.

## Features
* **Interactive Menu**: An easy-to-navigate main menu running on a continuous loop until the user chooses to quit.
* **Room Management**: The hotel is represented by a 2D array simulating 4 floors with varying capacities (20, 25, 15, and 20 rooms respectively).
* **Check-In/Check-Out System**: Users can assign or free up specific rooms by entering floor and room numbers. 
* **Input Validation**: The check-in and check-out processes include `while` loops to ensure the user enters valid room and floor ranges.
* **Visual Availability Tracker**: Prints a graphical representation of the hotel to the console, using `[O]` for available rooms and `[X]` for occupied rooms.
* **Guest Records**: The application includes a dedicated system to add and track up to 200 individual guest profiles. 
* **Guest Details**: The system records each guest's name, surname, and the number of nights they stayed.

## Project Structure
The project is built within the `com.mycompany.hotelapp` package and consists of two main classes:

* `App.java`: The primary class containing the `main` method, the scanner for user input, the 2D `rooms` array, and the `guests` array. This file handles the logic for the main menu, room allocation, and input validation.
* `Guest.java`: An object class representing a hotel guest. It includes private variables for the guest's name, surname, and number of nights, along with their respective getters, setters, and a method to print the guest's details.

## Author
* **Name:** Kevin Rodas

