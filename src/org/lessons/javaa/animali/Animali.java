package org.lessons.javaa.animali;

public abstract class Animali {

    String nome;

    public void Dormi() {
        System.out.println("Questo animale sta dormendo");
    }

    public abstract void Verso();

    public abstract void Mangia();
}
