package org.carlosalcina.kotlin.tareas

fun gestionTareas(){
    val usuario = Usuario("Carlos Alcina")

    usuario.crearProyecto("Proyecto A")
    usuario.crearProyecto("Proyecto B")

    val tarea1 = Tarea("Tarea 1")
    val tarea2 = Tarea("Tarea 2")

    usuario.agregarTareaAProyecto("Proyecto A", tarea1)
    usuario.agregarTareaAProyecto("Proyecto A", tarea2)

    usuario.mostrarProyectos()

    usuario.completarTareaEnProyecto("Proyecto A", "Tarea 1")

    usuario.mostrarProyectos()
}