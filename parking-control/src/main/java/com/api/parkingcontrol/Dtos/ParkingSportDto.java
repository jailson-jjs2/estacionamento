package com.api.parkingcontrol.Dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSportDto {
	
	@NotBlank
	private String parkingSpotNumber;
	@NotBlank
	@Size(max = 7)
	private String licensePlateCar;
	
	
	public String getParkingSpotNumber() {
		return parkingSpotNumber;
	}
	public void setParkingSpotNumber(String parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
	}
	public String getLicensePlateCar() {
		return licensePlateCar;
	}
	public void setLicensePlateCar(String licensePlateCar) {
		this.licensePlateCar = licensePlateCar;
	}
	
	

}
