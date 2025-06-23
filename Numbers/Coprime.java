import java.util.*;

public class Coprime {
    public static void main(String[] args) { // 8,15 (greatest common divisor is 1)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int gcd = 1;
        int i = 1;

        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i = i + 1;
        }

        if (gcd == 1) {
            System.out.println(a + " and " + b + " are Co-prime numbers");
        } else {
            System.out.println(a + " and " + b + " are not Co-prime numbers");
        }
    }
}
