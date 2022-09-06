package com.bridgelabz.hotelreservationsystem;

public class HotelReservation {
	public static void main(String[] args) {

		HotelReservationSystem hotel = new HotelReservationSystem();

		System.out.println("--Welcome to Hotel Rates Program--");
		System.out.println(" ");

		hotel.addHotel();
		hotel.showHotelInfo();

		System.out.println(" ");
		System.out.println("*Cheapest Hotel Based on WeekdayRegularRate");
		hotel.findCheapestHotelOne("10-Sep-2020", "11-Sep-2020");
		System.out.println(" ");

		System.out.println(" ");
		System.out.println("*Cheapest Hotel Based on WeekendRegularRate");
		hotel.findCheapestHotelTwo("10-Sep-2020", "11-Sep-2020");
		System.out.println(" ");

		System.out.println(" ");
		System.out.println("*Cheapest best Rated Hotel Based on WeekendRegularRate");
		hotel.findCheapestHotelRaitingForRegular("11-Sep-2020", "12-Sep-2020");
		System.out.println(" ");

	}

}
