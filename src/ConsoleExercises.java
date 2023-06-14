import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int userInt = scanner.nextInt(); // if no int is inputted, then an exception is thrown.
        System.out.println("userInt = " + userInt);


        System.out.print("Enter 3 words: "); // if less than 3. system waits for another input. if more only first 3 are printed
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("word1 = " + word1);
        System.out.println("word2 = " + word2);
        System.out.println("word3 = " + word3);

    }
}
