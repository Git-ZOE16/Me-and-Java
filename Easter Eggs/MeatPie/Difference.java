import java.util.Scanner;
   public class Difference{

    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

System.out.printf("Enter first integer:");
int number1 = inputCollector.nextInt();

System.out.println("Enter second integer:");
int number2 = inputCollector.nextInt();

int difference = number1 / number2;

System.out.printf("difference is %d%n", difference);


}

}
