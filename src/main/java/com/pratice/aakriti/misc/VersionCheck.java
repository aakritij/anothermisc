package com.pratice.aakriti.misc;

public class VersionCheck {
	public static void check(String s1, String s2){
		String[] v1 = s1.split("\\.");
		String[] v2 = s2.split("\\.");
		
		int i=0;
		int j=0;
		
		while(i<v1.length-1 && j<v2.length-1){
			if(Integer.valueOf(v1[i]) <  Integer.valueOf(v2[j])){
				System.out.println("Second version is greater");
				return;
			}else if(Integer.valueOf(v1[i]) >  Integer.valueOf(v2[j])){
				System.out.println("First version is greater");
				return;
			}else{
				i++;
				j++;
			}					
		}
		System.out.println("Equal");
	}
	
	public static void main(String[] args) {
		check("12.11.10.0","12.11.10.0");
	}
}
