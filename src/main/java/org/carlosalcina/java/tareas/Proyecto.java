package org.carlosalcina.java.tareas;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    public String nombre;
    private final List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareas() {
        System.out.println("Tareas en el proyecto '" + nombre + "':");
        for (Tarea tarea : tareas) {
            String estado = tarea.isCompletada() ? "Completada" : "Pendiente";
            System.out.println("- " + tarea.getNombre() + ": " + estado);
        }
    }

    public void completarTarea(String nombreTarea) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombreTarea)) {
                tarea.completar();
                break;
            }
        }
    }
}
