package org.lessons.java.animali;

public class Passerotto extends Animali implements Volante {

    @Override
    public void verso() {
        System.out.println("Questo animale cinguetta!");
    }

    @Override
    public void mangia() {
        System.out.println("Questo animale mangia semi ed insetti");
    }

    public void vola() {
        System.out.println("Sto volando!!");
    }

}
