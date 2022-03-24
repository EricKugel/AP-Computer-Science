public class Rectangle extends Parallelogram {
    public Rectangle(double a, double b) {
        super(a, b, b);
    }

    public double calcDiagonal() {
        return Math.hypot(getA(), getB());
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle other = (Rectangle) obj;
        if ((getA() == other.getA() && getB() == other.getB()) || (getA() == other.getB() && getB() == other.getA())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle: Base: " + getA() + ", Height: " + getB();
    }
}