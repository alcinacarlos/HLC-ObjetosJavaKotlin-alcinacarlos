package org.carlosalcina.java.rpg;

public class Personaje {
    protected String nombre;
    protected int puntosVida;

    public Personaje(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    public String getNombre() { return nombre; }
    public int getPuntosVida() { return puntosVida; }

    public void recibirDanio(int danio) {
        puntosVida -= danio;
        if (puntosVida < 0) puntosVida = 0;
    }
}