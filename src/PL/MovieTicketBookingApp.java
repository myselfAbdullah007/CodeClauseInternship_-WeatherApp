package PL;

import BLL.BookingSystem;

//Presentation Layer
public class MovieTicketBookingApp {
 public static void main(String[] args) {
     // Initialize the application
     BookingSystem bookingSystem = new BookingSystem();
     bookingSystem.startBooking();
 }
}