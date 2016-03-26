package com.swiggy.models;

public enum SensitivityEnum {

	None,Medium,High;
	
	public static SensitivityEnum valueOfSensitivity(String pType) {
		for(SensitivityEnum pt: SensitivityEnum.values()){
			if(pt.name().equalsIgnoreCase(pType)){
				return pt;
			}
		}
		return null;
	}

}
