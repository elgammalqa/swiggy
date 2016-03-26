package com.swiggy.models;

import java.util.List;

public class OrderDetails {

	private Long restuarantId;
	
	private List<ItemDetails> itemlist;
	
	public Long getRestuarantId() {
		return restuarantId;
	}
	public void setRestuarantId(Long restuarantId) {
		this.restuarantId = restuarantId;
	}
	public List<ItemDetails> getItemlist() {
		return itemlist;
	}
	public void setItemlist(List<ItemDetails> itemlist) {
		this.itemlist = itemlist;
	}
}
