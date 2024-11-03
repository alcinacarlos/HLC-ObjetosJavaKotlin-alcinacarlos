package org.carlosalcina.kotlin.hotel.service

import org.carlosalcina.kotlin.hotel.model.*
import java.time.LocalDate

class GestionHotel {
    private val habitaciones = mutableListOf<Habitacion>()
    private val clientes = mutableListOf<Cliente>()
    private val reservas = mutableListOf<Reserva>()

    fun agregarHabitacion(habitacion: Habitacion) {
        habitaciones.add(habitacion)
    }

    fun registrarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun realizarReserva(idCliente: Int, numeroHabitacion: Int, fechaInicio: LocalDate, fechaFin: LocalDate): Boolean {
        val cliente = clientes.find { it.id == idCliente }
        val habitacion = habitaciones.find { it.numero == numeroHabitacion && it.disponible }

        if (cliente == null || habitacion == null) return false

        val nuevaReserva = Reserva(reservas.size + 1, cliente, habitacion, fechaInicio, fechaFin)
        reservas.add(nuevaReserva)
        habitacion.disponible = false
        return true
    }

    fun cancelarReserva(idReserva: Int): Boolean {
        val reserva = reservas.find { it.id == idReserva } ?: return false

        reserva.habitacion.disponible = true
        reservas.remove(reserva)
        return true
    }

    fun mostrarReservasActivas() {
        println("Reservas activas:")
        reservas.forEach { reserva ->
            println("Reserva ID: ${reserva.id}, Cliente: ${reserva.cliente.nombre}, Habitación: ${reserva.habitacion.numero}, Desde: ${reserva.fechaInicio}, Hasta: ${reserva.fechaFin}")
        }
    }
}