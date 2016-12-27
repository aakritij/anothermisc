package com.pratice.aakriti.misc;

public class FindLength {
	
	public long getLengthOfSequcence(long k) {
		if (k <= 0) {
			return 0;
		} else {
			if (k == 1) {
				return 1;
			} else {
				if ((k % 2) != 0) {
					return 1 + getLengthOfSequcence(3*k +1);
				}
				if ((k % 2) == 0) {
					return 1 + getLengthOfSequcence(k/2);
				}
			}
		}
		return k;
	}

}
