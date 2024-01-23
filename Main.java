
import java.util.Random;
        public class Main {
            public static void main(String[] args) {
                Random random=new Random();
                position ps=new position(0);
                System.out.println("the initial position of player "+ ps.initial_position);

                int rolled_number = random.nextInt(1, 6);

                System.out.println("The player rolled:"+rolled_number);
                int option=random.nextInt(6);
                switch(option) {
                    case 0:
                        System.out.println("No Play.The player stays in same position :" + option);
                        break;
                    case 1:
                        System.out.println("the player moves ahead :" + option + rolled_number);
                        ps.moveAhead(rolled_number);
                        break;
                    case 3:
                        System.out.println("the player moves back :" + option + rolled_number);
                        ps.moveBehind(rolled_number);
                        break;
                }








    }
}