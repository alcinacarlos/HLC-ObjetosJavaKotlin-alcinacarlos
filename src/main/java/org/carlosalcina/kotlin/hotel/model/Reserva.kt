package org.carlosalcina.kotlin.hotel.model

import java.time.LocalDate

data class Reserva(
    val id: Int,
    val cliente: Cliente,
    val habitacion: Habitacion,
    val fechaInicio: LocalDate,
    val fechaFin: LocalDate
)