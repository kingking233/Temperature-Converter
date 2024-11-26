import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Convention convention = new Convention();
        Scanner scanner = new Scanner(System.in); // Use a single scanner object
        System.out.println("Temperature Converter");

        while (true) {
            System.out.println("Input your number:");
            double temperatureNumber = scanner.nextDouble();

            System.out.println("What unit are you converting from? (1: C, 2: K, 3: F)");
            int initialUnitInput = scanner.nextInt();

            System.out.println("What unit are you converting to? (1: C, 2: K, 3: F)");
            int finalUnitInput = scanner.nextInt();

            // Perform conversion based on user input
            if (initialUnitInput == 1) { // From Celsius
                switch (finalUnitInput) {
                    case 1:
                        System.out.println(temperatureNumber + " C");
                        break;
                    case 2:
                        System.out.println(convention.degreeToKelvin(temperatureNumber) + " K");
                        break;
                    case 3:
                        System.out.println(convention.degreeToFahrenheit(temperatureNumber) + " F");
                        break;
                    default:
                        System.out.println("Invalid unit choice!");
                }
            } else if (initialUnitInput == 2) { // From Kelvin
                switch (finalUnitInput) {
                    case 1:
                        System.out.println(convention.kelvinToDegree(temperatureNumber) + " C");
                        break;
                    case 2:
                        System.out.println(temperatureNumber + " K");
                        break;
                    case 3:
                        System.out.println(convention.kelvinToFahrenheit(temperatureNumber) + " F");
                        break;
                    default:
                        System.out.println("Invalid unit choice!");
                }
            } else if (initialUnitInput == 3) { // From Fahrenheit
                switch (finalUnitInput) {
                    case 1:
                        System.out.println(convention.FahrenheitToDegree(temperatureNumber) + " C");
                        break;
                    case 2:
                        System.out.println(convention.FahrenheitToKelvin(temperatureNumber) + " K");
                        break;
                    case 3:
                        System.out.println(temperatureNumber + " F");
                        break;
                    default:
                        System.out.println("Invalid unit choice!");
                }
            } else {
                System.out.println("Invalid input unit!");
            }

            // Ask user if they want to end the program
            System.out.println("Enter 1 to end or any other number to continue:");
            int endChoice = scanner.nextInt();
            if (endChoice == 1) {
                System.out.println("Goodbye!");
                break; // Exit the loop
            }
        }

        scanner.close(); // Close the scanner when done
    }
}
