package com.reto.screenplaydespegar.exceptions;

public class NotIsAOneWayFlightError extends AssertionError{

    public static final String MESSAGE = "Not is a One Way Flight";

    public NotIsAOneWayFlightError(String message, Throwable cause) {
        super(message, cause);
    }

    public static String notIsAOneWayFlight() {
        return MESSAGE;
    }
}
