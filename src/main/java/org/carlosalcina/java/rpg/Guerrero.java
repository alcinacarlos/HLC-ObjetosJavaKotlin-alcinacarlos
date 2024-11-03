package org.carlosalcina.java.rpg;

public class Guerrero extends Personaje {
    private final int fuerza;

    public Guerrero(String nombre, int puntosVida, int fuerza) {
        super(nombre, puntosVida);
        this.fuerza = fuerza;
    }

    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(fuerza);
        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " causando " + fuerza + " puntos de daño");
    }
}
