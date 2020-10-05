import java.util.ArrayList;
import java.util.Scanner;

public class Ukol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isOn = true;
        int input;
        ArrayList<Integer> ar = new ArrayList<Integer>();

        int nums = -999;

        while (isOn){
            try{
                input = sc.nextInt();
                if (nums == -999){
                    nums = input;
                }else if(nums > 0){
                    ar.add(input);
                    nums--;
                }else {
                    System.out.println(ar.indexOf(input));

                }


            }catch (Exception e){
                isOn = false;
                System.out.println("Program terminated");
            }

        }
    }
}
