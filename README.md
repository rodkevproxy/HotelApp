# Hotel Room Manager

## Description
This repository contains a Java-based console application designed to manage hotel room occupancy and guest records[cite: 1]. The application was built as the final lab-based assessment for the university module "4COSC005W - Software Development II"[cite: 1]. It features an interactive command-line interface that allows a user to perform basic hotel administration tasks[cite: 1].

## Features
* **Interactive Menu**: An easy-to-navigate main menu running on a continuous loop until the user chooses to quit[cite: 1].
* **Room Management**: The hotel is represented by a 2D array simulating 4 floors with varying capacities (20, 25, 15, and 20 rooms respectively)[cite: 1].
* **Check-In/Check-Out System**: Users can assign or free up specific rooms by entering floor and room numbers[cite: 1]. 
* **Input Validation**: The check-in and check-out processes include `while` loops to ensure the user enters valid room and floor ranges[cite: 1].
* **Visual Availability Tracker**: Prints a graphical representation of the hotel to the console, using `[O]` for available rooms and `[X]` for occupied rooms[cite: 1].
* **Guest Records**: The application includes a dedicated system to add and track up to 200 individual guest profiles[cite: 1]. 
* **Guest Details**: The system records each guest's name, surname, and the number of nights they stayed[cite: 2].

## Project Structure
The project is built within the `com.mycompany.hotelapp` package and consists of two main classes[cite: 1, 2]:

* `App.java`: The primary class containing the `main` method, the scanner for user input, the 2D `rooms` array, and the `guests` array[cite: 1]. This file handles the logic for the main menu, room allocation, and input validation[cite: 1].
* `Guest.java`: An object class representing a hotel guest[cite: 2]. It includes private variables for the guest's name, surname, and number of nights, along with their respective getters, setters, and a method to print the guest's details[cite: 2].

## Author
* **Name:** Kevin Rodas[cite: 1]
* **Student ID:** w2151939[cite: 1]
