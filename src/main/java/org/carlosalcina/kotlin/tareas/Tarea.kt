package org.carlosalcina.kotlin.tareas

class Tarea(val nombre: String) {
    var completada: Boolean = false
        private set

    fun completar() {
        completada = true
    }
}