package com.reto.screenplaydespegar.model;

import java.time.LocalDate;

public class OneWayFlightBuilder {

    private String departureCity;
    private String destinationCity;
    private LocalDate departureDate;

    public OneWayFlightBuilder(String departureCity) {
        this.departureCity = departureCity;
    }

    public static OneWayFlightBuilder departureCity(String departureCity) {
        return new OneWayFlightBuilder(departureCity);
    }

    public OneWayFlightBuilder destinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
        return this;
    }

    public OneWayFlightBuilder departureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
        return this;
    }

    public OneWayFlight totalPassengers(Integer totalPassengers) {
        return new OneWayFlight(
                this.departureCity,
                this.destinationCity,
                this.departureDate,
                totalPassengers
        );
    }
}
