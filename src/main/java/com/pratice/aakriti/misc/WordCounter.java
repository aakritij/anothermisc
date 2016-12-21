package com.pratice.aakriti.misc;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {	
	
	public static Map scanFile() throws FileNotFoundException{
		Map<String, Integer> counter = new HashMap<String, Integer>();
		File file = new File("C:\\Users\\Akhilesh\\Documents\\test.txt");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()){
			String next = scanner.next();
			Integer count = counter.get(next);
			if(count!=null){
				counter.put(next, count+1);
			}else{
				counter.put(next, 1);
			}
				
		}
		System.out.println("occurance of 'file' is :"+counter.get("this"));
		scanner.close();
		return counter;
	}
	
	public static void main(String[] args) {
		try {
			scanFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
