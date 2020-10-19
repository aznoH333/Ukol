import java.util.Scanner;

public class Ukol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vlož první string:");
        String text = sc.nextLine();

        System.out.println("Vlož hledanou část:");
        String search = sc.nextLine();

        if (text.indexOf(search) == 0){
            System.out.println(text +" začíná stringem : " + search);
        }else{
            System.out.println(text +" nezačíná hledaným stringem.");
        }
    }
}
