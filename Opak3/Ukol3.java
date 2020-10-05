import java.util.Scanner;

public class Ukol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Počet čísel :");
        int ammount = sc.nextInt();
        int i = 0;
        int res = 0;

        while (i++ < ammount){
            res += sc.nextInt();
        }
        System.out.println("Průměr je : " + (res/ammount));
    }
}
