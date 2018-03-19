package com.sonly.sort;

/**
 *<ul>
 *<li>Description: 计数排序
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月19日
 *</ul>
 */
public class CountSort {

	/**
	 * 从小到大计数排序
	 * @param arr
	 */
	public static void sort(int[] arr) {
		if(1 == arr.length)
			return;
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		int[] help = new int[max];
		for(int i = 0; i < arr.length; i++) {
			int pos = arr[i] - min;
			help[pos]++;
		}
		
		int index = 0;
		for(int i = 0; i < help.length ; i++) {
			while(help[i]-- > 0)
				arr[index++] = i  + min;
		}	
	}
}
