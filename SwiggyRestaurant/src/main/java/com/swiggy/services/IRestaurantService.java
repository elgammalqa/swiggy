package com.swiggy.services;

import com.swiggy.models.GeoLocation;
import com.swiggy.models.MenuDetails;
import com.swiggy.models.OrderDetails;
import com.swiggy.models.RestaurantDetailsVO;

public interface IRestaurantService {

	public RestaurantDetailsVO listResturants(GeoLocation geoLocation);
	
	public Integer computeSLAforOrder(OrderDetails details);
	
	public String placeOrder(OrderDetails details);
	
	public MenuDetails getMenuDetails(Integer id);
	
}
