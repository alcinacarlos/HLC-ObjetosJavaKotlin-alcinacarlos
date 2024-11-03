package org.carlosalcina.kotlin.escuela

fun EscuelaKotlin() {
    val profesor = Profesor("Lucas")
    val estudiante1 = Estudiante("Manuel")
    val estudiante2 = Estudiante("Carlitos")

    val cursoMates = Curso("Mates")
    val cursoLengua = Curso("Lengua")

    profesor.asignarCurso(estudiante1, cursoMates)
    profesor.asignarCurso(estudiante1, cursoLengua)
    profesor.asignarCurso(estudiante2, cursoMates)

    profesor.asignarCalificacion(estudiante1, cursoMates, 8.5)
    profesor.asignarCalificacion(estudiante1, cursoLengua, 9.0)
    profesor.asignarCalificacion(estudiante2, cursoMates, 7.0)

    estudiante1.mostrarPromedio()
    estudiante2.mostrarPromedio()
}