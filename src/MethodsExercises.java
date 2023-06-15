
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Addition(5,10) = " + Addition(5, 10));
        System.out.println("Subtraction(10, 5) = " + Subtraction(10, 5));
        System.out.println("Multiplication(5, 5) = " + Multiplication(5, 5));
        System.out.println("Division(25, 5) = " + Division(25, 5));

    }

    public static int Addition(int a, int b){
        return a + b;
    }
    public static int Subtraction(int a, int b){
        return a - b;
    }
    public static int Multiplication(int a, int b){
        return a * b;
    }
    public static int Division(int a, int b){
        return a / b;
    }
}
