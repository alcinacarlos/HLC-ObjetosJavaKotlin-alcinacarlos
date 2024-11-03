package org.carlosalcina.java.hotel.service;

import org.carlosalcina.java.hotel.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestionHotel {
    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public boolean realizarReserva(int idCliente, int numeroHabitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        Cliente cliente = clientes.stream().filter(c -> c.getId() == idCliente).findFirst().orElse(null);
        Habitacion habitacion = habitaciones.stream().filter(h -> h.getNumero() == numeroHabitacion && h.isDisponible()).findFirst().orElse(null);

        if (cliente == null || habitacion == null) return false;

        Reserva nuevaReserva = new Reserva(reservas.size() + 1, cliente, habitacion, fechaInicio, fechaFin);
        reservas.add(nuevaReserva);
        habitacion.setDisponible(false);
        return true;
    }

    public boolean cancelarReserva(int idReserva) {
        Reserva reserva = reservas.stream().filter(r -> r.getId() == idReserva).findFirst().orElse(null);

        if (reserva == null) return false;

        reserva.getHabitacion().setDisponible(true);
        reservas.remove(reserva);
        return true;
    }

    public void mostrarReservasActivas() {
        System.out.println("Reservas activas:");
        reservas.forEach(reserva -> {
            System.out.println("Reserva ID: " + reserva.getId() + ", Cliente: " + reserva.getCliente().getNombre() +
                    ", Habitación: " + reserva.getHabitacion().getNumero() +
                    ", Desde: " + reserva.getFechaInicio() + ", Hasta: " + reserva.getFechaFin());
        });
    }
}
