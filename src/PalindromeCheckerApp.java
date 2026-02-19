import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2=s2+s.charAt(i);
        }
        if (s.equals(s2)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
