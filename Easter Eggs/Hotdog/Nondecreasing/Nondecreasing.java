import java.util.Scanner;

public class Nondecreasing{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the three integers: ");

        int result = input.nextInt();

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        if (number1 > number2) { int Result = number1; number1 = number2; number2 = result; }
        if (number2 > number3) { int Result = number2; number2 = number3; number3 = result; }
        if (number1 > number2) { int Result = number1; number1 = number2; number2 = result; }
        
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
