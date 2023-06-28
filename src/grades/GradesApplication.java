package grades;

import java.util.HashMap;
import java.util.Random;
import util.Input;

public class GradesApplication {

    private static final Random rand = new Random();
    private static final Input userInput = new Input();

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student[] newStudents = {new Student("James"), new Student("John"), new Student("Doe"), new Student("Jane")};

        for(Student s : newStudents){
            s.addGrade(rand.nextInt(65, 101));
            s.addGrade(rand.nextInt(65, 101));
            s.addGrade(rand.nextInt(65, 101));
            s.addGrade(rand.nextInt(65, 101));
        }

        students.put("TheAmazingJames", newStudents[0]);
        students.put("JohnJamison", newStudents[1]);
        students.put("DoeDDDoeDoe", newStudents[2]);
        students.put("PlainJane", newStudents[3]);

        System.out.println("Welcome!\n");

        displayUsers(students);

        String continueSearch;
        String requestedStudent;

        do {
            requestedStudent= askForStudentToGetDataOn();
            if(students.containsKey(requestedStudent)){
                displayStudentData(requestedStudent, students.get(requestedStudent));
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", requestedStudent);
            }
            System.out.println("Would you like to see another student? [(Y)es/(N)o]");
            continueSearch = userInput.getString();
        }while (continueSearch.equalsIgnoreCase("y") || continueSearch.equalsIgnoreCase("yes"));



    }

    public static void displayUsers(HashMap<String, Student> students){

        System.out.println("Here are the GitHub usernames of our students:\n");

        for (String gh : students.keySet()) {
            System.out.print("|" + gh + "| ");
        }
        System.out.println("\n");
    }

    public static String askForStudentToGetDataOn(){
        System.out.print("What student would you like to see more information on?\n\n> ");
        return userInput.getString();
    }

    public static void displayStudentData(String ghName, Student s){
        System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.1f%n%n", s.getName(), ghName, s.getGradeAverage());
    }

}
