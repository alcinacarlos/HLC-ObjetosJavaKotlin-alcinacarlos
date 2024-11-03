package org.carlosalcina.java.tareas;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final String nombre;
    private final List<Proyecto> proyectos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public void crearProyecto(String nombreProyecto) {
        Proyecto proyecto = new Proyecto(nombreProyecto);
        proyectos.add(proyecto);
        System.out.println(nombre + " ha creado el proyecto '" + nombreProyecto + "'.");
    }

    public void agregarTareaAProyecto(String nombreProyecto, Tarea tarea) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.nombre.equals(nombreProyecto)) {
                proyecto.agregarTarea(tarea);
                break;
            }
        }
    }

    public void completarTareaEnProyecto(String nombreProyecto, String nombreTarea) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.nombre.equals(nombreProyecto)) {
                proyecto.completarTarea(nombreTarea);
                break;
            }
        }
    }

    public void mostrarProyectos() {
        System.out.println("Proyectos de " + nombre + ":");
        for (Proyecto proyecto : proyectos) {
            proyecto.mostrarTareas();
        }
    }
}
