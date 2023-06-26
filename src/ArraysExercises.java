import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers)); // cannot use just numbers because an Java is strictly typed. Array != String.

        Person[] people = {new Person("John"), new Person("Doe"), new Person("Bob")};

        for(Person p: people){
            System.out.println(p.getName());
        }

        people = addPerson(people, new Person("Jane"));

        for(Person p: people){
            System.out.println(p.getName());
        }
    }


    public static Person[] addPerson(Person[] people, Person p){
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = p;
        return newPeople;
    }
}
