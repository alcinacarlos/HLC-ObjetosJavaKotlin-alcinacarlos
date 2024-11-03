package org.carlosalcina.java.tareas;

public class TareasJava {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos Alcina");

        usuario.crearProyecto("Proyecto 1");
        usuario.crearProyecto("Proyecto 2");

        Tarea tarea1 = new Tarea("Tarea muy importante");
        Tarea tarea2 = new Tarea("Tarea 2 mas importante");

        usuario.agregarTareaAProyecto("Proyecto 1", tarea1);
        usuario.agregarTareaAProyecto("Proyecto 2", tarea2);

        usuario.mostrarProyectos();

        usuario.completarTareaEnProyecto("Proyecto 1", "Tarea muy importante");

        usuario.mostrarProyectos();
    }
}
