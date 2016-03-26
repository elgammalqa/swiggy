package com.swiggy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.dao.ISwiggyDAO;
import com.swiggy.models.GeoLocation;
import com.swiggy.models.MenuDetails;
import com.swiggy.models.OrderDetails;
import com.swiggy.models.RestaurantDetailsVO;
import com.swiggy.services.IRestaurantService;

@Service
public class RestaurantServiceImpl implements IRestaurantService {
    @Autowired
	ISwiggyDAO swiggyDao; 
    
	@Override
	public RestaurantDetailsVO listResturants(GeoLocation geoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer computeSLAforOrder(OrderDetails details) {
		// TODO Auto-generated method stub
		 //Compute Feasiblity
		
		computeFeasebilty(null);
		
		return null;
	}

	@Override
	public String placeOrder(OrderDetails details) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Boolean computeFeasebilty(OrderDetails details) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MenuDetails getMenuDetails(Integer id) {
		// TODO Auto-generated method stub
		swiggyDao.getSwiggymenu(1);
		return null;
	}
	
	
}
