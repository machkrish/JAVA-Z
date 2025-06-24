import java.util.*;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Strings are exactly equal");
        } else {
            System.out.println("Strings are not exactly equal");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal ignoring case");
        } else {
            System.out.println("Strings are not equal even ignoring case");
        }

        int compare = s1.compareTo(s2);
        System.out.println("Lexicographic comparison result: " + compare);
    }
}
