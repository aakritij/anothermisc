package com.pratice.aakriti.corman;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.practice.aakriti.corman.InsertionSort;

public class InsertionSortTest {
	@Test
	public void test() {
		InsertionSort ins = new InsertionSort();
		Integer[] arrayTobeSorted = RandomNumberGenerator.generateArray();
		System.out.println("arrayTobeSorted is :" + Arrays.asList(arrayTobeSorted));
		ins.sort(arrayTobeSorted);
		System.out.println("sorted array is : " + Arrays.asList(arrayTobeSorted));
	}

	@Test
	public void test1() {
		InsertionSort ins = new InsertionSort();
		Integer[] arrayTobeSorted = RandomNumberGenerator.generateArray();
		System.out.println("arrayTobeSorted is :" + Arrays.asList(arrayTobeSorted));
		ins.sortAscDesc(arrayTobeSorted, true);
		System.out.println("sorted in asc order : " + Arrays.asList(arrayTobeSorted));
		ins.sortAscDesc(arrayTobeSorted, false);
		System.out.println("sorted in desc order : " + Arrays.asList(arrayTobeSorted));
	}
}
