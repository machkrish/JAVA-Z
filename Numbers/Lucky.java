import java.util.*;

public class Lucky {
    public static void main(String[] args) { // 13 - Survives Josephus-style elimination
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int counter = 2;
        int pos = n;

        while (counter <= pos) {
            if (pos % counter == 0) {
                System.out.println(n + " is not a Lucky number");
                return;
            }
            pos = pos - (pos / counter);
            counter = counter + 1;
        }

        System.out.println(n + " is a Lucky number");
    }
}
