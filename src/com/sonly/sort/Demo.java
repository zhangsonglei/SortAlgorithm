package com.sonly.sort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sonly.sort.exchange.BubbleSort;
import com.sonly.sort.exchange.QuickSort;
import com.sonly.sort.insertion.DirectInsertionSort;
import com.sonly.sort.insertion.ShellSort;
import com.sonly.sort.selection.HeapSort;
import com.sonly.sort.selection.SimpleSelectionSort;

public class Demo {
	
	private double[] arrDouble;			//待排序数组
	private int[] arrInteger;
	private double[] correctionDouble;	//已排序数组
	private int[] correctionInteger;
	
	@Before
	public void setUp() throws Exception {
		arrDouble = new double[]{1.2, 2.5, 2.5, 4.1, 5.0, 3.3, 0.1, 2.4, 0.02};
		correctionDouble = new double[]{0.02, 0.1, 1.2, 2.4, 2.5, 2.5, 3.3, 4.1, 5.0};
		arrInteger = new int[]{2, 3, 1, 4, 5, 3, 54, 6, 34, 64, 5, 25, 56};
		correctionInteger = new int[]{1, 2, 3, 3, 4, 5, 5, 6, 25, 34, 54, 56, 64};
	}

	@Test
	public void testBubbleSort() {
		BubbleSort.sort(arrDouble);
		assertArrayEquals(correctionDouble, arrDouble, 0.0000000001);
	}

	@Test
	public void testInsertionSort() {
		DirectInsertionSort.sort(arrDouble);
		assertArrayEquals(correctionDouble, arrDouble, 0.0000000001);
	}
	
	@Test
	public void testQuickSort() {
		QuickSort.sort(arrDouble);
		assertArrayEquals(correctionDouble, arrDouble, 0.0000000001);
	}
	
	@Test
	public void testSimpleSelectionSort() {
		SimpleSelectionSort.sort(arrDouble);
		assertArrayEquals(correctionDouble, arrDouble, 0.0000000001);
	}
	
	@Test
	public void testShellSort() {
		ShellSort.sort(arrDouble);
		assertArrayEquals(correctionDouble, arrDouble, 0.0000000001);
	}
	
	@Test
	public void testMergeSort() {
		MergeSort.sort(arrDouble);
		assertArrayEquals(correctionDouble, arrDouble, 0.0000000001);
	}
	
	@Test
	public void testHeapSort() {
		HeapSort.sort(arrDouble);
		assertArrayEquals(correctionDouble, arrDouble, 0.0000000001);
	}
	
	@Test
	public void testBucketSort() {
		BucketSort.sort(arrInteger, 5);
		assertArrayEquals(correctionInteger, arrInteger);
	}
	
	@Test
	public void testCountSort() {
		CountSort.sort(arrInteger);
		assertArrayEquals(correctionInteger, arrInteger);
	}
	
	@Test
	public void testRadixSort() {
		RadixSort.sort(arrInteger);
		assertArrayEquals(correctionInteger, arrInteger);
	}
}
