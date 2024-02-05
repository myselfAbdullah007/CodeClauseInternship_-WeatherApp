package DTO;

public class Seat {
    private int seatNumber;
    private boolean isOccupied;

    // Constructor
    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isOccupied = false; // Initially, the seat is not occupied
    }

    // Getter for seatNumber
    public int getSeatNumber() {
        return seatNumber;
    }

    // Getter for isOccupied
    public boolean isOccupied() {
        return isOccupied;
    }

    // Mark the seat as occupied
    public void occupySeat() {
        isOccupied = true;
    }

    // Mark the seat as unoccupied
    public void vacateSeat() {
        isOccupied = false;
    }

    @Override
    public String toString() {
        // Represent the seat as a string, indicating the seat number and occupancy status
        return "Seat " + seatNumber + (isOccupied ? " (Occupied)" : " (Available)");
    }
}
