public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello, %s\n", this.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John");

        System.out.println(p1.getName());
        p1.setName("Doe");
        p1.sayHello();

        // understanding references
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));// true
//        System.out.println(person1 == person2);// false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);//true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); // john
        System.out.println(person2.getName()); // john
        person2.setName("Jane");
        System.out.println(person1.getName()); // john expected got jane. P1 and P2 are equal
        System.out.println(person2.getName()); // jane


    }
}
