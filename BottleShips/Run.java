public class Run {
    public static void main(String[] args) {
        Field play = new Field(8,8);
        //add boats
        play.addBoat(2,2,ShipType.patrolBoat,false);
        play.addBoat(0,0,ShipType.carrier,true);
        //add players
        Player player1 = new Player(play,"Hrac1");

        player1.fireAt(1,1);
        player1.fireAt(4,5);
        player1.fireAt(2,2);
        player1.fireAt(2,2);
        player1.fireAt(7,2);
        player1.fireAt(92,2);
        player1.fireAt(4,5);

    }
}
