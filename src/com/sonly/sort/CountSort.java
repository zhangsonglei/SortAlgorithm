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
		if(arr == null)
			throw new IllegalArgumentException("array cannot be null");
		
		if(1 == arr.length)
			return;
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) 
			max = Math.max(max, arr[i]);
		
		int[] help = new int[max + 1];
		for(int i = 0; i < arr.length; i++)
			help[arr[i]]++;
		
		for(int i = 0; i < help.length - 1; i++)//第i个位置保存着array中，值小于或等于i的元素的总个数
			help[i + 1] += help[i];
		
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			help[arr[i]]--;
			res[help[arr[i]]] = arr[i];
		}
		
		System.arraycopy(res, 0, arr, 0, arr.length);
	}
}
