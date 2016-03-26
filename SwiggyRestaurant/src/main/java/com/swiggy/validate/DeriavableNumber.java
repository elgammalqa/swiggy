package com.swiggy.validate;

import java.util.Arrays;

public class DeriavableNumber {

	public static void main(String[] args) {
		
		int A[] = { 2, 3, 9, 12, 24 ,36,72};
		
		Arrays.sort(A);
		
		for(int i =A.length-1;i>=0;i--){
			
			if(usingRecursionfindderivable(A, i+1, A[i], 0, i)){
				System.out.println("Number Derivable " +A[i]);
			}
			else{
				System.out.println("Number Not Derivable " +A[i]);

			}

		}
	}

private static boolean usingRecursionfindderivable(int[] a, int length, int sum, int low, int high) {

		// 1. Base Cases
		if (low > high) {
			
			return false;
		
		}
		int k = Arrays.binarySearch(a, low, high, sum);
		
		if (!(k < 0)) {
			return true;
		}
		if (length == 0 && sum != 0)
			
			return false;
		// 2. To avoid unnecessary steps, we will optimize the recursion method
		// by avoiding
		// recursive calls to areas where we are definite that we can SAFELY
		// ignore the case since
		// the SOLUTION does not exist there.

		// If last element is greater than sum, then ignore it
		int temp = sum;
		if ((temp % a[low]) == 0) {

			temp = temp / a[low];

			if (temp <= a[low]) {
				return usingRecursionfindderivable(a, length - 1, sum, low++, high);
			}
		}

		// 3. This is the recursion step where we will call the method again and
		// again
		/*
		 * else, check if sum can be obtained by any of the following (a)
		 * including the last element (b) excluding the last element
		 */
		return (usingRecursionfindderivable(a, length - 1, temp, low++, high) || usingRecursionfindderivable(a, length - 1, sum, low++, high));

	}
}
