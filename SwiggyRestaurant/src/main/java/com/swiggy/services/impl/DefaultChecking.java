package com.swiggy.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.swiggy.models.VariantList;

public class DefaultChecking {

	public static void main(String[] args) {
		List<VariantList> variants = new ArrayList<VariantList>();
		List<VariantList> variants1 = new ArrayList<VariantList>();
		List<List<VariantList>> listofList = new ArrayList<>();
		for (int i = 5; i > 0; i--) {
			VariantList var1 = new VariantList();
			var1.setVariantid(i);
			var1.setIs_available(true);
			var1.setVariantName("a" + i);
			var1.setPriority(i);
			variants.add(var1);
		}
		
		for (int i = 5; i > 0; i--) {
			VariantList var1 = new VariantList();
			var1.setVariantid(i);
			var1.setIs_available(true);
			var1.setVariantName("b" + i);
			var1.setPriority(i);
			variants1.add(var1);
		}
		
		Collections.sort(variants);
		Collections.sort(variants1);

		listofList.add(variants);
		listofList.add(variants1);
		List<String> exclustionList = new ArrayList<>();
		exclustionList.add("a1b1");
		exclustionList.add("a1b2");
		/*exclustionList.add("a1b3");
		exclustionList.add("a1b4");
		exclustionList.add("a1b5");
		exclustionList.add("a3b3");*/
		
		System.out.println(allowableVariants(listofList, exclustionList));

	}

	public static Boolean ispresentinlist(List<String> newlist, String pattern) {

		for (String number : newlist) {
			if (number.contains(pattern))
				return true;
		}
		return false;
	}

	public static void addtolist(List<String> exclustionList, String pattern, List<String> newlist) {
		List<String> copy = new ArrayList<String>();
		for (String number : exclustionList) {
			if (number.contains(pattern))
				copy.add(number);
		}
		newlist.addAll(copy);
	}

	public static String allowableVariants(List<List<VariantList>> listofList, List<String> exclustionList) {

		List<String> newlist = new ArrayList<>();

		StringBuffer finalpattern = new StringBuffer();
		String selectVariant = null;
		for (List<VariantList> list : listofList) {
			for (VariantList innerlist : list) {
				if (ispresentinlist(newlist, innerlist.getVariantName())) {
					continue;
				} else {
					if (innerlist.getIs_available()) {
						selectVariant = innerlist.getVariantName();
						finalpattern.append(innerlist.getVariantName());
						addtolist(exclustionList, innerlist.getVariantName(), newlist);
						break;
					}

				}
			}
			if (selectVariant == null) {
				System.out.println("No Option Found");

				return "No Proper Variant Found";
			}
			selectVariant = null;
		}
		return finalpattern.toString();
	}
}
