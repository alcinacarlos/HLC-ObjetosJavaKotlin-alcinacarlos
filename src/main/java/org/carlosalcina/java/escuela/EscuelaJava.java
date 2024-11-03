package org.carlosalcina.java.escuela;

public class EscuelaJava {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Manuel");
        Estudiante estudiante1 = new Estudiante("Josema");
        Estudiante estudiante2 = new Estudiante("Carlitos");

        Curso cursoMates = new Curso("Mates");
        Curso cursoLengua = new Curso("Lengua");

        profesor.asignarCurso(estudiante1, cursoMates);
        profesor.asignarCurso(estudiante1, cursoLengua);
        profesor.asignarCurso(estudiante2, cursoMates);

        profesor.asignarCalificacion(estudiante1, cursoMates, 8.5);
        profesor.asignarCalificacion(estudiante1, cursoLengua, 9.0);
        profesor.asignarCalificacion(estudiante2, cursoMates, 7.0);

        estudiante1.mostrarPromedio();
        estudiante2.mostrarPromedio();
    }
}
