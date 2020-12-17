import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        FieldFactory f = new FieldFactory();

        //init field
        Field[][] field = new Field[7][7];

        for (int x = 0;x < 7;x++){
            for (int y = 0;y < 7;y++){
                field[x][y] = f.getField("water");
            }
        }
        //add ships
        //currently scuffed
        field[1][1] = f.getField("patrol boat");
        field[1][3] = f.getField("destroyer");
        field[2][3] = f.getField("destroyer");
        field[4][3] = f.getField("battleship");
        field[4][4] = f.getField("battleship");
        field[4][5] = f.getField("battleship");

        System.out.println("Welcome to battleships : scuffed edition");
        boolean isOn = true;
        int xPos;
        int yPos;
        Scanner sc = new Scanner(System.in);

        while (isOn){
            try {
                System.out.println("-----------");
                System.out.println("input x cordinate");
                xPos = sc.nextInt();
                System.out.println("input y cordinate");
                yPos = sc.nextInt();
                System.out.println("-----------");

                field[xPos][yPos].shoot();
            }catch (Exception e){
                isOn = false;
                System.out.println("exiting program");
            }


        }


    }
}
