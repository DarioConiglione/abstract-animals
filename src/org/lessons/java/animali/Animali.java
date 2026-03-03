package org.lessons.java.animali;

public abstract class Animali {

    String nome;

    public void dormi() {
        System.out.println("Questo animale sta dormendo");
    }

    public abstract void verso();

    public abstract void mangia();
}
