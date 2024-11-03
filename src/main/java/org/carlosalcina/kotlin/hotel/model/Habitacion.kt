package org.carlosalcina.kotlin.hotel.model

data class Habitacion(
    val numero: Int,
    val tipo: String,
    var disponible: Boolean = true
)
