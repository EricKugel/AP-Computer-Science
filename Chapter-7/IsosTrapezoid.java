public class IsosTrapezoid extends Trapezoid {
    public IsosTrapezoid(double a, double b, double c, double d) {
        super(a, b, c, b, d);
    }

    public double calcDiagonal() {
        return Math.hypot(getA(), getB());
    }

    @Override
    public boolean equals(Rectangle other) {
        
    }

    @Override
    public String toString() {
        
    }
}
