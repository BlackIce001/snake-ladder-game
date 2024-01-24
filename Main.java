import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Create instances of the Position class for two players with an initial position of 0
        Position player1 = new Position(0);
        Position player2 = new Position(0);

        int rollsPlayer1 = 0; // Counter for the number of rolls for player 1
        int rollsPlayer2 = 0; // Counter for the number of rolls for player 2

        while (true) {
            // Player 1's turn
            int rolledNumberPlayer1 = random.nextInt(6) + 1;
            rollsPlayer1++;

            System.out.println("Player 1 - Roll #" + rollsPlayer1 + ": The player rolled: " + rolledNumberPlayer1);

            int optionPlayer1 = random.nextInt(3); // Generates a random number between 0 and 2
            switch (optionPlayer1) {
                case 0:
                    System.out.println("No Play. Player 1 stays in the same position.");
                    break;
                case 1:
                    System.out.println("Ladder. Player 1 moves ahead by " + rolledNumberPlayer1 + " positions.");
                    player1.moveAhead(rolledNumberPlayer1);
                    break;
                case 2:
                    System.out.println("Snake. Player 1 moves behind by " + rolledNumberPlayer1 + " positions.");
                    player1.moveBehind(rolledNumberPlayer1);
                    break;
            }

            // Ensure player 1's position doesn't go below 0
            if (player1.getCurrentPosition() < 0) {
                player1.setCurrentPosition(0);
            }

            System.out.println("Player 1 - Current position: " + player1.getCurrentPosition());

            // Check if Player 1 has won
            if (player1.getCurrentPosition() >= 100) {
                System.out.println("Player 1 won the game in " + rollsPlayer1 + " rolls.");
                break;
            }

            // Player 2's turn
            int rolledNumberPlayer2 = random.nextInt(6) + 1;
            rollsPlayer2++;

            System.out.println("Player 2 - Roll #" + rollsPlayer2 + ": The player rolled: " + rolledNumberPlayer2);

            int optionPlayer2 = random.nextInt(3); // Generates a random number between 0 and 2
            switch (optionPlayer2) {
                case 0:
                    System.out.println("No Play. Player 2 stays in the same position.");
                    break;
                case 1:
                    System.out.println("Ladder. Player 2 moves ahead by " + rolledNumberPlayer2 + " positions.");
                    player2.moveAhead(rolledNumberPlayer2);
                    break;
                case 2:
                    System.out.println("Snake. Player 2 moves behind by " + rolledNumberPlayer2 + " positions.");
                    player2.moveBehind(rolledNumberPlayer2);
                    break;
            }

            // Ensure player 2's position doesn't go below 0
            if (player2.getCurrentPosition() < 0) {
                player2.setCurrentPosition(0);
            }

            System.out.println("Player 2 - Current position: " + player2.getCurrentPosition());

            // Check if Player 2 has won
            if (player2.getCurrentPosition() >= 100) {
                System.out.println("Player 2 won the game in " + rollsPlayer2 + " rolls.");
                break;
            }
        }
    }
}