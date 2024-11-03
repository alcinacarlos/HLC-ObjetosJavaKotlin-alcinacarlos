package org.carlosalcina.java.escuela;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estudiante {
    public String nombre;
    private List<Curso> cursos = new ArrayList<>();
    private Map<Curso, Double> calificaciones = new HashMap<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void asignarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void asignarCalificacion(Curso curso, double calificacion) {
        if (cursos.contains(curso)) {
            calificaciones.put(curso, calificacion);
        }
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) return 0.0;
        return calificaciones.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public void mostrarPromedio() {
        System.out.println("Promedio de " + nombre + ": " + calcularPromedio());
    }
}