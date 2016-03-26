package com.swiggy.models;

public class Variants {

	private Integer variantid;
	
	private String variantName;
	
	private Boolean is_available;
	
	public Integer getVariantid() {
		return variantid;
	}

	public void setVariantid(Integer variantid) {
		this.variantid = variantid;
	}

	public String getVariantName() {
		return variantName;
	}

	public void setVariantName(String variantName) {
		this.variantName = variantName;
	}

	public Boolean getIs_available() {
		return is_available;
	}

	public void setIs_available(Boolean is_available) {
		this.is_available = is_available;
	}
}
