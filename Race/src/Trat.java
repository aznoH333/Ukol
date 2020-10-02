public class Trat {

    int delka;
    Auto[] auta;


    public Trat(int delkaC,Auto[] autaC){
        delka = delkaC;
        auta = autaC;
    }

    public void brmBrm() {
        Auto nejrychlejsi = null;
        int nejrychlejsiCas = 0;

        for (int i = 0;i < auta.length;i++){

            if (auta[i].jed(delka) > nejrychlejsiCas){
                nejrychlejsi = auta[i];
                nejrychlejsiCas = auta[i].jed(delka);
            }
        }
        if (nejrychlejsiCas > 0) {
            System.out.println("Zavod vyhral : " + nejrychlejsi.getJmeno());
        }else {
            System.out.println("Nikdo nedojel");
        }
    }
}
