import java.util.Scanner;

public class EarthquakeCategorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the EarthquakeCategorizer");
        System.out.println("Please enter the magnitude of the Earthquake: ");
        double userInput = input.nextDouble();

        String magnitude = (userInput < 2.0) ? "Micro"
                : (userInput >= 2.0 && userInput < 4.0) ? "Minor"
                : (userInput >= 4.00 && userInput < 5.0) ? "Moderatet"
                : (userInput >= 5.00 && userInput < 6.0) ? "Moderate"
                : (userInput >= 6.00 && userInput < 7.0) ? "Strong"
                : (userInput >= 7.00 && userInput < 8.0) ? "Major"

        switch (magnitude) {
            case "Micro":
                System.out.println("Earthquake detected: Minor");
                break;
            case "Minor":
                System.out.println("Earthquake detected: Minor");
                break;
            case "Light":
                System.out.println("Earthquake detected: Light");
                break;
            case "Moderate":
                System.out.println("TEarthquake detected: Moderate");
                break;
            case "Strong":
                System.out.println("Earthquake detected: Strong");
                break;
            case "Major":
                System.out.println("Earthquake detected: Major");
                break;
            default:
                System.out.println("Error in calculation, please try again.");
        }

    }
}
