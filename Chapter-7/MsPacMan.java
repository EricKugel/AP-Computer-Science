public class MsPacMan extends PacMan {
    private boolean hasEaten;
    private int points;

    public MsPacMan(String name, Direction facing, int speed, boolean hasEaten, int points) {
        super(name, facing, speed);
        this.hasEaten = hasEaten;
        this.points = points;
    }

    public void setPowerPellet(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    public boolean hasEaten() {
        return hasEaten;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += "\n";
        output += "Power Pellet Active: " + hasEaten + ", ";
        output += "Points: " + points;
        return output;
    }
}
