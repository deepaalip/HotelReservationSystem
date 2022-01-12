package com.bridgelabz.hotelreservation;

public class HotelReservationMain {
public static void main(String[] args) {
	System.out.println("Welcome to Hotel Reservation System program");
	HotelReservation hotelReservation = new HotelReservation();
	
	hotelReservation.addHotel();
	hotelReservation.printHotel();
}
}
