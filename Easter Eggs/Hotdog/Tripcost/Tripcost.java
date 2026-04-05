import java.util.Scanner;

public class Tripcost{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance of the trip: ");

        double distance = input.nextDouble();

        System.out.print("Enter the miles per gallon: ");

        double milespergallon = input.nextDouble();

        System.out.print("Enter the price per gallon: ");

        double price = input.nextDouble();
        
        double cost = (distance / milespergallon) * price;

        System.out.println("The cost of driving is $" + cost);
    }
}
