package com.swiggy.models;

public class ItemDetails {

	private String itemName;
	private Double price;
	private Integer time;
	private SensitivityEnum enum1;
    private Long ItemId;
    
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public SensitivityEnum getEnum1() {
		return enum1;
	}
	public void setEnum1(SensitivityEnum enum1) {
		this.enum1 = enum1;
	}
	public Long getItemId() {
		return ItemId;
	}
	public void setItemId(Long itemId) {
		ItemId = itemId;
	}

}
