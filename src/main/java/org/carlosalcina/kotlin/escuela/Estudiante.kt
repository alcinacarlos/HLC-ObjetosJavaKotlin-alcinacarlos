package org.carlosalcina.kotlin.escuela

class Estudiante(val nombre: String) {
    private val cursos = mutableListOf<Curso>()
    private val calificaciones = mutableMapOf<Curso, Double>()

    fun asignarCurso(curso: Curso) {
        cursos.add(curso)
    }

    fun asignarCalificacion(curso: Curso, calificacion: Double) {
        if (curso in cursos) {
            calificaciones[curso] = calificacion
        }
    }

    fun calcularPromedio(): Double {
        return if (calificaciones.isNotEmpty()) {
            calificaciones.values.average()
        } else 0.0
    }

    fun mostrarPromedio() {
        println("Promedio de $nombre: ${calcularPromedio()}")
    }
}