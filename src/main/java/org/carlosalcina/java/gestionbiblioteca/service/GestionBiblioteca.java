package org.carlosalcina.java.gestionbiblioteca.service;

import org.carlosalcina.java.gestionbiblioteca.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GestionBiblioteca {
    private List<Libro> libros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private Map<Integer, List<Libro>> prestamos = new HashMap<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca.");
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario '" + usuario.getNombre() + "' registrado en la biblioteca.");
    }

    public void prestarLibro(int idUsuario, int idLibro) {
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getId() == idUsuario)
                .findFirst()
                .orElse(null);

        Libro libro = libros.stream()
                .filter(l -> l.getId() == idLibro)
                .findFirst()
                .orElse(null);

        if (usuario == null) {
            System.out.println("Usuario " + idUsuario + " no encontrado.");
            return;
        }

        if (libro == null) {
            System.out.println("Libro " + idLibro + " no encontrado");
            return;
        }

        if (libro.isPrestado()) {
            System.out.println("El libro '" + libro.getTitulo() + "' ya está prestado");
            return;
        }

        if (!prestamos.containsKey(idUsuario)) {
            prestamos.put(idUsuario, new ArrayList<>());
        }

        libro.setPrestado(true);
        prestamos.get(idUsuario).add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' prestado a '" + usuario.getNombre());
    }

    public void devolverLibro(int idUsuario, int idLibro) {
        List<Libro> librosPrestados = prestamos.get(idUsuario);

        if (librosPrestados == null) {
            System.out.println("El usuario " + idUsuario + " no tiene libros prestados");
            return;
        }

        Libro libro = librosPrestados.stream()
                .filter(l -> l.getId() == idLibro)
                .findFirst()
                .orElse(null);

        if (libro == null) {
            System.out.println("Libro " + idLibro + " no encontrado en los libros del usuario");
            return;
        }

        libro.setPrestado(false);
        librosPrestados.remove(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' devuelto por el usuario con ID " + idUsuario);
    }

    public void mostrarLibrosPrestados(int idUsuario) {
        List<Libro> librosPrestados = prestamos.get(idUsuario);

        if (librosPrestados == null || librosPrestados.isEmpty()) {
            System.out.println("El usuario " + idUsuario + " no tiene libros prestados");
        } else {
            System.out.println("Libros prestados por el usuario " + idUsuario);
            for (Libro libro : librosPrestados) {
                System.out.println(libro.getTitulo());
            }
        }
    }
}