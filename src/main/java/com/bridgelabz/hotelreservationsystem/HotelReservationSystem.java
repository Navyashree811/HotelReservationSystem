package com.bridgelabz.hotelreservationsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HotelReservationSystem {
	ArrayList<Hotel> myHotelList = new ArrayList<>(); 
	// Add Method

	public void addHotel() {

		Hotel hotel1 = new Hotel("Lakewood", 110, 80, 90, 80, 3);

		Hotel hotel2 = new Hotel("Bridgewood", 150, 110, 60, 50, 4);

		Hotel hotel3 = new Hotel("Ridgewood", 220, 100, 150, 40, 5);

		myHotelList.add(hotel1);
		myHotelList.add(hotel2);
		myHotelList.add(hotel3);
	}

	// Show Method
	public void showHotelInfo() {

		for (int i = 0; i < myHotelList.size(); i++) {
			System.out.println(myHotelList.get(i));
		}
	}

	public void findCheapestHotelOne(String startDateRange, String endDateRange) {

		LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));
		LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

		int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;
		Optional<Hotel> cheapestHotel = this.myHotelList.stream()
				.sorted(Comparator.comparing(Hotel::getWeekdayRegularRate)).findFirst();
		Hotel hotel = new Hotel();
		hotel.setHotelName(cheapestHotel.get().getHotelName());
		hotel.setTotal(cheapestHotel.get().getWeekdayRegularRate() * numberOfDays);

		System.out.println("HotelName : " + hotel.getHotelName());

		System.out.println("NumberOfDaysStayed * WeekdayRegularRate : " + hotel.getTotal() + "$");

	}
}
