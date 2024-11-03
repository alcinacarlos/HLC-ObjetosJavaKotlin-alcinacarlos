package org.carlosalcina.kotlin.rpg

open class Personaje(val nombre: String, var puntosVida: Int) {
    fun recibirDanio(danio: Int) {
        puntosVida -= danio
        if (puntosVida < 0) puntosVida = 0
    }
}