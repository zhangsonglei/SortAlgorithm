package com.sonly.sort.insertion;

/**
 *<ul>
 *<li>Description: 希尔排序，缩减增量排序
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月19日
 *</ul>
 */
public class ShellSort {
	
	/**
	 * 从小到大希尔排序
	 * @param arr	待排序数组
	 */
	public static void sort(double[] arr) {
		int increment = arr.length / 2;
		
		while(increment > 0) {
			shellInsert(arr, increment);
			increment /= 2;
		}
	}
	
	/**
	 * 根据给定增量对数组进行一次从小到大排序
	 * @param arr		待排序数组
	 * @param increment	增量大小
	 */
	public static void shellInsert(double[] arr, int increment) {
		for(int i = increment; i < arr.length; i++) {
			if(arr[i] < arr[i - increment]) {
				double tmp = arr[i];
				int j;
				for(j = i; j >= increment && tmp < arr[j - increment]; j -= increment)
					arr[j] = arr[j - increment];
				
				arr[j] = tmp;
			}
		}
	}
}
