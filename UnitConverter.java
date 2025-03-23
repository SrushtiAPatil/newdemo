

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nUnit Converter");
            System.out.println("1. Temperature Conversion");
            System.out.println("2. Length Conversion");
            System.out.println("3. Weight Conversion");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> convertTemperature(scanner);
                case 2 -> convertLength(scanner);
                case 3 -> convertWeight(scanner);
                case 4 -> {
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void convertTemperature(Scanner scanner) {
        System.out.println("\nTemperature Conversion");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        if (choice == 1) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
        } else if (choice == 2) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private static void convertLength(Scanner scanner) {
        System.out.println("\nLength Conversion");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        if (choice == 1) {
            double kilometers = length / 1000;
            System.out.printf("Length in Kilometers: %.2f km\n", kilometers);
        } else if (choice == 2) {
            double meters = length * 1000;
            System.out.printf("Length in Meters: %.2f m\n", meters);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private static void convertWeight(Scanner scanner) {
        System.out.println("\nWeight Conversion");
        System.out.println("1. Kilograms to Grams");
        System.out.println("2. Grams to Kilograms");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the weight: ");
        double weight = scanner.nextDouble();

        if (choice == 1) {
            double grams = weight * 1000;
            System.out.printf("Weight in Grams: %.2f g\n", grams);
        } else if (choice == 2) {
            double kilograms = weight / 1000;
            System.out.printf("Weight in Kilograms: %.2f kg\n", kilograms);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
