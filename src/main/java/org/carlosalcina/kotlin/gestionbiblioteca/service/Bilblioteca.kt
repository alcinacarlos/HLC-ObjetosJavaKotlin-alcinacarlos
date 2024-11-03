package org.carlosalcina.kotlin.gestionbiblioteca.service

import org.carlosalcina.kotlin.gestionbiblioteca.model.Libro
import org.carlosalcina.kotlin.gestionbiblioteca.model.Usuario

class GestorBiblioteca {
    private val libros = mutableListOf<Libro>()
    private val usuarios = mutableListOf<Usuario>()
    private val prestamos = mutableMapOf<Int, MutableList<Libro>>()

    fun agregarLibro(libro: Libro) {
        libros.add(libro)
        println("Libro ${libro.titulo} agregado")
    }

    fun registrarUsuario(usuario: Usuario) {
        usuarios.add(usuario)
        println("Usuario ${usuario.nombre} registrado")
    }

    fun prestarLibro(idUsuario: Int, idLibro: Int) {
        val usuario = usuarios.find { it.id == idUsuario }
        val libro = libros.find { it.id == idLibro }

        if (usuario == null) {
            println("Usuario $idUsuario no encontrado")
            return
        }

        if (libro == null) {
            println("Libro $idLibro no encontrado")
            return
        }

        if (libro.prestado) {
            println("El libro ${libro.titulo} ya está prestado")
            return
        }

        if (!prestamos.containsKey(idUsuario)) {
            prestamos[idUsuario] = mutableListOf()
        }

        libro.prestado = true
        prestamos[idUsuario]!!.add(libro)
        println("Libro ${libro.titulo} prestado a ${usuario.nombre}")
    }

    fun devolverLibro(idUsuario: Int, idLibro: Int) {
        val libro = libros.find { it.id == idLibro }

        if (libro == null) {
            println("Libro $idLibro no encontrado")
            return
        }

        if (!libro.prestado) {
            println("${libro.titulo} no está prestado")
            return
        }

        prestamos[idUsuario]?.remove(libro)
        libro.prestado = false
        println("Libro ${libro.titulo} devuelto por el usuario con ID $idUsuario")
    }

    fun mostrarLibrosPrestados(idUsuario: Int) {
        val librosPrestados = prestamos[idUsuario]
        if (librosPrestados.isNullOrEmpty()) {
            println("El usuario $idUsuario no tiene libros prestados")
        } else {
            println("Libros prestados por el usuario $idUsuario: ")
            librosPrestados.forEach { println(it.titulo) }
        }
    }
}