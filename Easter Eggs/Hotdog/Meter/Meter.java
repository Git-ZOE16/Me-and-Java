import java.util.Scanner;

public class Meter{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

     System.out.print("Enter the value in meter: ");

        double meters = input.nextDouble();
        
        double feet = meters * 3.2786;

        System.out.println(meters + " meters is " + feet + " feet");
    }
}
