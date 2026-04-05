import java.util.Scanner;

public class Triangular{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of sides: ");

        double side = input.nextDouble();
        
        double area = (Math.sqrt(3) / 4) * (side * side);

        double volume = area * side;
        
        System.out.println("The volume is " + volume);
    }
}
