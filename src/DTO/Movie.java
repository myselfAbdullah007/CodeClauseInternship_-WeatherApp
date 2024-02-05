package DTO;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private  List<Seat> seats;

    // Constructor
    public Movie(String title) {
        this.title = title;
        this.seats = initializeSeats(); // Initialize seats for the movie
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Display available seats for the movie
    public void displaySeats() {
        System.out.println("Available seats for " + title + ":");
        
        // Assuming seats are arranged in rows and columns
        int rowCount = 5; // Number of rows
        int colCount = seats.size() / 5; // Calculate the number of columns
        
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                int seatIndex = i * colCount + j;
                if (seatIndex < seats.size()) {
                    Seat seat = seats.get(seatIndex);
                    System.out.print(seat + " ");
                }
            }
            System.out.println();
        }
    }

    // Allow the user to select seats
    public List<Seat> selectSeats(List<Integer> selectedSeatNumbers) {
        List<Seat> selectedSeats = new ArrayList<>();
        for (int seatNumber : selectedSeatNumbers) {
            if (seatNumber >= 1 && seatNumber <= seats.size()) {
                Seat selectedSeat = seats.get(seatNumber - 1);
                selectedSeats.add(selectedSeat);
            } else {
                System.out.println("Invalid seat number: " + seatNumber);
            }
        }
        return selectedSeats;
    }

    // Helper method to initialize seats for the movie
    private List<Seat> initializeSeats() {
        List<Seat> initializedSeats = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            initializedSeats.add(new Seat(i));
        }
        return initializedSeats;
    }
}
