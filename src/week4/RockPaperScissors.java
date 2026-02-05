import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter Rock, Paper or Scissors: ");

        String player = scanner.nextLine().trim().toLowerCase();
      
        // Computer choice
        int computerNumber = random.nextInt(3);
        String computer = "";

        if (computerNumber == 0) {
            computer = "rock";
        } else if (computerNumber == 1) {
            computer = "paper";
        } else {
            computer = "scissors";
        }

        System.out.println("Computer choice: " + computer);

        // Decide winner
        if (player.equals(computer)) {
            System.out.println("It's a tie!");
        } else if (
            (player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
