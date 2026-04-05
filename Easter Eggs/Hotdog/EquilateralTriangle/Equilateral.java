import java.util.Scanner;

public class Equilateral{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of sides: ");

        double side = input.nextDouble();
        
        double area = (Math.sqrt(3) / 4) * (side * side);

        System.out.println("The area is " + area);
    }
}
