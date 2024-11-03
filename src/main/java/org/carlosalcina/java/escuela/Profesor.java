package org.carlosalcina.java.escuela;

public class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void asignarCurso(Estudiante estudiante, Curso curso) {
        estudiante.asignarCurso(curso);
        System.out.println("Curso " + curso.getNombre() + " asignado a " + estudiante.nombre + " por " + nombre);
    }

    public void asignarCalificacion(Estudiante estudiante, Curso curso, double calificacion) {
        estudiante.asignarCalificacion(curso, calificacion);
        System.out.println("Calificación de " + calificacion + " asignada a " + estudiante.nombre + " en " + curso.getNombre() + " por " + nombre);
    }
}
