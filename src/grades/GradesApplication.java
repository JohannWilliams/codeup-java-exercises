package grades;

import java.util.HashMap;
import java.util.Random;
import util.Input;

import javax.naming.Name;

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

        displayStudentGitHubUserNames(students);

        String continueSearch;
        String requestedStudent;

        do {
            requestedStudent = askForStudentToGetDataOn();
            if(students.containsKey(requestedStudent)){
                displayStudentData(requestedStudent, students.get(requestedStudent));
            } else if(requestedStudent.equalsIgnoreCase("all") || requestedStudent.equalsIgnoreCase("a")){
                displayAllStudentGrades(students);
            } else if(requestedStudent.equalsIgnoreCase("class") || requestedStudent.equalsIgnoreCase("c")){
                displayClassAverage(students);
            } else if(requestedStudent.equalsIgnoreCase("csv")){
                displayCSVStyleData(students);
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", requestedStudent);
            }
            System.out.println("Would you like to see another student? [(Y)es/(N)o]");
            continueSearch = userInput.getString();
        }while (continueSearch.equalsIgnoreCase("y") || continueSearch.equalsIgnoreCase("yes"));

        System.out.println("Goodbye, and have a wonderful day!");

    }

    public static void displayStudentGitHubUserNames(HashMap<String, Student> students){

        System.out.println("Here are the GitHub usernames of our students:\n");

        for (String gh : students.keySet()) {
            System.out.print("|" + gh + "| ");
        }
        System.out.println("\n");
    }

    public static String askForStudentToGetDataOn(){
        System.out.print("What student would you like information on?\nType (A)ll to see all students grades. (C)lass to see class average.\n(CSV) to get Table Printout.\n\n> ");
        return userInput.getString();
    }

    public static void displayStudentData(String ghName, Student s){
        System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.1f%nGrades: %s%n%n", s.getName(), ghName, s.getGradeAverage(), s.getGrades());
    }

    public static void displayAllStudentGrades(HashMap<String, Student> students){
        for(String s: students.keySet()){
            System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.1f%nGrades: %s%n%n", students.get(s).getName(), s, students.get(s).getGradeAverage(), students.get(s).getGrades());
        }
    }

    public static void displayClassAverage(HashMap<String, Student> students){
        double totalAverage = 0;
        for(String s: students.keySet()){
            totalAverage += students.get(s).getGradeAverage();
        }
        System.out.printf("Class Average: %.1f%n%n", totalAverage/students.size());
    }

    public static void displayCSVStyleData(HashMap<String, Student> students){
        String nameString = "Name";
        String ghNameString = "GitHub_Username";
        String averageString = "Average";
        String csvString = String.format("%-10s%-22s%-10s%n", nameString, ghNameString, averageString);

        for(String s: students.keySet()){
            csvString += String.format("%-10s%-22s%-10.1f%n", students.get(s).getName(), s, students.get(s).getGradeAverage());
        }

        System.out.println(csvString);
    }

}
