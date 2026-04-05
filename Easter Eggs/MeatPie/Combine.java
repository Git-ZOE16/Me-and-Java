import java.util.Scanner;
   public class Combine{

    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

System.out.printf("Enter first integer:");

int number1 = inputCollector.nextInt();

System.out.println("Enter second integer:");

int number2 = inputCollector.nextInt();

int sum = number1 + number2;

int product = number1 * number2;

System.out.printf("sum is %d%n", sum);

System.out.printf("product is %d%n", product);

}
}
