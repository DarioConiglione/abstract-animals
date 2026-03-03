package org.lessons.java.animali;

public class Aquila extends Animali implements Volante {

    @Override
    public void Verso() {
        System.out.println("Questo animale stride!");
    }

    @Override
    public void Mangia() {
        System.out.println("Questo animale mangia altri animali di piccola dimensione");
    }

    public void Vola() {
        System.out.println("Sto volando!!");
    }

}
