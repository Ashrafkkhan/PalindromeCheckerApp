import java.util.Scanner;

public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    static Node head = null;

    static void append(char ch) {
        Node newNode = new Node(ch);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static boolean isPalindrome() {
        if (head == null || head.next == null)
            return true;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null, curr = slow, next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node first = head, second = prev;

        while (second != null) {
            if (first.data != second.data)
                return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        head = null;

        for (int i = 0; i < str.length(); i++) {
            append(str.charAt(i));
        }

        if (isPalindrome())
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");

        sc.close();
    }
}