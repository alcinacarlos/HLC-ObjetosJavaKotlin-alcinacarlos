package org.carlosalcina.kotlin.gestionbiblioteca.model

data class Libro(
    val id: Int,
    val titulo: String,
    var prestado: Boolean = false
)