package movies;
import util.Input;

public class MoviesApplication {
    private static final Input userInput = new Input();
    private static Movie[] mArray = MoviesArray.findAll();

    private static final String[] action = {"exit", "all", "animated", "drama", "horror", "scifi", "add"};

    public static void main(String[] args) {
        int userChoice;
        do{
            displayUserOptionMenu();
            userChoice = getUserInput();
            if(userChoice < 0 || userChoice > (action.length - 1)){
                System.out.printf("Invalid Input. Please use a number between 0 and %d.\n", (action.length - 1));
            } else if (userChoice == 6) {
                System.out.println("userChoice = " + userChoice);
            } else {
                displayMovies(action[userChoice]);
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
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a movie to the list\n");
    }

    public static int getUserInput(){
        System.out.print("Enter your choice: ");
        return userInput.getInt();
    }

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
}
