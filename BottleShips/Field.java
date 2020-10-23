public class Field {

    private FieldType[][] board;
    private int wTiles;
    private int hTiles;

    public Field(int wTiles,int hTiles){
        this.wTiles = wTiles;
        this.hTiles = hTiles;
        //create board
        this.board = new FieldType[wTiles][hTiles];

        for (int x = 0;x < wTiles;x++){
            for (int y = 0;y < hTiles;y++){
                this.board[x][y] = FieldType.water;
            }
        }


        System.out.println("Declaration succsesful.");
    }

    public FieldType getTile(int x,int y){
        if (x > this.wTiles || y > this.hTiles || x < 0 || y < 0){
            return FieldType.abyss;
        }else{
            return this.board[x][y];
        }
    }

    public void setTile(int x,int y,FieldType type){
        board[x][y] = type;
    }

    public void addBoat(int x,int y,ShipType boat,boolean rotate90){
        if (x > this.wTiles || y > this.hTiles || x < 0 || y < 0){
            System.out.println("Ti děbil you fukin blyat.");
        }else {
            boolean res = true;
            //check for collision
            for (int i = 0;i < boat.lenght;i++){
                if (this.board[x + i][y] != FieldType.water && rotate90 == false || this.board[x][y + i] != FieldType.water && rotate90 == true ){
                    res = false;
                }
            }
            //place ship
            if(res){
                for (int i = 0;i < boat.lenght;i++){
                    if (rotate90 == false){
                        board[x + i][y] = FieldType.ship;
                    }else {
                        board[x][y + i] = FieldType.ship;
                    }
                }
            }else {
                System.out.println("ne");
            }
        }
    }
}
