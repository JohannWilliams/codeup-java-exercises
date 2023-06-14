

public class ControlFlowExercises {
    public static void main(String[] args){

//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 100;
//        do{
//            System.out.println("i = " + i);
//            i -= 5;
//        } while(i >= -10);

        int i = 2;
        do{
            System.out.println(i);
            i = (int)Math.pow(i,2);
        }while(i < 1000000);

    }
}
