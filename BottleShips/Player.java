public class Player {

    private Field board;
    private String name;

    public Player(Field board,String name){
        this.board = board;
        this.name = name;
    }

    public void fireAt(int x,int y){
        System.out.println("Hráč "+ name + " útočí na pole : " + x + ","+ y);
        switch (board.getTile(x,y)){
            case water:
                System.out.println("Trefil vodu.");
                board.setTile(x,y,FieldType.miss);
                break;
            case ship:
                System.out.println("Zásah!");
                board.setTile(x,y,FieldType.hit);
                break;
            case abyss:
                System.out.println("Střelil mimo pole");
                break;
            case hit:
                System.out.println("Trefil vrak lodi");
                break;
            case miss:
                System.out.println("Tam už ale střílel");
                break;
        }
    }
}
