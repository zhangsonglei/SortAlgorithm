package com.sonly.sort.insertion;

/**
 *<ul>
 *<li>Description: 直接插入排序，将给定数组排成从左到右依次增加的形式
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月18日
 *</ul>
 */
public class DirectInsertionSort {

	/**
	 * 将给定数组按照从小到大排序
	 * @param arr	待排序数组
	 */
	public static void sort(double[] arr) {
		if(arr == null)
			throw new IllegalArgumentException("array cannot be null");
		
		if(arr.length == 1)
			return;
		
		int j;
		for(int i = 1; i < arr.length; i++) {
			
			double tmp = arr[i];
			for(j = i; j > 0 && tmp < arr[j - 1]; j--)
				arr[j] = arr[j - 1];
			
			arr[j] = tmp;
		}
	}
}
