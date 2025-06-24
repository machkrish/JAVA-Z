import java.util.*;

public class CaseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            } else {
                result = result + ch;
            }
        }

        System.out.println("Converted: " + result);
    }
}
