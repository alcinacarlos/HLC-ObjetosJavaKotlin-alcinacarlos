package org.carlosalcina.java.gestionbiblioteca.model;

public class Libro {
    private final int id;
    private final String titulo;
    private boolean prestado;

    public Libro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.prestado = false;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public boolean isPrestado() { return prestado; }
    public void setPrestado(boolean prestado) { this.prestado = prestado; }
}

