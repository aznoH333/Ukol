import java.util.Scanner;

public class Ukol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");
        System.out.println(array[array.length - 2]);
    }
}
