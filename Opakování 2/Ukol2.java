import java.util.Scanner;

public class Ukol2 {
    public static void main(String[] args) {
        boolean res = true;
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int i = 2;
        while (l > 0){
            res = true;
            for (int j = 2;j < i;j++){
                if(i % j == 0){
                    res = false;
                }
            }
            if (res == true){
                System.out.println(i);
                l--;
            }
            i++;
        }
    }
}
