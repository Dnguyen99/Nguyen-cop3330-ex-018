package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        char choice = scan.next().toUpperCase().charAt(0);

        if(choice == 'C') {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double temp = scan.nextDouble();
            double result = (temp - 32) / 1.8;
            System.out.println("The temperature in Celsius is: " +result+ ".");
        }
        else {
            System.out.print("Enter the temperature in Celsius: ");
            double temp = scan.nextDouble();
            double result = (temp * 1.8) + 32;
            System.out.println("The temperature in Fahrenheit is: " +result+ ".");
        }
    }
}
