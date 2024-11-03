package org.carlosalcina.kotlin.escuela

class Profesor(val nombre: String) {
    fun asignarCurso(estudiante: Estudiante, curso: Curso) {
        estudiante.asignarCurso(curso)
        println("Curso ${curso.nombre} asignado a ${estudiante.nombre} por $nombre")
    }

    fun asignarCalificacion(estudiante: Estudiante, curso: Curso, calificacion: Double) {
        estudiante.asignarCalificacion(curso, calificacion)
        println("Calificación de $calificacion asignada a ${estudiante.nombre} en ${curso.nombre} por $nombre")
    }
}