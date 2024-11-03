package org.carlosalcina.kotlin.rpg

class Mago(nombre: String, puntosVida: Int, private var mana: Int) : Personaje(nombre, puntosVida) {
    private val hechizos = mutableListOf<Hechizo>()

    fun aprenderHechizo(hechizo: Hechizo) {
        hechizos.add(hechizo)
    }

    fun usarHechizo(nombreHechizo: String, objetivo: Personaje) {
        val hechizo = hechizos.find { it.nombre == nombreHechizo }
        if (hechizo != null && mana >= hechizo.costoMana) {
            mana -= hechizo.costoMana
            objetivo.recibirDanio(hechizo.danio)
            println("$nombre usa ${hechizo.nombre} en ${objetivo.nombre} causando ${hechizo.danio} puntos de daño")
        } else {
            println("$nombre no tiene suficiente mana o no conoce el hechizo $nombreHechizo.")
        }
    }
}