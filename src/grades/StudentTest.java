package grades;

public class StudentTest {


    public static void main(String[] args) {
        Student s1 = new Student("John");
        Student s2 = new Student("Doe");
        Student s3 = new Student("Jane");

        for(int i = 0; i < 5; i++){
            s1.addGrade(100);
        }

        for(int i = 100; i > 70; i -= 5){
            s2.addGrade(i);
        }

        for(int i = 0; i < 10; i++){
            s3.addGrade(85);
        }

        System.out.println("s1.getGradeAverage() = " + s1.getGradeAverage());
        System.out.println("s2.getGradeAverage() = " + s2.getGradeAverage());
        System.out.println("s3.getGradeAverage() = " + s3.getGradeAverage());
    }



}
