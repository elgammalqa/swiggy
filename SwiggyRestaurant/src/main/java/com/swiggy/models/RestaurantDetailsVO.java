package com.swiggy.models;

import java.util.List;

public class RestaurantDetailsVO {

	private List<ItemDetails> itemlist;
	private GeoLocation  geoLocation;
	private String resturantName;
	private Long restuarantId;
	
	public List<ItemDetails> getItemlist() {
		return itemlist;
	}
	public void setItemlist(List<ItemDetails> itemlist) {
		this.itemlist = itemlist;
	}
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}
	public String getResturantName() {
		return resturantName;
	}
	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}
	public Long getRestuarantId() {
		return restuarantId;
	}
	public void setRestuarantId(Long restuarantId) {
		this.restuarantId = restuarantId;
	}
	

}
