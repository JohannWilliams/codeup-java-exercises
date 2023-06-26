package shapes;

public class Square extends Rectangle{
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
