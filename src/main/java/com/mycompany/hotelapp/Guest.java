/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelapp;

/**
 *
 * @author w2151939
 */
public class Guest {
    private String name;
    private String surname;
    private int numberOfNights;
    
    
    public Guest (String name, String surname, int numberOfNights){
        this.surname = surname;
        this.name = name;
        this.numberOfNights = numberOfNights;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public int getNumberOfNigths(){
    return numberOfNights;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setNumberOfNigths(int numberOfNights){
    this.numberOfNights = numberOfNights;
    }
    
    public void printGuest(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Number of nights " + this.numberOfNights);
    }
    
    
    
    
}
