package com.pratice.aakriti.misc;

import java.util.ArrayList; 

public class Fibonacci { 

	private ArrayList<Integer> generateFibonacci (int n){ 
		ArrayList<Integer> fib=new ArrayList<Integer>(); 
		fib.add(0); 	
		fib.add(1); 
	for(int i=2;i<n;i++){
		fib.add(fib.get(i-1)+fib.get(i-2));
	} 
	return fib; 
	} 

	public static void main(String[] args){ 
	Fibonacci f=new Fibonacci(); 
	System.out.println(f.generateFibonacci(13)); 

	} 

}
			
