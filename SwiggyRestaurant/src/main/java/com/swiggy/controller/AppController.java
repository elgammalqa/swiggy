		package com.swiggy.controller;

import java.util.ArrayList;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.models.MenuDetails;
import com.swiggy.models.OrderConfirmation;
import com.swiggy.models.OrderDetails;
import com.swiggy.models.RestaurantDetailsVO;
import com.swiggy.models.RestuarantList;
import com.swiggy.services.IRestaurantService;

@RestController
@EnableAsync
@RequestMapping(value = "/v1")
public class AppController {

	@Autowired
	IRestaurantService resturantService;

	Logger LOGGER = LoggerFactory.getLogger(AppController.class);

	@RequestMapping(value = "/swiggy/listrestaurants", method = RequestMethod.GET, headers = "content-type=application/json", produces = {
			"application/json" })
	public RestuarantList swiggyListRestaurants(@RequestParam(value = "logitute", required = true) Integer logitute,
			@RequestParam(value = "latitute", required = true) Integer latitute) {
		// Validate for inputs
		ArrayList<RestaurantDetailsVO> detailsVOs = new ArrayList<>();
		RestaurantDetailsVO deRestaurantDetailsVO = new RestaurantDetailsVO();
		detailsVOs.add(deRestaurantDetailsVO);
		RestuarantList list = new RestuarantList();
		list.setDetailsVOs(detailsVOs);
		return list;
	}

	@RequestMapping(value = "/swiggy/placeorder", method = RequestMethod.POST, headers = "content-type=application/json", produces = {
			"application/json" })
	public OrderConfirmation swiggyPlaceOrder(@RequestBody OrderDetails detailsVO) {

		// Validate for inputs

		OrderConfirmation confirmation = new OrderConfirmation();
		confirmation.setMessage("OrderPlaced Successfully");
		confirmation.setId(new Long(122323));
		return confirmation;
	}

	@RequestMapping(value = "/swiggy/recomputesla", method = RequestMethod.POST, headers = "content-type=application/json", produces = {
			"application/json" })
	public Integer swiggyrecomuputesla(@RequestBody OrderDetails detailsVO) {

		// Validate for inputs
		return new Integer(5);
	}

	@RequestMapping(value = "/swiggy/resturant/itemDetails", method = RequestMethod.GET, headers = "content-type=application/json", produces = {
			"application/json" })
	public MenuDetails swiggymenupopulate(@RequestParam(value = "id", required = true) Integer id) {
		
		resturantService.getMenuDetails(1);
		return null;

		// Validate for inputs
		
	}

}
