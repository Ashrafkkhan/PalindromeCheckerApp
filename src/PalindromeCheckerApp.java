import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main (String[] args){
        System.out.println("Welcome to the Palindrome checker APP");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s = s.toLowerCase().replaceAll("\\s", "");
        int l=0;
        int h=s.length()-1;
        int flag=0;
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)){
                System.out.println("Its not a palindrome");
                flag=1;
                break;}
            l++;
            h--;
        }if(flag==0){
            System.out.println("It is a palindrome");
        }

    }
}
