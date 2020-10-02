public class Main {
    public static void main(String[] args) {
        Auto[] auta =
                {
                        new Auto("Auto1", new Motor(1, 1), new Palivo( 1,100000)),
                        new Auto("Auto2", new Motor(2, 2), new Palivo( 1,10)),
                        new Auto("Sportak", new Motor(200, 100), new Palivo( 1,102)),
                };
        Trat t = new Trat(9000, auta);
        t.brmBrm();
    }
}
