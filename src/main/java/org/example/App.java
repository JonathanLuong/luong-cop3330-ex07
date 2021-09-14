package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in); // Creates reader

        final float conv = 0.09290304f; // Const for conversion factor

        System.out.println( "What is the length of the room in feet?" );
        String len = reader.nextLine();

        System.out.println( "What is the width of the room in feet?" );
        String wid = reader.nextLine();

        System.out.println("You entered dimensions of " + len + " feet by " + wid + " feet.");

        int f1 = Integer.parseInt(len);
        int f2 = Integer.parseInt(wid);
        int area = f1 * f2;
        float meter = conv * area;


        System.out.println("The area is \n" + area + " square feet");
        System.out.printf("%.3f" + " square meters", meter); // Formats the float to the third decimal place
    }
}