package com.pratice.aakriti.misc;

import java.util.HashMap;
import java.util.LinkedList;

public class LongestSequenceFinder {
	//creating a map to store starting number and sequence size
	static HashMap<Integer,Integer> numFinderMap = new HashMap<Integer,Integer>();
	
	private static LinkedList<Integer> generateSequence(int i){
		LinkedList<Integer> sequence = new LinkedList<Integer>();
		sequence.add(i);//added starting number here
			
		while(i >= 1){
			if( (i % 2) == 0 ){//if even
				i = i/2;
				sequence.add(i);
				if (i == 1 ) {
					break; 
				}
			}else{//else odd
				i = 3*i + 1;
				sequence.add(i);
				if (i == 1 ) {
					break; 
				}
			}
		}
		System.out.println("sequence is : " + sequence);
		return sequence;
		
	}
	
	public static void findLargestSequenceNum(){
		
		for(int num=2;num<=5;num++){
			LinkedList<Integer> list = generateSequence(num);
			numFinderMap.put(num, list.size());
		}
		
	//comparator for sorting based on sequence size

	
	System.out.println("bigger map sequence generator number is : "+ numFinderMap.keySet().size());
	}
	
	public static void main(String[] args) {
		findLargestSequenceNum();
	}
	
}
