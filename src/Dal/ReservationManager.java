package Dal;

import java.util.List;

import DTO.Movie;
import DTO.Reservation;
import DTO.Seat;

public class ReservationManager {
    public Reservation makeReservation(Movie movie, List<Seat> selectedSeats) {
        // Create a reservation for the selected movie and seats
        Reservation reservation = new Reservation(movie, selectedSeats);
        // Additional logic to store the reservation, update database, etc., can be added here
        return reservation;
    }
}
