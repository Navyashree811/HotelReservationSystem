package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservationSystem {
	static ArrayList<Hotel> HotelsList = new ArrayList<>();

	// To view total HotelList
	public static void view() {
		for (Hotel i : HotelsList) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Hotel hotelName1 = new Hotel();
		hotelName1.setHotelName("Lakewood");
		hotelName1.setRatePerDay(110);
		HotelsList.add(hotelName1);

		Hotel hotelName2 = new Hotel();
		hotelName2.setHotelName("Bridgewood");
		hotelName2.setRatePerDay(160);
		HotelsList.add(hotelName2);

		Hotel hotelName3 = new Hotel();
		hotelName3.setHotelName("Ridgewood");
		hotelName3.setRatePerDay(220);
		HotelsList.add(hotelName3);

		view();

	}

}
