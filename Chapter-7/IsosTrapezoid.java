public class IsosTrapezoid extends Trapezoid {
    public IsosTrapezoid(double a, double b, double c, double d) {
        super(a, b, c, b, d);
    }

    public double calcDiagonal() {
        return Math.hypot((getA() + (getC() - getA()) / 2), getE());
    }

    @Override
    public boolean equals(Object obj) {
        IsosTrapezoid other = (IsosTrapezoid) obj;
        if (getA() != other.getA() 
            || getB() != other.getB()
            || getC() != other.getC()
            || getD() != other.getD()
            || getE() != other.getE()
        ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String output = "Isosceles Trapezoid: ";
        output += "Bases: " + getA() + ", " + getC() + "\n";
        output += "Height: " + getE() + ", Legs: " + getB();
        return output;
    }
}
