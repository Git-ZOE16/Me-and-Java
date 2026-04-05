import java.util.Scanner;
   public class Converter{

    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

System.out.printf("Enter the number in miles:");

double miles = inputCollector.nextDouble();

double Kilometers = miles * 1.6;

System.out.printf("Kilometers is %d", Kilometers);


}
}
