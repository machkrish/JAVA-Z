import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        str = str.replaceAll("\\s", "").toLowerCase();

        while (str.length() > 0) {
            char ch = str.charAt(0);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " → " + count);
            str = str.replaceAll(String.valueOf(ch), "");
        }
    }
}
