import java.util.*;

public class Special {
    public static void main(String[] args) { // sum of factorial of digits of number = number itself (145)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;
            int i = 1;

            while (i <= digit) {
                fact = fact * i;
                i = i + 1;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println(n + " is a Special number");
        } else {
            System.out.println(n + " is not a Special number");
        }
    }
}
