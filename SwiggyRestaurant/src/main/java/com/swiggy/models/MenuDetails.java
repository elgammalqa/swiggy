package com.swiggy.models;

import java.util.List;

public class MenuDetails {

	private MainCategory mainCategory;

	private SubCategory subCategory;

	private SwiggyItemDetails details;

	private List<Addons> addons;

	private List<VariantDetails> variantsList;

	public MainCategory getCategory() {
		return mainCategory;
	}

	public void setCategory(MainCategory category) {
		this.mainCategory = category;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public SwiggyItemDetails getDetails() {
		return details;
	}

	public void setDetails(SwiggyItemDetails details) {
		this.details = details;
	}

	public List<Addons> getAddons() {
		return addons;
	}

	public void setAddons(List<Addons> addons) {
		this.addons = addons;
	}

	public List<VariantDetails> getVariantsList() {
		return variantsList;
	}

	public void setVariantsList(List<VariantDetails> variantsList) {
		this.variantsList = variantsList;
	}
}
