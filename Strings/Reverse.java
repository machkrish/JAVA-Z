import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }
            result = result + rev + " ";
        }

        System.out.println("Reversed words: " + result.trim());
    }
}
