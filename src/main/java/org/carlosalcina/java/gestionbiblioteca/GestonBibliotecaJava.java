package org.carlosalcina.java.gestionbiblioteca;

import org.carlosalcina.java.gestionbiblioteca.model.*;
import org.carlosalcina.java.gestionbiblioteca.service.GestionBiblioteca;

public class GestonBibliotecaJava {
    public static void main(String[] args) {
        GestionBiblioteca biblioteca = new GestionBiblioteca();

        biblioteca.agregarLibro(new Libro(1, "Libro ejemplo"));
        biblioteca.agregarLibro(new Libro(2, "Hola mundo libro 10"));

        biblioteca.registrarUsuario(new Usuario(1, "Lucas"));
        biblioteca.registrarUsuario(new Usuario(2, "carla"));

        biblioteca.prestarLibro(1, 1);
        biblioteca.prestarLibro(1, 1);

        biblioteca.mostrarLibrosPrestados(1);

        biblioteca.devolverLibro(1, 1);
        biblioteca.mostrarLibrosPrestados(1);
    }
}
