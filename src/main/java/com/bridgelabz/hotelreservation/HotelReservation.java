package com.bridgelabz.hotelreservation;

import java.util.ArrayList;
import java.util.Scanner;



public class HotelReservation {
	static ArrayList<HotelData> hotelReservationSystem = new ArrayList<HotelData>();
	   
	Scanner scanner = new Scanner(System.in);
    public void addHotel() {
    	System.out.println("Enter customer type 1.regular 2. reward");
    	String type= scanner.next();
    	
    	System.out.println("Enter Hotel name:");
    	String hotelName = scanner.next();
    	System.out.println("Enter rating:");
    	String rate =scanner.next();
    	HotelData  hotel = new HotelData(type,hotelName,rate);
		hotelReservationSystem.add(hotel);
    }
    
	
	public void printHotel() {
		System.out.println(hotelReservationSystem);
	}
}
