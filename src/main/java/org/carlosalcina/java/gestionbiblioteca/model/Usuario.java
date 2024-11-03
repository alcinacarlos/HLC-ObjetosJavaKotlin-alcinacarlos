package org.carlosalcina.java.gestionbiblioteca.model;

public class Usuario {
    private final int id;
    private final String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
}
