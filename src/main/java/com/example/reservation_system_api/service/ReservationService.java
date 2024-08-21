package com.example.reservation_system_api.service;

import com.example.reservation_system_api.domain.entities.Customer;
import com.example.reservation_system_api.domain.entities.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    private List<Reservation> reservations = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public Reservation createReservation(Reservation reservation){
        Customer customer = customers.stream()
                .filter(c->c.getId().equals(reservation.getCustomer().getId()))
                .findFirst()
                .orElseThrow(()->new RuntimeException("Customner not found"));

        reservation.setCustomer(customer);
        reservation.setId((long) (reservations.size()));
        reservations.add(reservation);
        return reservation;

    }

    public List<Reservation>getAllReservations(){
        return reservations;
    }

}
