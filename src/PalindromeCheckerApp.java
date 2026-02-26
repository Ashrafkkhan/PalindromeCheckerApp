import java.util.Scanner;
import java.util.Stack;

class PalindromeChecker {

    public boolean checkPalindrome(String str) {
        if (str == null)
            return false;

        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();

        for (char ch : arr) {
            stack.push(ch);
        }

        for (char ch : arr) {
            if (ch != stack.pop())
                return false;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(input))
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");

        sc.close();
    }
}