package com.reto.screenplaydespegar.model;

import java.time.LocalDate;

public class RoomReservation {

    private String destinationCity;
    private LocalDate arrivedDate;
    private LocalDate departureDate;

    public RoomReservation(String destinationCity, LocalDate arrivedDate, LocalDate departureDate) {
        this.destinationCity = destinationCity;
        this.arrivedDate = arrivedDate;
        this.departureDate = departureDate;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public LocalDate getArrivedDate() {
        return arrivedDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }
}
