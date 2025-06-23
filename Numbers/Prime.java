import java.util.*;

public class Prime {
    public static void main(String[] args) { // no. of divisors or factors are 2 only (ex. 7)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int count = 0;
        int i = 1;

        while (i <= n) {
            if (n % i == 0) {
                count = count + 1;
            }
            i = i + 1;
        }

        if (count == 2) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is not a Prime number");
        }
    }
}
