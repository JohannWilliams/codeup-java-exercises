package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter Yes/Y or No/N");
        String yNStr = this.scanner.nextLine();
        boolean yNBool = false;
        if(yNStr.equalsIgnoreCase("yes") || yNStr.equalsIgnoreCase("y")){
            yNBool = true;
        }
        return yNBool;
    }

    public int getInt(int min, int max){
        int userInt = 0;
        do {
            System.out.printf("Enter a number between %d and %d\n", min, max);
            userInt = Integer.parseInt(this.scanner.nextLine());
        }while(userInt > max || userInt < min);

        return userInt;
    }

    public int getInt(){
        return Integer.parseInt(this.scanner.nextLine());
    }

    public double getDouble(double min, double max){
        double userDouble = 0;
        do {
            System.out.printf("Enter a number between %f and %f\n", min, max);
            userDouble = Double.parseDouble(this.scanner.nextLine());
        }while(userDouble > max || userDouble < min);

        return userDouble;
    }

    public double getDouble(){
        return Double.parseDouble(this.scanner.nextLine());
    }
}
