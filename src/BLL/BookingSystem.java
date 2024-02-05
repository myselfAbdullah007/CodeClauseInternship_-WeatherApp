package BLL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DTO.Movie;
import DTO.Reservation;
import DTO.Seat;
import Dal.MovieCatalog;
import Dal.ReservationManager;

// Business Logic Layer
public class BookingSystem {
    private MovieCatalog movieCatalog;
    private ReservationManager reservationManager;
    private Scanner scanner;

    public BookingSystem() {
        this.movieCatalog = new MovieCatalog();
        this.reservationManager = new ReservationManager();
        this.scanner = new Scanner(System.in);
    }

    public void startBooking() {
        // Display available movies
        movieCatalog.displayMovies();

        // User selects a movie
        System.out.println("Enter the number of the movie you want to select: ");
        int movieIndex = scanner.nextInt();
        Movie selectedMovie = movieCatalog.selectMovie(movieIndex - 1);

        if (selectedMovie == null) {
            System.out.println("Invalid movie selection. Exiting booking system.");
            return;
        }

        // Display available seats for the selected movie
        selectedMovie.displaySeats();

        // User selects seats
        System.out.println("Enter the seat numbers you want to select (separated by spaces): ");
        scanner.nextLine(); // Consume the newline character
        String seatNumbersInput = scanner.nextLine();
        String[] seatNumbersArray = seatNumbersInput.split("\\s+");
        List<Integer> selectedSeatNumbers = parseSeatNumbers(seatNumbersArray);

        // Make a reservation
        if (selectedSeatNumbers.isEmpty()) {
            System.out.println("No seats selected. Exiting booking system.");
            return;
        }

        List<Seat> selectedSeats = selectedMovie.selectSeats(selectedSeatNumbers);
        Reservation reservation = reservationManager.makeReservation(selectedMovie, selectedSeats);

        // Display booking details
        reservation.displayReservationDetails();
    }

    private List<Integer> parseSeatNumbers(String[] seatNumbersArray) {
        List<Integer> seatNumbers = new ArrayList<>();
        for (String seatNumber : seatNumbersArray) {
            try {
                seatNumbers.add(Integer.parseInt(seatNumber));
            } catch (NumberFormatException e) {
                System.out.println("Invalid seat number format: " + seatNumber);
            }
        }
        return seatNumbers;
    }
}
