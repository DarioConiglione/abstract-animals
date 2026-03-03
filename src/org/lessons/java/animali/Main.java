package org.lessons.java.animali;

public class Main {

    public static void main(String[] args) {

        Aquila aquilaPescatrice = new Aquila();
        Passerotto passeroComune = new Passerotto();
        Delfino delfinoPescatore = new Delfino();

        aquilaPescatrice.mangia();
        faiVolare(aquilaPescatrice);

        passeroComune.dormi();
        passeroComune.verso();

        delfinoPescatore.mangia();
        faiNuotare(delfinoPescatore);

        passeroComune.vola();

    }

    public static void faiVolare(Volante qualsiasiCosaVoli) {
        qualsiasiCosaVoli.vola();
    }

    public static void faiNuotare(Nuotante qualsiasiCosaNuoti) {
        qualsiasiCosaNuoti.nuota();
    }

}
