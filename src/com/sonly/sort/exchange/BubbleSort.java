package com.sonly.sort.exchange;

import com.sonly.sort.Utils;

/**
 *<ul>
 *<li>Description: 冒泡排序，从小到大
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月18日
 *</ul>
 */
public class BubbleSort {
	
	/**
	 * 将数组中的元素进行从小到大排序
	 * @param arr	待排序的数组
	 */
	public static void sort(double[] arr) {
		if(1 == arr.length)
			return;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = arr.length - 1; j > i; j--) {
				if(arr[j] < arr[j - 1])
					Utils.swap(arr, j, j - 1);
			}
		}
	}
}
