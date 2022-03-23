public class Rectangle extends Parallelogram {
    public Rectangle(double a, double b) {
        super(a, b, b);
    }

    public double calcDiagonal() {
        return Math.hypot(getA(), getB());
    }
}