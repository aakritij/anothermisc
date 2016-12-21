package com.pratice.aakriti.misc;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MultiThreadedFactorialCalculator implements Callable<Integer>{
	private Integer number;
	
	public MultiThreadedFactorialCalculator(Integer number){
		this.number = number;
	}

	public Integer call() throws Exception {
		int result = 1;
		if((number==0) || (number==1)){
			return 1;
		}else{
			for(int i =2;i<=number;i++){
				result *= i;
				TimeUnit.MILLISECONDS.sleep(20);
			}
		}
		System.out.println("Result for number - "+number + "is :"+result);
		return result;
	}
	
}
