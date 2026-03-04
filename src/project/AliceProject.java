import java.util.Random;
import java.util.Scanner;

public class AliceProject {

    // Game States
    static Scanner scanner = new Scanner(System.in);
    static int health = 100;
    static boolean hasKey = false;
    static int currentRoom = 0; // 0 = Intro, 1 = Library, 2 = Sea, 3 = Maze
    static boolean gameRunning = true;

    // Library States
    static boolean isBig = false;
    static boolean isSmall = false;
    static boolean seaCreated = false;

    public static void main(String[] args) {
        while (gameRunning) {
            switch (currentRoom) {
                case 0:
                    intro();
                    break;
                case 1:
                    library();
                    break;
                case 2:
                    seaOfTears();
                    break;
                case 3:
                    maze();
                    break;
                default:
                    gameRunning = false;
                    break;
            }
        }

        System.out.println("\nGame over. Thanks for playing!");
        scanner.close();
    }

    // Little pause helper
    public static void pause() {
        System.out.print("\n>> ");
        scanner.nextLine();
    }

    // ===== INTRO =====
    public static void intro() {
        System.out.println("Important note before we begin");
        pause();

        System.out.println("Make choices carefully or you might lose health");
        pause();

        System.out.println("...");
        pause();
        System.out.println("Anyway, can you see? What's in there?");
        pause();

        System.out.println("Oh, there is a rabbit running! How cute!");
        pause();

        System.out.println("  (\\_/)");
        System.out.println("  (o.o)");
        System.out.println("  / >⌚>");

        System.out.println("He has... a clock? Is he late?");
        pause();

        System.out.println("Should we chase it?");
        pause();

        System.out.print("Enter your choice (Yes/No): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("yes")) {
            System.out.println("Oh no, you fell into a huge hole!?");
            pause();

            System.out.println("You keep falling until you land in the weird looking huge room");
            pause();

            System.out.println("It looks like a...");
            currentRoom = 1;
        } else {
            System.out.println("Where is the fun in that? Aren't you curious?");
            pause();

            System.out.println("Sorry, boredom fee");
            pause();

            health -= 100;

            System.out.println("Health: " + health);

            gameRunning = false;
        }
    }

    // ===== LIBRARY ROOM =====
    public static void library() {

        System.out.println("\n====================");
        System.out.println("      LIBRARY");
        System.out.println("====================\n");
        pause();

        boolean inLibrary = true;

        while (inLibrary) {

            // Stage 1: normal size
            if (!isBig && !isSmall) {

                System.out.println("After a quick observation you see a tiny door");
                System.out.println("There is a cake which says EAT ME and");
                System.out.println("a bottle which says DRINK ME on the table");
                pause();

                System.out.println("\nA: Eat the cake");
                System.out.println("B: Drink from the bottle");

                System.out.print("Enter your choice (A/B): ");
                String choice = scanner.nextLine().trim().toLowerCase();

                if (choice.equals("a")) {

                    System.out.println("Tastes yummy!");
                    pause();

                    System.out.println("Weird, you grow larger and larger!");
                    pause();

                    System.out.println("Up to the point that you don't fit into the room anymore!");
                    pause();

                    System.out.println("It feels so stressful that you begin crying uncontrollably");
                    pause();

                    System.out.println("Your tears flood the room");
                    pause();

                    System.out.println("♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E♒\uFE0E");
                    pause();

                    isBig = true;
                    seaCreated = true;

                } else if (choice.equals("b")) {

                    System.out.println("You drink the bottle, tastes funny");
                    pause();

                    System.out.println("You begin shrinking very quickly!");
                    pause();

                    System.out.println("Oh, feels dizzy and weak...");
                    pause();

                    health -= 15;

                    System.out.println("Health: " + health);

                    isSmall = true;

                }
            }

            // Stage 2: big
            else if (isBig && !isSmall) {

                System.out.println("\nYou are huge and sitting in a sea of your own tears");
                pause();

                System.out.println("We have to do something to make you smaller");
                pause();

                System.out.println("Maybe the potion will help?");
                pause();

                System.out.println("It couldn't get worse, right?");
                pause();

                System.out.println("You carefully drink the bottle");
                pause();

                System.out.println("You shrink back down, yay!");
                pause();

                isSmall = true;

            }

            // Stage 3: small
            else if (isSmall) {

                System.out.println("\nYou are tiny now");
                pause();

                System.out.println("Maybe you can squeeze through the door now?");
                pause();

                System.out.println("Let's try, you try to push through the door...");
                    pause();

                    System.out.println("Oh no, you slip and fall into the water below!");
                    pause();

                    currentRoom = 2;
                    inLibrary = false;
                }
            }
        }

