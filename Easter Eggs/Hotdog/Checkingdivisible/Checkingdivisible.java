import java.util.Scanner;

public class Checkingdivisible{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer value: ");

         int y = input.nextInt();
        
        System.out.println("Divisible by 2: " + (y % 2 == 0));
        System.out.println("Divisible by 3: " + (y % 3 == 0));
        System.out.println("Divisible by 5: " + (y % 5 == 0));
        System.out.println("Divisible by 7: " + (y % 7 == 0));
    }
}
