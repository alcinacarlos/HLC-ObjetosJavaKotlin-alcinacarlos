package org.carlosalcina.java.rpg;

public class Hechizo {
    private final String nombre;
    private final int costoMana;
    private final int danio;

    public Hechizo(String nombre, int costoMana, int danio) {
        this.nombre = nombre;
        this.costoMana = costoMana;
        this.danio = danio;
    }

    public String getNombre() { return nombre; }
    public int getCostoMana() { return costoMana; }
    public int getDanio() { return danio; }
}
