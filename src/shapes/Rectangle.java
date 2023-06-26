package shapes;

public class Rectangle {
    protected static double length;
    protected static double width;

    public Rectangle(double len, double w){
        length = len;
        width = w;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
}
