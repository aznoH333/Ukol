import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ukol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (!letters.containsKey(text.toLowerCase().charAt(i))) {
                    letters.put(text.toLowerCase().charAt(i), 1);
                } else {
                    letters.put(text.toLowerCase().charAt(i), letters.get(text.toLowerCase().charAt(i)) + 1);
                }
            }
        }
        letters.forEach((jes, l) -> System.out.println("Písmeno " + jes + " se objevilo " + l + " krát."));
    }
}
