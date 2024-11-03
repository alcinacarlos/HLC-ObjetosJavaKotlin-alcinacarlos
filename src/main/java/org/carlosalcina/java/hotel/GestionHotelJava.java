package org.carlosalcina.java.hotel;

import org.carlosalcina.java.hotel.model.*;
import org.carlosalcina.java.hotel.service.GestionHotel;

import java.time.LocalDate;

public class GestionHotelJava {
    public static void main(String[] args) {
        GestionHotel hotel = new GestionHotel();

        hotel.agregarHabitacion(new Habitacion(101, "Individual"));
        hotel.agregarHabitacion(new Habitacion(102, "Doble"));
        hotel.registrarCliente(new Cliente(1, "Carlos"));
        hotel.registrarCliente(new Cliente(2, "Ana"));

        hotel.realizarReserva(1, 101, LocalDate.of(2024, 11, 10), LocalDate.of(2024, 11, 15));
        hotel.realizarReserva(2, 102, LocalDate.of(2024, 11, 12), LocalDate.of(2024, 11, 18));

        hotel.mostrarReservasActivas();

        hotel.cancelarReserva(1);

        hotel.mostrarReservasActivas();
    }
}
