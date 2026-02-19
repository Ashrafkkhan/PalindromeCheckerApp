import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;
        while (end < start) {
            if (arr[end] != arr[start]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }
}
