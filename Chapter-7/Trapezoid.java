public class Trapezoid extends Quadrilateral {
    private double e;

    public Trapezoid(double a, double b, double c, double d, double e) {
        super(a, b, c, d);
        this.e = e;
    }

    public double getE() {
        return e;
    }

    public double calcArea() {
        return getA() * e + ((getC() - getA()) * e / 2);
    }
}
