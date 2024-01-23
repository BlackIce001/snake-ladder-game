
import java.util.Random;
        public class Main {
            public static void main(String[] args) {
                Random random=new Random();
                position ps=new position(0);
                System.out.println("the initial position of player "+ ps.initial_position);

                int rolled_number = random.nextInt(1, 6);

                System.out.println("The player rolled:"+rolled_number);






    }
}