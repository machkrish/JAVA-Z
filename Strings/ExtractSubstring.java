import java.util.*;

public class ExtractSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email:");
        String email = sc.nextLine();

        int atIndex = email.indexOf('@');

        if (atIndex == -1) {
            System.out.println("Invalid email address");
        } else {
            String domain = email.substring(atIndex + 1);
            System.out.println("Domain: " + domain);
        }
    }
}
