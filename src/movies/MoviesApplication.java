package movies;
import util.Input;

import java.util.Objects;

public class MoviesApplication {
    private static final Input userInput = new Input();

    public static void main(String[] args) {
        int userChoice = -1;
        do{
            displayUserOptionMenu();
            userChoice = getUserInput();
            if(userChoice < 0 || userChoice > 5){
                System.out.println("Invalid Input. Please use a number between 0 and 5.");
            } else {
                if(userChoice == 1){
                    displayAllMovies();
                } else if (userChoice == 2) {
                    displayFilteredMovies("animated");
                } else if (userChoice == 3) {
                    displayFilteredMovies("drama");
                } else if (userChoice == 4) {
                    displayFilteredMovies("horror");
                } else if (userChoice == 5) {
                    displayFilteredMovies("scifi");
                }
            }

        }while(userChoice != 0);



    }

    public static void displayUserOptionMenu(){
        System.out.println("\nWhat would you like to do?\n");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category\n");
    }

    public static int getUserInput(){
        System.out.print("Enter your choice: ");
        return userInput.getInt();
    }

    public static void displayAllMovies(){
        Movie[] mArray = MoviesArray.findAll();

        for(Movie m : mArray){
            System.out.printf("%s -- %s\n", m.getName(), m.getCategory());
        }

    }

    public static void displayFilteredMovies(String selectedCategory){
        Movie[] mArray = MoviesArray.findAll();
        String cat;
        for(Movie m : mArray){
            cat = m.getCategory();
            if(cat.equalsIgnoreCase(selectedCategory)){
                System.out.printf("%s -- %s\n", m.getName(), m.getCategory());
            }
        }
    }
}
