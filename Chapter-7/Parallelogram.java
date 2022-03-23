public class Parallelogram extends Quadrilateral {
    private double c;

    public Parallelogram(double a, double b, double c) {
        super(a, b, a, b);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double calcArea() {
        return getA() * c;
    }
}
