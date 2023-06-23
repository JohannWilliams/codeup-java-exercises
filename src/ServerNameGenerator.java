import java.util.Random;

public class ServerNameGenerator {
    private static Random rand = new Random();
    private static String[] adj = {"beautiful", "graceful", "blissful", "serene", "dedicated", "powerful", "helpful", "lazy", "wonderful", "magical"};
    private static String[] nouns = {"vector", "wave", "photon", "boson", "lepton", "electron", "proton", "atom", "spider", "venom"};

    public static void main(String[] args) {

        System.out.println("Here is your server name:");
        if(rand.nextBoolean()){
            System.out.println(getRandomStrArrElement(adj) + "-" + getRandomStrArrElement(nouns));
        } else {
            System.out.println(getRandomStrArrElement(nouns) + "-" + getRandomStrArrElement(adj));
        }

    }

    public static String getRandomStrArrElement(String[] strArr){
        int randomIndex = rand.nextInt(0, strArr.length);
        return strArr[randomIndex];
    }

}
