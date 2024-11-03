package org.carlosalcina.kotlin.tareas

class Proyecto(val nombre: String) {
    private val tareas = mutableListOf<Tarea>()

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }

    fun mostrarTareas() {
        println("Tareas en el proyecto '$nombre':")
        tareas.forEach { tarea ->
            val estado = if (tarea.completada) "Completada" else "Pendiente"
            println("- ${tarea.nombre}: $estado")
        }
    }

    fun completarTarea(nombreTarea: String) {
        val tarea = tareas.find { it.nombre == nombreTarea }
        tarea?.completar()
    }
}