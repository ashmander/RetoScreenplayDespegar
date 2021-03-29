package com.reto.screenplaydespegar.model;

import java.time.LocalDate;

public class OneWayFlight {

    private String departureCity;
    private String destinationCity;
    private LocalDate departureDate;
    private Integer totalPassengers;

    public OneWayFlight(String departureCity, String destinationCity, LocalDate departureDate, Integer totalPassengers) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureDate = departureDate;
        this.totalPassengers = totalPassengers;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public Integer getTotalPassengers() {
        return totalPassengers;
    }
}
