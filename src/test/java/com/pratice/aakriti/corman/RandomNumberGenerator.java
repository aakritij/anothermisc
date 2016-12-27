package com.pratice.aakriti.corman;

public class RandomNumberGenerator {
	 public static Integer[] generateArray(){
	        Integer[] ar1 = new Integer[6];
	        for(int i = 0; i <  ar1.length; i++) {
	            ar1[i] = (int)(Math.random() * 100);
	        }
	  return ar1;      
	  }
	
}
