public enum ShipType {
    carrier(5),
    battleship(4),
    destroyer(3),
    submarine(3),
    patrolBoat(2);

    public final int lenght;

    private ShipType(int lenght){
        this.lenght = lenght;
    }
}
