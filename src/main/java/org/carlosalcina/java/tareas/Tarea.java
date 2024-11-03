package org.carlosalcina.java.tareas;

public class Tarea {
    private final String nombre;
    private boolean completada;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completar() {
        completada = true;
    }
}
