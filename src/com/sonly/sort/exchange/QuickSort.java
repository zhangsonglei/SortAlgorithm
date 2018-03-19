package com.sonly.sort.exchange;

import com.sonly.sort.Utils;

/**
 *<ul>
 *<li>Description: 快速排序类
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月18日
 *</ul>
 */
public class QuickSort {

	/**
	 * 对数组执行快速排序
	 * @param arr	待排序的数组
	 */
	public static void sort(double[] arr) {
		if(1 == arr.length)
			return;
		
		quickSort(arr, 0, arr.length - 1);
	}
	
	/**
	 * 将数组起始位置，终止位置，和中间位置的中位数放在最右边
	 * @param arr	给定数组
	 * @param start	起始位置
	 * @param end	终止位置
	 * @return		中位数
	 */
	public static double mid3ToEnd(double[] arr, int start, int end) {
		int mid_index = (end - start) / 2;
		double l = arr[start], r = arr[end], m = arr[mid_index];
		
		if((l < m && l > end) || (l > m && l < end))
				Utils.swap(arr, start, end);
		
		if((m < l && m > r) || (m > l && m < r))
			Utils.swap(arr, end, mid_index);
		
		return arr[end];
	}
	
	/**
	 * 遍历一次，将数组指定起始位置到终止位置的元素划分为左右两部分(左部分全部小于枢纽位置，右部分全部大于枢纽位置)
	 * @param arr	给定数组
	 * @param start	起始位置
	 * @param end	终止位置
	 * @return		枢纽最终位置
	 */
	public static int partition(double[] arr, int start, int end) {
		double pivot = mid3ToEnd(arr, start, end);
		
		while(start < end) {
			while(start < end && arr[start] < pivot) {
				start++;
			}
			
			if(start < end) {
				arr[end] = arr[start];
				arr[start] = pivot;
				end--;
			}
			
			while(start < end && arr[end] > pivot) {
				end--;
			}
			
			if(start < end) {
				arr[start] = arr[end];
				arr[end] = pivot;
				start++;
			}
		}
		
		return end;
	}
	
	/**
	 * 快速排序
	 * @param arr	待排序的数组
	 * @param start	排序的起始位置
	 * @param end	排序的终止位置
	 */
	private static void quickSort(double[] arr, int start, int end) {
		if(start > end)
			return;
		
		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);
	}
}
