public class Auto {

    String jmeno;
    Motor motor;
    Palivo palivo;
    int cas = 0;
    int ujetaVzdalenost;

    public Auto(String jmenoC, Motor motorC, Palivo palivoC) {
        jmeno = jmenoC;
        motor = motorC;
        palivo = palivoC;
    }

    public String getJmeno() {
        return jmeno;
    }

    public Motor getMotor() {
        return motor;
    }

    public Palivo getPalivo() {
        return palivo;
    }

    public int jed(int vzdalenost){

        for (int i = palivo.getPocet();i > 0;i -= motor.getSpotreba()){
            ujetaVzdalenost += motor.getRychlost() * palivo.getVyhrevnost();
        }

        if (ujetaVzdalenost > vzdalenost) {
            cas = motor.getRychlost() * palivo.getVyhrevnost();
        }else{
            return -1;
        }


        return cas;
    }
}
