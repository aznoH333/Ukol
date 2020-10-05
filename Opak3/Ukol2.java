import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ukol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Počet čísel :");
        int ammount = sc.nextInt();
        ArrayList<Integer> intList = new ArrayList<Integer>();

        for (int i = ammount;i > 0;i--){
            intList.add(sc.nextInt());
        }
        Collections.sort(intList);
        if (ammount % 2 == 1){
            System.out.println("Median je: " + intList.get((int) Math.ceil(intList.size()/2)));
        }else{
            System.out.println("Median je: "+ ((double)(intList.get(intList.size()/2) + intList.get(intList.size()/2 - 1))/2));
        }
    }
}
