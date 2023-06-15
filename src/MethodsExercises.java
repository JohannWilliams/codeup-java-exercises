
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Addition(5,10) = " + Addition(5, 10));
        System.out.println("Subtraction(10, 5) = " + Subtraction(10, 5));
        System.out.println("Multiplication(5, 5) = " + Multiplication(5, 5));
        System.out.println("Multiplication(25,5) = " + Multiplication(25, 5));
        System.out.println("Division(25, 5) = " + Division(25, 5));
        System.out.println("Modulus(5, 5) = " + Modulus(5, 5));

    }

    public static int Addition(int a, int b){
        return a + b;
    }
    public static int Subtraction(int a, int b){
        return a - b;
    }
//    public static int Multiplication(int a, int b){
//        return a * b;
//    }
//    public static int Multiplication(int a, int b){
//        int result = 0;
//        for(int i = 0; i < b; i++){
//            result += a;
//        }
//        return result;
//    }

    public static int Multiplication(int a, int b){
        if(--b != 0){
            a += Multiplication(a, b);
        }
        return a;
    }
    public static int Division(int a, int b){
        int result = 0;
        try{
            result = a / b;
        } catch (Exception e){
            System.out.println("Can not divide by Zero (0) \ne = " + e);
        }
        return result;
    }
    public static int Modulus(int a, int b){
        int result = 0;
        try{
            result = a % b;
        } catch (Exception e){
            System.out.println("Can not divide by Zero (0) \ne = " + e);
        }
        return result;
    }
}