    // ===== SEA OF TEARS =====
    public static void seaOfTears() {

        System.out.println("\n====================");
        System.out.println("      SEA OF TEARS");
        System.out.println("====================\n");
        pause();

        if (seaCreated) {
            System.out.println("You are floating in the sea created by your own tears");
            pause();
            System.out.println("Reminds you of all the times you learned programming....");
            pause();

        } else {
            System.out.println("You fall into a mysterious sea of water");
        }

        pause();

        System.out.println("You must swim to the other side");
        pause();

        if (health < 85) {
            System.out.println("That potion must have exhausted you, it feels so hard to swim");

            health -= 20;

            System.out.println("Health: " + health);

            pause();

            System.out.println("      |");
            System.out.println("     /|\\");
            System.out.println("    /_|_\\");
            System.out.println("      |");
            System.out.println("  ____|____");
            System.out.println("  \\________/");
            System.out.println("      ~~~~~");

            pause();

            System.out.println("A boat! You have to get into it");
        } else {
            System.out.println("No way you manage to swim all across this sea on your own");
            pause();
            System.out.println("Let's look around, maybe there is a piece of wood here at least");
            pause();

            System.out.println("      |");
            System.out.println("     /|\\");
            System.out.println("    /_|_\\");
            System.out.println("      |");
            System.out.println("  ____|____");
            System.out.println("  \\________/");
            System.out.println("      ~~~~~");

            pause();

            System.out.println("A boat! You have to get into it");
        }

        System.out.println("When you swim closer to the boat and  climb inside");
        pause();
        System.out.println("you see a rabbit and a hatter having a tea");
        pause();
        System.out.println("Hey, - says the rabbit, - we are not inviting anyone to our tea party boat");
        pause();
        System.out.println("Unless you are smart enough, - adds the hatter");
        pause();

        System.out.println("Answer my riddle: ");
        System.out.println("I am an odd number");
        System.out.println("Take away a letter and I become even");
        System.out.println("What number am I?");

        System.out.print("Enter your answer (0-10): ");
        String choice = scanner.nextLine().trim();

        if (choice.equals("7")) {
            System.out.println("The rabbit nods approvingly");
            pause();
            System.out.println("The hatter smiles. You may stay on the boat!");
        } else {
            System.out.println("The rabbit gives you a very judgmental look");
            pause();
            System.out.println("You feel embarrassed and lose health");
            health -= 10;
            System.out.println("Health: " + health);

            System.out.println("Here is another question, - says the rabbit,");
            System.out.println("the last chance to stay on our boat");
            pause();

            System.out.println("In Java, array indexes start with....");

            System.out.print("Enter your answer (0-10): ");
            String secondChoice = scanner.nextLine().trim();

            if (secondChoice.equals("0")) {
                System.out.println("The hatter nods approvingly");
                pause();
                System.out.println("The rabbit smiles. You may stay on the boat!");
                pause();
                System.out.println("Your new friends took you to the beach");
                pause();
                System.out.println("where you continue your adventure!");
                pause();
                currentRoom = 3;
            } else {
                System.out.println("Both of them look very disappointed");
                pause();
                System.out.println("You are not allowed to stay, - says rabbit");
                pause();
                System.out.println("Go and do a lesson on w3schools, - says hatter");
                pause();
                System.out.println("You are forced to jump from the boat and swim to the beach");
                pause();
                System.out.println("It took so much strength from you!");
                pause();

                health -= 20;
                System.out.println("Health: " + health);

                System.out.println("However, you managed to reach the beach!");
                pause();
                currentRoom = 3;
            }


        }
        pause();
        currentRoom = 3;
    }

    // ===== MAZE =====
    public static void maze() {

        Random random = new Random();

        System.out.println("You reach a quiet beach");
        pause();

        System.out.println("In front of you stands a strange maze made of white stone");
        pause();

        // RANDOM EVENT
        if (random.nextInt(100) == 0) {
            System.out.println("A strange warm light surrounds you");
            pause();
            System.out.println("You feel completely restored");
            health = 100;
            System.out.println("Health: " + health);
            pause();
        }

        System.out.println("You enter the maze");
        pause();

        System.out.println("After walking for a while you find a stone tablet");
        pause();

        System.out.println("It reads");
        pause();
        System.out.println("I speak without a mouth and hear without ears");
        System.out.println("I have nobody but come alive with wind");
        System.out.println("What am I");
        pause();

        System.out.print("Your answer: ");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("echo")) {
            System.out.println("The maze walls shift and open a path");
            pause();
        } else {
            System.out.println("The maze trembles");
            pause();
            System.out.println("You feel drained by confusion");
            health -= 15;
            System.out.println("Health: " + health);
            pause();
        }

        System.out.println("You reach the center of the maze");
        pause();

        System.out.println("There is a heavy wooden box");
        pause();

        System.out.println("You try to break it open");
        pause();

        if (health > 35) {

            System.out.println("You gather your strength and strike the box");
            pause();

            System.out.println("The box breaks apart");
            pause();

            System.out.println("Inside you find a golden key");
            pause();

            hasKey = true;

            System.out.println("You take the key and leave the maze");
            pause();

        } else {

            System.out.println("You are too weak to break the box");
            pause();

            System.out.println("Without the key you cannot escape");
            pause();

            System.out.println("You collapse on the sand");
            pause();

            gameRunning = false;
            return;
        }

        if (hasKey) {

            System.out.println("You escaped Wonderland! Congratulations!");
        } else {
            System.out.println("You didn't escape this time");
        }

        gameRunning = false;
    }

}
