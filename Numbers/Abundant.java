import java.util.*;

public class Abundant { // Ex. 12 - factor sum > num
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i = i + 1;
        }

        if (sum > n) {
            System.out.println(n + " is an Abundant number");
        } else {
            System.out.println(n + " is not an Abundant number");
        }
    }
}
