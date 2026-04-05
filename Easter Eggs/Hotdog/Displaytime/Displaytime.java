import java.util.Scanner;

public class Displaytime{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the seconds: ");

        int totalSeconds = input.nextInt();
        
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.println(hours + " hour, " + minutes + " minutes, " + seconds + " seconds");
    }
}
