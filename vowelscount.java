package PST;
import java.util.Scanner;
public class vowelscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String vowels = "aeiou";
        System.out.println("Enter the word:"): 
        String word = scan.nextLine().toLowerCase();
        int vowelsCount = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (word.charAt(i) == vowels.charAt(j)) {
                    vowelsCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelsCount);
    }
}

