package org.lessons.java.animali;

public class Aquila extends Animali implements Volante {

    @Override
    public void verso() {
        System.out.println("Questo animale stride!");
    }

    @Override
    public void mangia() {
        System.out.println("Questo animale mangia altri animali di piccola dimensione");
    }

    public void vola() {
        System.out.println("Sto volando!!");
    }

}
