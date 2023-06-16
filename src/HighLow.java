import java.util.Random;
import java.util.Scanner;

/**
 * Game Development 101
 *
 *      * Welcome to the world of game development!
 *
 *      * You are going to build a high-low guessing game. Create a class named HighLow inside of src.
 *
 *      * The specs for the game are:
 *
 *          - Game picks a random number between 1 and 100.
 *          - Prompts user to guess the number.
 *          - All user inputs are validated.
 *          - If user's guess is less than the number, it outputs "HIGHER".
 *          - If user's guess is more than the number, it outputs "LOWER".
 *          - If a user guesses the number, the game should declare "GOOD GUESS!"
 *
 *      * Bonus
 *
 *          - Keep track of how many guesses a user makes.
 *          - Set an upper limit on the number of guesses.
 */

public class HighLow {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int numberToGuess = 0;
    public static int userGuess = 0;


    public static void main(String[] args) {

        setNumberToGuess();
        boolean keepGuessing = false;
        do {
            keepGuessing = runTheGame();
        } while(keepGuessing);
    }


    public static boolean runTheGame(){
        boolean keepRunning = false;
        boolean inputInRange = false;

        do {
            inputInRange = getAndCheckUserInput();
        } while (!inputInRange);

        String resp = guessResponse(userGuess);
        System.out.println(resp);

        if(resp.startsWith("G")){
            keepRunning = false;
        } else {
            keepRunning = true;
        }
        return keepRunning;
    }

    public static boolean getAndCheckUserInput(){
        boolean inputInRange = false;
        userGuess = 0;
        System.out.println("Guess a number between 1 and 100!");
        String guess = scanner.nextLine();
        if (checkIfInputIsAnInt(guess) && checkIfInputIsInRange(Integer.parseInt(guess))) {
            inputInRange = true;
            userGuess = Integer.parseInt(guess);
        } else {
            System.out.println("Invalid Guess!");
        }
        return inputInRange;
    }

    public static void setNumberToGuess(){
        numberToGuess = getRandomNum();
    }

    public static int getRandomNum(){
        return random.nextInt(1, 101);
    }

    public static boolean checkIfInputIsAnInt(String input){
        boolean isValidInt = false;

        try{
            Integer.parseInt(input);
            isValidInt = true;
        }catch (Exception e){
            System.out.println(e);
        }

        return isValidInt;
    }

    public static boolean checkIfInputIsInRange(int guess){
        return (guess >= 1  && guess <= 100);
    }

    public static String guessResponse(int guess){
        String resp = "";
        if(guess == numberToGuess){
            resp = "GOOD GUESS!";
        } else {
            if(guess < numberToGuess){
                resp = "HIGHER";
            } else {
                resp = "LOWER";
            }
        }
        return resp;
    }
}
