package com.sonly.sort.selection;

import com.sonly.sort.Utils;

/**
 *<ul>
 *<li>Description: 选择排序
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月18日
 *</ul>
 */
public class SimpleSelectionSort {

	/**
	 * 将给定数组从小到大排序
	 * @param arr
	 */
	public static void sort(double[] arr) {
		if(1 == arr.length)
			return;
	
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			min = minIndex(arr, i, arr.length - 1);
			
			if(min != i)
				Utils.swap(arr, min, i);
		}
	}
	
	/**
	 * 返回给定数组区域内的最小值的索引
	 * @param arr	给定数组
	 * @param start	数组的起点
	 * @param end	数组的终点
	 * @return		最小值的索引
	 */
	public static int minIndex(double[] arr, int start, int end) {
		if(start < 0 || start > arr.length - 1 || end < 0 || end > arr.length - 1)
			throw new IllegalArgumentException("start or end out of boundary, start = " + start + "\tend = " + end);
		
		if(start > end)
			throw new IllegalArgumentException(" start should lower than end, start = " + start + "\tend = " + end);
			
		if(start == end)
			return start;
		
		double min = arr[start];
		int index = start;
		for(int i = start + 1; i <= end; i++) {
			if(min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		
		return index;
	}
}
