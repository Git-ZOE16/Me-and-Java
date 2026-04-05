import java.util.Scanner;
public class Information{

    public static void main(String[] args){

   Scanner inputCollector = new Scanner(System.in);

   System.out.println("what is your name?");

   String userInput = inputCollector.nextLine();
   
   System.out.printf("I am %s%n", userInput);

  System.out.println("How old are you?");
  
  int input = inputCollector.nextInt();

   System.out.printf("I am %d years old",input);

 }
}

 
