package org.carlosalcina.java.rpg;

public class RpgJava {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("DonDragon", 100, 15);
        Mago mago = new Mago("Nanometro", 80, 50);

        Hechizo fuego = new Hechizo("Tornado", 20, 30);
        Hechizo hielo = new Hechizo("Explosion", 15, 20);

        mago.aprenderHechizo(fuego);
        mago.aprenderHechizo(hielo);

        guerrero.atacar(mago);
        mago.usarHechizo("Tornado", guerrero);
        mago.usarHechizo("Explosion", guerrero);
    }
}
