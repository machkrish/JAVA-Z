import java.util.*;

public class Palindrome {
    public static void main(String[] args) { // rev == actual no. 313
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;
        int digit;

        while (temp != 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (rev == n) {
            System.out.println(n + " is a Palindrome number");
        } else {
            System.out.println(n + " is not a Palindrome number");
        }
    }
}
