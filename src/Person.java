public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s", this.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John");

        System.out.println(p1.getName());
        p1.setName("Doe");
        p1.sayHello();
    }
}
