import java.util.Scanner;

public class Ukol2 {
    public static void main(String[] args) {
        System.out.println("Zadej text :");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = input.length() - 1;i >= 0;i--){
            System.out.print(input.charAt(i));
        }
    }
}
