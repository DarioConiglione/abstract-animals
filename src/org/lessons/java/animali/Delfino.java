package org.lessons.java.animali;

public class Delfino extends Animali implements Nuotante {

    @Override
    public void verso() {
        System.out.println("Questo animale fischia!");
    }

    @Override
    public void mangia() {
        System.out.println("Questo animale mangia altri pesci");
    }

    public void nuota() {
        System.out.println("Sto nuotando!!");
    }

}
