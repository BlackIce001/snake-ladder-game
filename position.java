
class Position {
    private int currentPosition;

    public Position(int initialPosition) {
        this.currentPosition = initialPosition;
    }

    public int getInitialPosition() {
        return currentPosition;
    }

    public void moveAhead(int positions) {
        currentPosition += positions;
    }

    public void moveBehind(int positions) {
        currentPosition -= positions;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int newPosition) {
        currentPosition = newPosition;
    }
}