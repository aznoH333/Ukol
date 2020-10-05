import java.util.Scanner;

public class Ukol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String[] lol = text.split(" ");
        System.out.println("Počet slov : " + lol.length);
    }
}
