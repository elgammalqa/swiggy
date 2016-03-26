package com.swiggy.models;

import java.util.List;
import java.util.Map;

public class VariantDetails {


	private List<Map<Integer,Variants>> listVariants;

	public List<Map<Integer, Variants>> getListVariants() {
		return listVariants;
	}

	public void setListVariants(List<Map<Integer, Variants>> listVariants) {
		this.listVariants = listVariants;
	}
	
}
