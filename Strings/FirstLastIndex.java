import java.util.*;

public class FirstLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter character to search:");
        char ch = sc.next().charAt(0);

        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);

        if (first == -1) {
            System.out.println("Character not found");
        } else {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        }
    }
}
