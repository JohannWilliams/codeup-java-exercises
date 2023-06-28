package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double gradetotal = 0.0;
        for(int g: grades){
            gradetotal += g;
        }
        return gradetotal/grades.size();
    }

    public String getGrades(){
        return grades.toString();
    }
}
