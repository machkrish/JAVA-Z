import java.util.*;

public class Perfect {
    public static void main(String[] args) { //28 sum of all divisors except itself
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i = i + 1;
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect number");
        } else {
            System.out.println(n + " is not a Perfect number");
        }
    }
}
