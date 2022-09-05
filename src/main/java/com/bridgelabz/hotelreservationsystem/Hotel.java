package com.bridgelabz.hotelreservationsystem;

public class Hotel {
	private String hotelName;
	private int ratePerDay;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRatePerDay() {
		return ratePerDay;
	}

	public void setRatePerDay(int ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName = " + hotelName + ", ratePerDay = " + ratePerDay + "]";
	}

}
