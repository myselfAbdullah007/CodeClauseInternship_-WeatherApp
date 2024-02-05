package DTO;

import java.util.List;

public class Reservation {
    private static int nextReservationId = 1;

    private int reservationId;
    private Movie movie;
    private List<Seat> selectedSeats;
    // You can add more attributes as needed

    // Constructor
    public Reservation(Movie movie, List<Seat> selectedSeats) {
        this.reservationId = nextReservationId++;
        this.movie = movie;
        this.selectedSeats = selectedSeats;
        // Initialize other details if needed
    }

    // Getter for reservationId
    public int getReservationId() {
        return reservationId;
    }

    // Getter for movie
    public Movie getMovie() {
        return movie;
    }

    // Getter for selectedSeats
    public List<Seat> getSelectedSeats() {
        return selectedSeats;
    }

    // Display reservation details
    public void displayReservationDetails() {
        System.out.println("Reservation Details:");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Selected Seats: ");
        for (Seat seat : selectedSeats) {
            System.out.print(seat + " ");
        }
        System.out.println();
    }
}
