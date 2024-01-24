import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();


        Position ps = new Position(0);
        System.out.println("The initial position of player: " + ps.getInitialPosition());
        int roll=0;

        while (ps.getCurrentPosition() < 100) {

            int rolledNumber = random.nextInt(6) + 1;
            roll++;
            System.out.println("no of times dice rolled: "+roll);

            System.out.println("The player rolled: " + rolledNumber);


            int option = random.nextInt(3);
            switch (option) {
                case 0:
                    System.out.println("No Play. The player stays in the same position.");
                    break;
                case 1:
                    System.out.println("Ladder. The player moves ahead by " + rolledNumber + " positions.");
                    ps.moveAhead(rolledNumber);
                    break;
                case 2:
                    System.out.println("Snake. The player moves behind by " + rolledNumber + " positions.");
                    ps.moveBehind(rolledNumber);
                    break;
            }


            if (ps.getCurrentPosition() < 0) {
                ps.setCurrentPosition(0);
            }

             if (ps.getCurrentPosition() >100 ) {
                ps.setCurrentPosition(100);
                break;
            }


            System.out.println("The current position of player: " + ps.getCurrentPosition());
        }

        System.out.println("Congratulations! The player reached the winning position: " + ps.getCurrentPosition());
    }
}