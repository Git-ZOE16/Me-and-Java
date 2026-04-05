import java.util.Scanner;

public class Alldigitinteger{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");

        int number = input.nextInt();
        
        int lastDigit = number % 10;

        int remainingNumber = number / 10;

        int secondDigit = remainingNumber % 10;

        remainingNumber = remainingNumber / 10;

        int thirdDigit = remainingNumber % 10;
        
        int sum = lastDigit + secondDigit + thirdDigit;

        System.out.println("The sum of the digits is " + sum);
    }
}
