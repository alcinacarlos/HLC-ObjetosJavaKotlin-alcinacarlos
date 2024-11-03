package org.carlosalcina.java.rpg;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personaje {
    private int mana;
    private final List<Hechizo> hechizos;

    public Mago(String nombre, int puntosVida, int mana) {
        super(nombre, puntosVida);
        this.mana = mana;
        this.hechizos = new ArrayList<>();
    }

    public void aprenderHechizo(Hechizo hechizo) {
        hechizos.add(hechizo);
    }

    public void usarHechizo(String nombreHechizo, Personaje objetivo) {
        Hechizo hechizo = hechizos.stream().filter(h -> h.getNombre().equals(nombreHechizo)).findFirst().orElse(null);

        if (hechizo != null && mana >= hechizo.getCostoMana()) {
            mana -= hechizo.getCostoMana();
            objetivo.recibirDanio(hechizo.getDanio());
            System.out.println(nombre + " usa " + hechizo.getNombre() + " en " + objetivo.getNombre() +
                    " causando " + hechizo.getDanio() + " puntos de daño");
        } else {
            System.out.println(nombre + " no tiene suficiente mana o no conoce el hechizo " + nombreHechizo);
        }
    }
}
