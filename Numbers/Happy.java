import java.util.*;

public class Happy {
    public static void main(String[] args) { // square of digit of number until it is 1 (Ex 19)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int slow = n;
        int fast = n;

        do {
            slow = getSquareSum(slow);
            fast = getSquareSum(getSquareSum(fast));
        } while (slow != fast);

        if (slow == 1) {
            System.out.println(n + " is a Happy number");
        } else {
            System.out.println(n + " is not a Happy number");
        }
    }

    public static int getSquareSum(int n) {
        int sum = 0;
        int digit;

        while (n != 0) {
            digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
        }

        return sum;
    }
}
