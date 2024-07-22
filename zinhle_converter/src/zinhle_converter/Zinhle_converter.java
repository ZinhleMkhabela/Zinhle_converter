/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zinhle_converter;

/**
 *
 * @author CAPACITI-JHB
 */
import java.util.Scanner;

public class Zinhle_converter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Unit Converter!");
            System.out.println("Available Conversions:");
            System.out.println("1. Feet to Meters");
            System.out.println("2. Pounds to Kilograms");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("Please enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> feetToMeters();
                case 2 -> poundsToKilograms();
                case 3 -> fahrenheitToCelsius();
                default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    public static void feetToMeters() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the quantity in feet: ");
            double feet = scanner.nextDouble();
            double meters = feet * 0.3048; // 1 foot = 0.3048 meters
            System.out.println(feet + " feet is equal to " + meters + " meters.");
        }
    }

    public static void poundsToKilograms() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the quantity in pounds: ");
            double pounds = scanner.nextDouble();
            double kilograms = pounds * 0.453592; // 1 pound = 0.453592 kilograms
            System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        }
    }

    public static void fahrenheitToCelsius() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9; // Fahrenheit to Celsius conversion formula
            System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
        }
    }
}



