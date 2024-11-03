package org.carlosalcina.kotlin.rpg

class Guerrero(nombre: String, puntosVida: Int, private val fuerza: Int) : Personaje(nombre, puntosVida) {
    fun atacar(enemigo: Personaje) {
        enemigo.recibirDanio(fuerza)
        println("$nombre ataca a ${enemigo.nombre} causando $fuerza puntos de daño")
    }
}