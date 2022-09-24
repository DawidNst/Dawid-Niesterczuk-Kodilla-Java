package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {

        Flight flights = new Flight("Rasia", "Warsaw");
        Flight flights2 = new Flight("Scotland", "USA");
        FlightSearch flightSearch = new FlightSearch();

        try {
            boolean canFly = flightSearch.findFlight(flights);
            System.out.println("Fly to " + flights.getArrivalAirport());
        } catch (RouteNotFoundException s) {
            System.out.println(s);
        }

        try {
            boolean canFly2 = flightSearch.findFlight(flights2);
            System.out.println("Fly to " + flights2.getArrivalAirport());
        } catch (RouteNotFoundException s) {
            System.out.println("Fly to " + flights2.getArrivalAirport() + "\n" + s);
        }
    }
}