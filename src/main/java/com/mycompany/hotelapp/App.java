/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hotelapp;

import java.util.Scanner;


/**
 * 4COSC005W - Software Development II Lab-based assessment - HotelApp
 * (Template)
 *
 * Before you start, complete the following information: 
 * NAME: Kevin
 * SURNAME: Rodas
 * STUDENT ID: w2151939
 *
 * IMPORTANT: - Do not use external websites / AI tools during the assessment -
 * This project is intentionally incomplete; Follow your task sheet.
 *
 */
public class App {

    // Global Scanner
    private static Scanner input = new Scanner(System.in);
    private static Guest[] guests = new Guest [200];
    private static int guestCounter = 0;

    // Global 2D array for hotel rooms
    // 0 = Available, 1 = Occupied
    private static int[][] rooms;

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("            HOTEL ROOM MANAGER");
        System.out.println("==================================================");
        System.out.println(" Welcome to the Hotel Room Manager");
        System.out.println(" Manage room occupancy and guest records");
        System.out.println("==================================================");

        initialiseRooms();
        runMenu();
    }

    public static void initialiseRooms() {

        rooms = new int[4][]; // 4 floors

        rooms[0] = new int[20]; // Floor 1 has 20 rooms
        rooms[1] = new int[25]; // Floor 2 has 25 rooms
        rooms[2] = new int[15]; // Floor 3 has 15 rooms
        rooms[3] = new int[20]; // Floor 4 has 20 rooms
        

        // All rooms are automatically initialised to 0 (available)
    }

    public static void runMenu() {

        int option;

        do {
            option = getOption();

            switch (option) {
                case 1:
                    checkInGuest();
                    break;

                case 2:
                    checkOutGuest();
                    break;

                case 3:
                    showRooms();
                    break;
                    
                case 4:
                    addGuest();
                    break;

                case 0:
                    System.out.println("Thank you for using Hotel Room Manager.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 0);
    }

    public static int getOption() {

        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.println("|              MAIN MENU               |");
        System.out.println("+--------------------------------------+");
        System.out.println("| 1) Check in guest                    |");
        System.out.println("| 2) Check out guest                   |");
        System.out.println("| 3) Show room availability            |");
        System.out.println("| 4) Add guest                         |");
        System.out.println("| 0) Quit                              |");
        System.out.println("+--------------------------------------+");
        System.out.print("Please select an option: ");

        return input.nextInt();
    }

public static void checkInGuest() {
    
    System.out.print("Enter floor number: ");
    int floorNumber = input.nextInt() - 1;

     
    while (floorNumber < 0 || floorNumber >= rooms.length){
      System.out.println("The floor number should be from 1 to 4");
      floorNumber = input.nextInt() - 1;

    }
     
    System.out.print("Enter room number: ");
    int roomNumber = input.nextInt() - 1;

     
     while (roomNumber < 0 || roomNumber >= rooms[floorNumber].length){
      System.out.println("The room number should be from 1 to " + rooms[floorNumber].length);
      roomNumber = input.nextInt() - 1;

     }

    int floorIndex = floorNumber;
    int roomIndex = roomNumber;

     

    //Here i had a bit of a throuble managing the values as the given code includes index variables 

    //that were taking - 1 from the value that the user would enter, this means that if use the following

    // int roomNumber/floorNumber = input.nextInt() - 1;. My final value would be 1 integer below what i 

    //should be, to fix this i removed the "- 1" from the declarations of the floorIndex/roomIndex and moved it,

    //to the variable roomNumber/floorNumber this way i can use the same value for my 

    //array and for the variables roomIndex and floorIndex

    if (rooms[floorIndex][roomIndex] == 0) {
      rooms[floorIndex][roomIndex] = 1;
      System.out.println("Check-in successful.");
    } else {
      System.out.println("Room already occupied.");
    }

  }



    public static void checkOutGuest() {

       System.out.print("Enter floor number: ");
        int floorNumber = input.nextInt() - 1;
        
        while (floorNumber < 0 || floorNumber >= rooms.length){
            System.out.println("The floor number should be from 1 to 4");
            floorNumber = input.nextInt() - 1;
        }
        

        System.out.print("Enter room number: ");
        int roomNumber = input.nextInt() - 1;
        
         while (roomNumber < 0 || roomNumber >= rooms[floorNumber].length){
            System.out.println("The room number should be from 1 to " + rooms[floorNumber].length);
            roomNumber = input.nextInt() - 1;
         }
        
         
         
         
        int floorIndex = floorNumber;
        int roomIndex = roomNumber;
        
        //also added this validation method in the checkOut section as the same logic applies here
        //During the test i asked the teacher if i was allowed to use 0 on my while loop, he agreed
        
        if (rooms[floorIndex][roomIndex] == 1) {
            rooms[floorIndex][roomIndex] = 0;
            System.out.println("Check-out successful.");
        } else {
            System.out.println("Room already available.");
        }
    }

    public static void showRooms() {

        System.out.println();
        System.out.println("==================================================");
        System.out.println("HOTEL ROOM STATUS");
        System.out.println("==================================================");
        System.out.println("LEGEND: [O] = Available, [X] = Occupied");
        System.out.println("--------------------------------------------------");

        for (int floor = 0; floor < rooms.length; floor++) {

            System.out.print("Floor " + (floor + 1) + " ");

            for (int room = 0; room < rooms[floor].length; room++) {

                if (rooms[floor][room] == 0) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[X]");
                }
            }

            System.out.println();
        }

        System.out.println("==================================================");
    }
    
    
    public static void addGuest(){
        System.out.println("Enter your name: ");
        String name = input.next();
        
        System.out.println("Enter your surname: ");
        String surname = input.next();
        
        System.out.println("Enter the amount of nights you stayed at the hotel");
        int numberOfNigths = input.nextInt();
        
        if (guestCounter == 200){
            System.out.println("This array is full");
        }else{
        Guest guest = new Guest (name, surname, numberOfNigths);
        guests[guestCounter] = guest;
        guestCounter ++; 
        
            System.out.println("You have been added ");
            
        }
        
        // here i added a guest counter to keep track of many objects have been introduced inside the   
        // guests array, this way i can use a if statement to inform the user when the array is full.
        //Also i implemented a final message to let the user now that he has been added.
        
        
        
        
        
        
        
        
    }

}
