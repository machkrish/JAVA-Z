import java.util.*;

public class Floyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // use if-else if alternating, logic is this for all
                num++;
            }
            System.out.println();
        }
    }
}
