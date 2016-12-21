package com.pratice.aakriti.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		Random random = new Random();
		
		List<Future<Integer>> results = new ArrayList<Future<Integer>>();
		
		for(int i=0;i<4;i++){
			Integer number = random.nextInt(10);
			MultiThreadedFactorialCalculator calc = new MultiThreadedFactorialCalculator(number);
			Future<Integer> result = executor.submit(calc);
			results.add(result);	
		}
		
		for(Future<Integer> future : results){
			try{
				System.out.println("Future result is - "+ future.get() + "; And task done is :"+future.isDone());	
			}catch(InterruptedException e){
				e.printStackTrace();
			}catch(ExecutionException e1){
				e1.printStackTrace();
			}
		}
		executor.shutdown();
	}
}
