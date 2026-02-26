import java.util.*;

interface PalindromeStrategy {
    boolean check(String str);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();

        for (char ch : arr)
            stack.push(ch);

        for (char ch : arr)
            if (ch != stack.pop())
                return false;

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray())
            deque.addLast(ch);

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }
}

class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String str) {
        return strategy.check(str);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack");
        System.out.println("2. Deque");
        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        if (context.execute(input))
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");

        sc.close();
    }
}