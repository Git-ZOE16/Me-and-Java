import java.util.Scanner;
   public class Result{

    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

System.out.printf("What is the first number?:");
int number1 = inputCollector.nextInt();

int result = number1 / 3;

System.out.printf(" The result is %d%n", result);


}

}
