import java.util.Scanner;
   public class Product{

    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

System.out.printf("Enter first integer:");
int number1 = inputCollector.nextInt();

System.out.println("Enter second integer:");
int number2 = inputCollector.nextInt();

int product = number1 * number2;

System.out.printf("product is %d%n", product);


}

}
