package org.carlosalcina.kotlin.hotel

import org.carlosalcina.kotlin.hotel.model.*
import org.carlosalcina.kotlin.hotel.service.GestionHotel
import java.time.LocalDate

fun gestionHotelKotlin(){
    val hotel = GestionHotel()

    hotel.agregarHabitacion(Habitacion(101, "Individual"))
    hotel.agregarHabitacion(Habitacion(102, "Doble"))
    hotel.registrarCliente(Cliente(1, "Carlos"))
    hotel.registrarCliente(Cliente(2, "Ana"))

    hotel.realizarReserva(1, 101, LocalDate.of(2024, 11, 10), LocalDate.of(2024, 11, 15))
    hotel.realizarReserva(2, 102, LocalDate.of(2024, 11, 12), LocalDate.of(2024, 11, 18))

    hotel.mostrarReservasActivas()

    hotel.cancelarReserva(1)

    hotel.mostrarReservasActivas()
}