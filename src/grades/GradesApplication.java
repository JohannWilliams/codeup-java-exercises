package grades;

import java.util.HashMap;
import java.util.Random;

public class GradesApplication {

    private static final Random rand = new Random();

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

        for (String gh : students.keySet()) {
            System.out.println("key: " + gh + " value: " + students.get(gh));
        }

    }
}
