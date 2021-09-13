package org.example;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner askAge = new Scanner(System.in);
        System.out.println("What is your current age? ");

        String inputAgeS = askAge.nextLine();
        if(inputAgeS.isEmpty()) {
            System.out.println("Age is required!");
        }
        else {
            int inputAge = parseInt(inputAgeS);
            Scanner askRetirementAge = new Scanner(System.in);
            System.out.println("At what age would you like to retire? ");
            String inputRetirementAgeS = askRetirementAge.nextLine();
            if(inputRetirementAgeS.isEmpty()) {
                System.out.println("Retirement age is required!");
            }
            else {
                int inputRetirementAge = parseInt(inputRetirementAgeS);
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                int yearsToRetire = inputRetirementAge - inputAge;
                System.out.println("You have " + yearsToRetire + " years left until you can retire.\nIt's " + currentYear + ", so you can retire in " + (currentYear + yearsToRetire) + ".");
            }
        }
    }
}
