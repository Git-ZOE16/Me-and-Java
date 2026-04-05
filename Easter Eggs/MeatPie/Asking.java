import java.util.Scanner;
   public class Asking{

    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

System.out.printf("What is the first integer?:");
int number1 = inputCollector.nextInt();

System.out.println("What is the second integer?:");
int number2 = inputCollector.nextInt();

System.out.println("What is the third integer?:");
int number3 = inputCollector.nextInt();

int average = (number1 + number2 + number3) / 3;

System.out.printf("average is %d%n", average);


}

}
