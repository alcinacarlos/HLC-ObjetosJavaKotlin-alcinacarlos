package org.carlosalcina.kotlin.tareas

class Usuario(val nombre: String) {
    private val proyectos = mutableListOf<Proyecto>()

    fun crearProyecto(nombreProyecto: String) {
        val proyecto = Proyecto(nombreProyecto)
        proyectos.add(proyecto)
        println("$nombre ha creado el proyecto $nombreProyecto")
    }

    fun agregarTareaAProyecto(nombreProyecto: String, tarea: Tarea) {
        val proyecto = proyectos.find { it.nombre == nombreProyecto }
        proyecto?.agregarTarea(tarea)
    }

    fun completarTareaEnProyecto(nombreProyecto: String, nombreTarea: String) {
        val proyecto = proyectos.find { it.nombre == nombreProyecto }
        proyecto?.completarTarea(nombreTarea)
    }

    fun mostrarProyectos() {
        println("Proyectos de $nombre:")
        proyectos.forEach { it.mostrarTareas() }
    }
}