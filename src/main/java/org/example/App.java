package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 18 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        //variables
        double celsius = 0, fahrengeit = 0, numTemp= 0;
        int flag = 0;
        String strTemp;

        //get choice
        System.out.print(
            "Press C to convert from Fahrenheit to Celsius.\n" +
            "Press F to convert from Celsius to Fahrenheit.\n" +
            "Your choice: "
        );
        String strChoice = input.nextLine();

            //celsius conditional
            if (strChoice.contains("C") || strChoice.contains("c")) {
                //get temp
                System.out.print("Please enter the temperature in Fahrenheit: ");
                strTemp = input.nextLine();
                numTemp = Double.parseDouble(strTemp);

                //math
                celsius = (numTemp -  (double) 32) * (double) 5 /  (double) 9;
                flag = 1;

            }

            //fahrenheit conditional
            if (strChoice.contains("F") || strChoice.contains("f")) {

                //get temp
                System.out.print("Please enter the temperature in Celsius: ");
                strTemp = input.nextLine();
                numTemp = Double.parseDouble(strTemp);

                //math
                fahrengeit = (numTemp * (double) 9 / (double) 5) + 32;
                flag = 2;

            }

        //print conditionally
        final String tempMain = flag == 1 ? " Celsius " : " Fahrenheit ";
        final Double tempHold = flag == 1 ? celsius : fahrengeit;
        System.out.print("The temperature in" + tempMain + "is " + Math.round(tempHold) + ".");

    }
}
