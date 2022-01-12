package com.bridgelabz.hotelreservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class HotelReservationMain {
public static void main(String[] args) throws ParseException  {
	System.out.println("Welcome to Hotel Reservation System program");
	HotelReservation hotelReservation = new HotelReservation();
	
	
	
	hotelReservation.addHotel();
	hotelReservation.printHotel();
	hotelReservation.cheapestHotel();
	
}
}
