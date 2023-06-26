package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    private static final Input userInput = new Input(); // used to get User Inputs (Strings, Integers)
    private static Movie[] mArray = MoviesArray.findAll(); // grabs Initial Movies List/Array
    private static final String[] action = {"exit", "all", "animated", "drama", "horror", "scifi", "add"}; // used to search specific movie category and set new movie's category.

    public static void main(String[] args) {
        int userChoice;
        do{
            displayUserOptionMenu();
            try{
                userChoice = getUserInput();
            } catch (Exception e){
                System.out.println(e);
                userChoice = -1;
            }
            if(userChoice < 0 || userChoice > (action.length - 1)){
                System.out.printf("Invalid Input. Please use a number between 0 and %d.\n", (action.length - 1));
            } else if (userChoice == 6) {
                createMovie();
            } else {
                displayMovies(action[userChoice]);
            }

        }while(userChoice != 0);
    }

    /**
     * Display the main menu for requested user input
     */
    public static void displayUserOptionMenu(){
        System.out.println("\nWhat would you like to do?\n");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a movie to the list\n");
    }

    /**
     * prompts the user for an integer choice. returns the value
     * of the number entered.
     * @return user input
     */
    public static int getUserInput(){
        System.out.print("Enter your choice: ");
        return userInput.getInt();
    }

    /**
     * takes in a String of category or all.
     * if all is passed in, display all movies in list/array
     * else display only the movies that match the category passed in
     * @param selectedCategory
     */
    public static void displayMovies(String selectedCategory){
        if(selectedCategory.equalsIgnoreCase("all")){
            for(Movie m : mArray){
                System.out.printf("%s -- %s\n", m.getName(), m.getCategory());
            }
        }else{
            String cat;
            for(Movie m : mArray){
                cat = m.getCategory();
                if(cat.equalsIgnoreCase(selectedCategory)){
                    System.out.printf("%s -- %s\n", m.getName(), m.getCategory());
                }
            }
        }
    }

    /**
     * after prompting user for inputs, takes in a String for new movie name
     * and an integer response for specific category for the new movie. passes
     * Name and Cat into method for adding movie to current movie list/array
     */
    public static void createMovie(){
        System.out.print("Enter New Movie's Name: ");
        String newMovieName = userInput.getString();
        System.out.println("What is the Movie's Category");
        System.out.println("1 - animated");
        System.out.println("2 - drama");
        System.out.println("3 - horror");
        System.out.println("4 - scifi");
        int newMovieCatNum = getNewMovieCategory();

        addNewMovie(newMovieName, action[newMovieCatNum + 1]);
    }

    /**
     * Create a new Movie with name and category, then adds that to the current
     * movies list/array.
     * @param name
     * @param cat
     */
    public static void addNewMovie(String name, String cat){
        Movie newMovie = new Movie(name, cat);

        mArray = Arrays.copyOf(mArray, mArray.length + 1);
        mArray[mArray.length - 1] = newMovie;
    }

    /**
     * gets the category number from user for new Movie. if input is not an integer
     * or is outside the scope of 1-4, ask for input again.
     * @return
     */
    public static int getNewMovieCategory(){
        int newMovieCatNum = 0;
        do{
            try{
                newMovieCatNum = userInput.getInt(1, 4);
            } catch (Exception e){
                System.out.println(e);
            }
        }while (newMovieCatNum <= 0 || newMovieCatNum > 4);

        return newMovieCatNum;
    }
}
