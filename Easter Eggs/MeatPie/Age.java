import java.util.Scanner;
public class Age{
    public static void main(String[] args){

   Scanner inputCollector = new Scanner(System.in);

  System.out.println("How old are you?");
  
  int input = inputCollector.nextInt();


   System.out.printf("I am %d years old", input);

 }
}

