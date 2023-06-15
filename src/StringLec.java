import java.util.Scanner;
import java.util.concurrent.CompletionService;

public class StringLec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("type abc");
//        String userStr = scan.nextLine();
//        String str1 = "abc";
//        String str2 = "abc";
//        String newStr = str1 + "def";
//        System.out.println("abc" == "abc");
//        System.out.println(str1 == "abc");
//        System.out.println(str1 == str2);
//        System.out.println(str1 == userStr); //prints false
//        System.out.println(str1.equals(userStr));//prints true
//        System.out.println(newStr == "abcdef");
//        System.out.println(newStr.equals("abcdef"));
//
//        String jeff = "jeff";
//        String loudJeff = "JEFF";
//
//        System.out.println(jeff.equals(loudJeff));
//        System.out.println(jeff.equalsIgnoreCase(loudJeff));
//
//        String startsWithB = "bob";
//        String alsoStartsWithB = "barbarian";
//
//        System.out.println(startsWithB.startsWith("b")); //true
//        System.out.println(alsoStartsWithB.startsWith("B")); //false
//        System.out.println(startsWithB.startsWith("bob")); //true
//        System.out.println(alsoStartsWithB.toLowerCase().startsWith("bar")); //true

        // STRING METHOD RUN DOWN
        // charAt

        String cosmos = "COSMOS";
        char thirdIndex = cosmos.charAt(3);
        System.out.println(cosmos.charAt(3)); // M
        System.out.println(thirdIndex); // M

        // indexOf
        String mo = "MO";
        String moe = "MOE";
        System.out.println(cosmos.indexOf(thirdIndex));
        System.out.println(cosmos.indexOf(mo));
        System.out.println(cosmos.indexOf(moe));

        // length
        System.out.println(cosmos.length());

        // replace
        String mascot = "Codey The Duck";
        String instructor = mascot.replace("ey The Duck", "y Hastings");
        System.out.println(mascot);
        System.out.println(instructor);

        // substring
        String animal = mascot.substring(10);
        String article = mascot.substring(6,9);
        System.out.println(animal);
        System.out.println(article);

        // trim
        String spaceyJeff = "        jeff       ";
        System.out.println(spaceyJeff.trim());
        System.out.println(spaceyJeff);

        // format
        String name = "Joe";
        String factory = "button";
        String formattedStr = String.format("Hello, my name is %s, and I work in a %s factory", name, factory);
        System.out.println(formattedStr);
    }
}
