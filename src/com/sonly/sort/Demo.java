package com.sonly.sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Demo {
	
	private double[] arr;			//待排序数组
	private double[] correction;	//已排序数组
	
	@Before
	public void setUp() throws Exception {
		arr = new double[]{1.2, 2.5, 2.5, 4.1, 5.0, 3.3, 0.1, 2.4, 0.02};
		correction = new double[]{0.02, 0.1, 1.2, 2.4, 2.5, 2.5, 3.3, 4.1, 5.0};
	}

	@Test
	public void testBubbleSort() {
		BubbleSort.sort(arr);
		assertArrayEquals(correction, arr, 0.0000000001);
	}

	@Test
	public void testInsertionSort() {
		InsertionSort.sort(arr);
		assertArrayEquals(correction, arr, 0.0000000001);
	}
	
	@Test
	public void testQuickSort() {
		QuickSort.sort(arr);
		assertArrayEquals(correction, arr, 0.0000000001);
	}
	
	@Test
	public void testSelectionSort() {
		SelectionSort.sort(arr);
		assertArrayEquals(correction, arr, 0.0000000001);
	}
	
	@Test
	public void testMergeSort() {
		QuickSort.sort(arr);
		assertArrayEquals(correction, arr, 0.0000000001);
	}
}
