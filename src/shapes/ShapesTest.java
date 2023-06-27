package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);

        System.out.println("box1's area = " + box1.getArea());
        System.out.println("box1's perimeter = " + box1.getPerimeter());

        Rectangle box2 = new Square(5);

        System.out.println("box2's area = " + box2.getArea());
        System.out.println("box2's perimeter = " + box2.getPerimeter());
    }
}
