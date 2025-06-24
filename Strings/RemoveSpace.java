import java.util.*;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with spaces:");
        String str = sc.nextLine();

        String noSpaces = str.replace(" ", "");
        System.out.println("Without spaces: " + noSpaces);
    }
}
