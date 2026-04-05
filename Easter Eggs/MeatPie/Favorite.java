import java.util.Scanner;
public class Favorite{
    public static void main(String[] args){

   Scanner inputCollector = new Scanner(System.in);

   System.out.println("what is your favorite color?");

   String userInput = inputCollector.nextLine();
   
   System.out.printf("My favorite color is %s%n", userInput);

 }
}

