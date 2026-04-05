import java.util.Scanner;
   
public class Converter{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter the number in miles:");

        double miles = inputCollector.nextDouble();

        double kilometers = miles * 1.6;

        System.out.printf("Kilometers is %.2f \n", kilometers);
    }
}
