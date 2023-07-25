package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(nullable = false, unique = true, length = 10)
	private String parkingSpotNumber;
	@Column(nullable = false, unique = true, length = 8)
	private String licensePlateCar;
	@Column(nullable = false)
	private LocalDateTime parkingDate;
	@Column(nullable = false)
	private Duration parkingTime = Duration.ZERO;
	@Column(nullable = false, unique = true, length = 5)
	private Double parkingPrice =2.0;
	@Column(nullable = false, unique = true, length = 5)
	private Double parkingPriceTotal = 2.0;
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
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
	public LocalDateTime getParkingDate() {
		return parkingDate;
	}
	public void setParkingDate(LocalDateTime parkingDate) {
		this.parkingDate = parkingDate;
	}
	public Duration getParkingTime() {
		return parkingTime;
	}
	public void setParkingTime(Duration parkingTime) {
		this.parkingTime = parkingTime;
	}
	public Double getParkingPrice() {
		return parkingPrice;
	}
	public void setParkingPrice(Double parkingPrice) {
		this.parkingPrice = parkingPrice;
	}
	public Double getParkingPriceTotal() {
		return parkingPriceTotal;
	}
	public void setParkingPriceTotal(Double parkingPriceTotal) {
		this.parkingPriceTotal = parkingPriceTotal;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
