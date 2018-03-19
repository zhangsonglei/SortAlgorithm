package com.sonly.sort;

/**
 *<ul>
 *<li>Description: 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月19日
 *</ul>
 */
public class MergeSort {

	/**
	 * 从小到大归并排序
	 * @param arr	待排序的数组
	 */
	public static void sort(double[] arr) {
		if(1 == arr.length)
			return;
		
		mergeSort(arr, 0, arr.length - 1);
	}
	
	/**
	 * 将排序区域划分为两部分，递归项
	 * @param arr	待排序的数组
	 * @param low	排序的起点
	 * @param high	排序的重点
	 */
	public static void mergeSort(double[] arr, int low, int high) {
		int mid = (high + low) / 2;
		
		if(low < high) {
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}
	
	/**
	 * 将两个数组从小到大顺序合并为一个数组
	 * @param arr	待合并的数组
	 * @param low	左数组的起点
	 * @param mid	左数组的终点，右数组的起点
	 * @param high	右数组的重点
	 */
	private static void merge(double[] arr, int low, int mid, int high) {
		double[] temp = new double[high - low + 1];
		int left = low, right = mid + 1;
		int k = 0;

		while(left <= mid && right <= high) {
			if(arr[left] < arr[right])
				temp[k++] = arr[left++];
			else
				temp[k++] = arr[right++];
		}
		
		while(left <= mid) {
			temp[k++] = arr[left++];
		}
		
		while(right <= high) {
			temp[k++] = arr[right++];
		}

		for(int i = 0; i < temp.length; i++)
			arr[i + low] = temp[i];
	}
}