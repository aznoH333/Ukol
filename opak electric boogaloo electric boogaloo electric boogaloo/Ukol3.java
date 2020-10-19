import java.util.Scanner;

public class Ukol3 {
    public static void main(String[] args) {
        System.out.println("Zadej vstup :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String out = "";

        for (int i = input.length() - 1;i >= 0;i--){
            out += input.charAt(i);
        }
        if (out.equals(input)){
            System.out.println(input + " je palindrom.");
        }else{
            System.out.println(input + " není palindrom.");
        }
    }
}
