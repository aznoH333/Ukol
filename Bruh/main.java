public class main {
    public static void main(String[] args) {
        Player bach = new Player(0,10,1,2);
        Player blah = new Player(0,0,1,1);
        Wall hah = new Wall(0,0,0 ,2);

        if (blah.collisionW(hah)){
            System.out.println("blah collides with hah");
        }
        if (bach.collisionP(blah)){
            System.out.println("blach collides with blach");
        }

    }
}
