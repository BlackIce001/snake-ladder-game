public class position {
    int initial_position;


    position(int x) {
        this.initial_position=x;

    }
    public void moveAhead(int position) {
        initial_position = position+1;
    }

    public void moveBehind(int position) {
        initial_position = position-1;
    }



}
