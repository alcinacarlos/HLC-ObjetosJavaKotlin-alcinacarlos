package org.carlosalcina.kotlin.gestionbiblioteca

import org.carlosalcina.kotlin.gestionbiblioteca.model.Libro
import org.carlosalcina.kotlin.gestionbiblioteca.model.Usuario
import org.carlosalcina.kotlin.gestionbiblioteca.service.GestorBiblioteca

fun gestionBiblotecaKotlin() {
    val biblioteca = GestorBiblioteca()

    // Agregar libros
    biblioteca.agregarLibro(Libro(1, "El Quijote"))
    biblioteca.agregarLibro(Libro(2, "Cien años de soledad"))

    // Registrar usuarios
    biblioteca.registrarUsuario(Usuario(1, "Juan"))
    biblioteca.registrarUsuario(Usuario(2, "Ana"))

    // Prestar libros
    biblioteca.prestarLibro(1, 1)
    biblioteca.prestarLibro(1, 1)

    // Mostrar libros prestados por usuario
    biblioteca.mostrarLibrosPrestados(1)

    // Devolver libro
    biblioteca.devolverLibro(1, 1)
    biblioteca.mostrarLibrosPrestados(1)
}