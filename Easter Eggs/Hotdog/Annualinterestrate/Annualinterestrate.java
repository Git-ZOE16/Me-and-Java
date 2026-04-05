import java.util.Scanner;

public class Annualinterestrate{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the balance and annual percentage interestrate: ");

        double balance = input.nextDouble();
        double Interestrate = input.nextDouble();
        
        double interestrate = balance * (interestrate / 1200);

        System.out.println("The interestrate is " + interestrate );
    }
}
