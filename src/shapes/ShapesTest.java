package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
//        myShape.getLength(); // produces an error, because Measurable does not define getLength();

        Quadrilateral myQuad = new Square(10);
        System.out.println("myQuad.getArea() = " + myQuad.getArea());
        System.out.println("myQuad.getPerimeter() = " + myQuad.getPerimeter());
        System.out.println("myQuad.getLength() = " + myQuad.getLength());
    }


    /**
     * Answers to question in Exercises
     * 1 - Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
     *          getPerimeter is an abstract method from the Measurable Interface. Because of this,
     *          getPerimeter has to be present in the classes that implement it. No exceptions
     *
     * 2 - What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
     *          We will get a compile time error because we have a Variable of Measurable that holds a Rect
     *          or Square, but Measurable does not have a method for setLength or setWidth Only methods
     *          defined by Measurable can be used.
     *          Lines 15 - 18 show that a variable of Quadrilateral with the value of a new Square Object
     *          can use the getLength or getWidth methods.
     */
}
