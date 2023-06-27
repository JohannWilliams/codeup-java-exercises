package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double len, double w){
        this.length = len;
        this.width = w;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
}
