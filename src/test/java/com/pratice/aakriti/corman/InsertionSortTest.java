package com.pratice.aakriti.corman;

import java.util.Arrays;

import org.junit.Test;

import com.practice.aakriti.corman.InsertionSort;

public class InsertionSortTest {
	   @Test
	   public void test() {
		   InsertionSort ins = new InsertionSort();
		   Integer[] arrayTobeSorted = RandomNumberGenerator.generateArray();
		   System.out.println("arrayTobeSorted is :" + Arrays.asList(arrayTobeSorted));
		   ins.sort(arrayTobeSorted);
		   System.out.println("sorted array is : "+ Arrays.asList(arrayTobeSorted));
	   }
}
