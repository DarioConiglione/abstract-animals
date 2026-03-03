package org.lessons.java.animali;

public class Passerotto extends Animali implements Volante {

    @Override
    public void Verso() {
        System.out.println("Questo animale cinguetta!");
    }

    @Override
    public void Mangia() {
        System.out.println("Questo animale mangia semi ed insetti");
    }

    public void Vola() {
        System.out.println("Sto volando!!");
    }

}
