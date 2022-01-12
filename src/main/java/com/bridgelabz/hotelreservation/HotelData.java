package com.bridgelabz.hotelreservation;

public class HotelData {
	String customer_type;
	String hotelName;
	String rate;
//	String date1;
//	String date2;
//	String date3;
	
	public HotelData(  String customer_type,String hotelName,String rate) {
		this.customer_type = customer_type;
		this.hotelName = hotelName;
		this.rate = rate;
//		this.date1 = date1;
//		this.date2 = date2;
//		this.date3 = date3;
	}
	

	public String getRate() {
		return customer_type;
	}
   public void setRate(String Rate) {
	   rate = Rate;
   }
//   public String getDate1() {
//		return date1;
//	}
//   public void setDate1(String date_1) {
//	   date1 = date_1;
//  }
//    public String getDate2() {
//		return date2;
//	}
//   public void setDate2(String date_2) {
//	   date2 = date_2;
//   }
//    public String getDate3() {
//	return date3;
//   }
//     public void setDate3(String date_3) {
//     date3 = date_3;
   
     
     @Override
 	public String toString() {
    	 return "HotelData [customer_type =" +customer_type+",hotelName=" + hotelName +",rate=" + rate + "]";
    	 
     }
}
