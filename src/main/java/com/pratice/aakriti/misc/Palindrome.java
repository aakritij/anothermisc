package com.pratice.aakriti.misc;

public class Palindrome {	
	public static boolean isPalindrome(char[] word){
		int i1=0;
		int i2=word.length-1;
		boolean isPalindrome = false;
		
		while(i2 > i1){
			if(word[i1] != word[i2]){
				isPalindrome = false;
			}else{
				isPalindrome = true;
			}
			i1++;
			i2--;
		}		
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		char[] test = "madam".toCharArray();
		System.out.println(isPalindrome(test));
		System.out.println(hasPalindrome(test));
	}    
	
	public static boolean hasPalindrome(char[] s) {
		int j = s.length - 1;
		int midPoint = s.length / 2;
		boolean hasPalindrome = false;
		for (int i=0;i<s.length; i++) {
			if (i == midPoint) {
				break;
			}
			if (s[i] == s[j]) {
				hasPalindrome = true;
			} else {
				hasPalindrome = false;
			}
			j--;
		}
		return hasPalindrome;
	}
}
