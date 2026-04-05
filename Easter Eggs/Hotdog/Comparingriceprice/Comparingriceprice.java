import java.util.Scanner;

public class Comparingriceprice{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight for package 1: " + "kg");
        System.out.println("Enter the price for package 1: ");


        double weight1 = input.nextDouble(); 
        double price1 = input.nextDouble();

        System.out.println("Enter the weight for package 2: " + "kg");
        System.out.println("Enter the price for package 2: ");

        double weight2 = input.nextDouble(); 
        double price2 = input.nextDouble();
        
        if ((price1 / weight1) < (price2 / weight2)){ 
          System.out.println("Package 1 has better price");

        } else {
         System.out.println("Package 2 has better price");
    }
}

}
