

import java.util.Scanner;

public class WonderlandEscape {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        boolean hasKey = false;
        int currentRoom = 0;
        boolean gameRunning = true;

        System.out.println("Welcome!"); // add some text???
        System.out.println("Make choices carefully or you might lose health");

        while (gameRunning) {
            switch (currentRoom) {
                case 0:
                    System.out.println("\n--- Room 0: Library ---");
                    System.out.println("You see a table with a cake labeled 'Eat Me' and a bottle labeled 'Drink Me'.");
                    System.out.println("What do you do?");
                    System.out.println("1: Eat the cake");
                    System.out.println("2: Drink the bottle");
                    System.out.println("3: Ignore and look around");

                    System.out.print("Enter your choice (1-3): ");
                    String choice = scanner.nextLine().trim();

                    if (choice.equals("1")) {
                        System.out.println("You eat the cake. Strange! But you feel ready to explore further.");
                        hasKey = true; // optional: get smaller for the next room ??
                        currentRoom = 1; // move to room 1
                    } else if (choice.equals("2")) {
                        System.out.println("You drink the bottle. Weird feeling, but you can move on.");
                        currentRoom = 1;
                    } else if (choice.equals("3")) {
                        System.out.println("You stay in the library. Nothing happens, you decide to move on anyway.");
                        currentRoom = 1;
                    } else {
                        System.out.println("Are you trying to break the game?... Try again, please, your choise is invalid");
                    }
                    break;

                // Future rooms_??
                case 1:
                    System.out.println("\n--- Room 1: Sea of Tears ---");
                    // placeholder for next room ???
                    gameRunning = false; // pause ??
                    break;
            }
        }

        System.out.println("\nGame over. Thanks for playing!");
        scanner.close();
    }
}
