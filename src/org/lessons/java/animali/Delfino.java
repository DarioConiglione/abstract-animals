package org.lessons.java.animali;

public class Delfino extends Animali implements Nuotante {

    @Override
    public void Verso() {
        System.out.println("Questo animale fischia!");
    }

    @Override
    public void Mangia() {
        System.out.println("Questo animale mangia altri pesci");
    }

    public void Nuota() {
        System.out.println("Sto nuotando!!");
    }

}
