import java.util.*;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = str.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("After replacing vowels: " + result);
    }
}
