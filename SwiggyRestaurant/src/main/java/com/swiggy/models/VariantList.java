package com.swiggy.models;

public class VariantList implements Comparable<VariantList>{

    private Integer variantid;
	
	private String variantName;
	
	private Boolean is_available;
	
	
	private Integer priority;
	
	
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

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(VariantList o) {
		// TODO Auto-generated method stub		
		if (this.priority<o.getPriority()){

            return -1;
            
        }
		else{
          
			return 1;
        }
	}

}
