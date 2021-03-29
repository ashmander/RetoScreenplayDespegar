package com.reto.screenplaydespegar.model;

import java.time.LocalDate;

public class RoomReservationBuilder {

    private String destinationCity;
    private LocalDate arrivedDate;

    public RoomReservationBuilder(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public static RoomReservationBuilder destinationCity(String destinationCity) {
        return new RoomReservationBuilder(destinationCity);
    }

    public RoomReservationBuilder arrivedDate(LocalDate arrivedDate) {
        this.arrivedDate = arrivedDate;
        return  this;
    }

    public RoomReservation departureDate(LocalDate departureDate) {
        return new RoomReservation(
                this.destinationCity,
                this.arrivedDate,
                departureDate
        );
    }
}
