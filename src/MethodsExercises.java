import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Addition(5,10) = " + Addition(5, 10));
        System.out.println("Subtraction(10, 5) = " + Subtraction(10, 5));
        System.out.println("Multiplication(5, 5) = " + Multiplication(5, 5));
        System.out.println("Multiplication(25,5) = " + Multiplication(25, 5));
        System.out.println("Multiplication(-25,5) = " + Multiplication(-25, 5));
        System.out.println("Multiplication(25,-5) = " + Multiplication(25, -5));
        System.out.println("Division(25, 5) = " + Division(25, 5));
        System.out.println("Modulus(5, 5) = " + Modulus(5, 5));

        int userInput = getInteger(1, 10);
        System.out.println("userInput = " + userInput);

        int numToFactor = 0;
        boolean continueFactoring = false;
        do {
            do {
                System.out.println("Enter a number to factor between 1 and 25");
                numToFactor = Integer.parseInt(scanner.nextLine());
            } while (numToFactor < 1 || numToFactor > 20); // max input is 20 with an output of 2432902008176640000, 21 we get our first overflow.

            long factoredNumber = factorial(numToFactor);
            System.out.println("factoredNumber = " + factoredNumber);

            String factorStr = factorialString(factoredNumber, numToFactor);
            System.out.println(factorStr);

            System.out.println("Would you like to factor another number?[y/n]");
            String userAnswer = scanner.nextLine();
            continueFactoring = userAnswer.equalsIgnoreCase("y");
        } while(continueFactoring);
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

//    public static int Multiplication(int a, int b){
//        int result = 0;
//        for(int i = 0; i < b; i++){
//            result += a;
//        }
//        return result;
//    }

//    public static int Multiplication(int a, int b){
//        if(b > 0){
//            if(--b != 0){
//                a += Multiplication(a, b);
//            }
//        } else if(b < 0 && a > 0){
//            if(++b != 0){
//                a += Multiplication(a, b);
//            }
//        }
//
//        return a;
//    }
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

    public static int getInteger(int min, int max){
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int userInput = Integer.parseInt(scanner.nextLine());

        if(userInput < min || userInput > max){
            userInput = getInteger(min, max);
        }

        return userInput;
    }

    public static long factorial(int num){
        long fact = num;
        if(num == 1){
            return 1;
        } else {
            fact = fact * factorial(--num);
        }
        return fact;
    }

    public static String factorialString(long ans, int num){
        String factStr = String.format("%d! = ", num);
        for(int i = 1; i <= num; i++){
            if(i == num){
                String appendStr = String.format("%d = %d", i, ans);
                factStr += appendStr;
            } else {
                String appendStr = String.format("%d x ", i);
                factStr += appendStr;
            }
        }

        return factStr;
    }

}
