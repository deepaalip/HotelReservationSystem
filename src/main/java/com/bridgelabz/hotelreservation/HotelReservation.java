package com.bridgelabz.hotelreservation;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;


import java.util.Scanner;

import java.util.stream.Collectors;



public class HotelReservation {
	enum customer_type{
		Regular, Reward
	}
	static ArrayList<HotelData> hotelReservationSystem = new ArrayList<HotelData>();
	   
	Scanner scanner = new Scanner(System.in);
    public void addHotel() throws ParseException {
    	
    	System.out.println("Enter customer type 1.regular 2. reward");
    	String type= scanner.next();
    	if(customer_type.Regular != null) {
    	System.out.println("Enter Hotel name:");
   	    String hotelName = scanner.next();
    	System.out.println("Enter rating:");
    	int rate =scanner.nextInt();
    	System.out.println("Enter startDate");
		String startDate = scanner.next();
		System.out.println("Enter endDate");
		String endDate = scanner.next();
		
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yyyy"); 
		Date date1=formatter.parse(startDate);  
		SimpleDateFormat formatter1=new SimpleDateFormat("dd-MMM-yyyy"); 
		Date date2=formatter1.parse(endDate);  
		 System.out.println(date1+ " " +date2);
		 
	    System.out.println("Enter regular customer rate:");
    	int regularCustomerRate = scanner.nextInt();
    	regularCustomerRate = regularCustomerRate+regularCustomerRate;
    	HotelData  hotel = new HotelData(type,hotelName,rate,regularCustomerRate,startDate,endDate);
		hotelReservationSystem.add(hotel);
    	}
    }
    
	
	public void printHotel() {
		System.out.println(hotelReservationSystem);
	}
	
	public void cheapestHotel() throws ParseException  {
		
//		 
			
			List<HotelData> minHotels = hotelReservationSystem.stream()
				    .filter(h -> h.getRegularCustomerRate() == hotelReservationSystem.stream()
				        .map(HotelData::getRegularCustomerRate).sorted().findFirst().orElse(null))
				    .collect(Collectors.toList());
	    
	  }

}
