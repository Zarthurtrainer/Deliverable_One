import java.util.regex.*;
import java.util.Scanner;

public class passwordone {
    public static void main(String[] args) {
    	System.out.print("To create a valid password:\n");
        System.out.print("Password must contain one lowercase letter \n");
        System.out.print("Password must contain one uppercase letter \n");
        System.out.print("Password must contain at least 7 characters \n");
        System.out.print("Password must contain no more than 12 characters \n");
        System.out.print("Password must contain exclamation point (!) \n \n");
        System.out.print("Please enter a password into the console: ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
          int n = Validation(s1);
          if(n == 1){
              System.out.println("Password valid and accepted");
          }
          else {
              System.out.println("Error");
          }
    }
    private static int Validation(String s1) {
        if(s1.matches(".*[!]{1,}.*") && s1.matches(".*[A-Z].*") && s1.matches(".*[a-z].*") && s1.length() >=7 && s1.length()<=12){
            return  1;
        }
        else
        {
            return -1;
        }
    }
}
