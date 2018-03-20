package com.sonly.sort.selection;

import com.sonly.sort.Utils;

/**
 *<ul>
 *<li>Description: 堆排序
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月19日
 *</ul>
 */
public class HeapSort {

	/**
	 * 从小到大堆排序
	 * @param arr
	 */
	public static void sort(double[] arr) {
		if(arr == null)
			throw new IllegalArgumentException("array cannot be null");
		
		if(arr.length == 1)
			return;
		
		buildHeap(arr, arr.length);
		
		for(int i = arr.length - 1; i > 0; i--) {
			Utils.swap(arr, 0, i);
			adjust(arr, 0, i);
		}
	}
	
	/**
	 * 建立最大堆
	 * @param arr	待建堆的数组
	 */
	private static void buildHeap(double[] arr, int len) {
		for(int i = arr.length / 2; i >= 0; i--)
			adjust(arr, i, len);
	}
	
	/**
	 * 调整堆
	 * @param arr	待调整的堆
	 * @param index	调整的位置
	 */
	private static void adjust(double[] arr, int index, int len) {
		int child = 0;
		double tmp;
		
		for(tmp = arr[index]; leftChild(index) < len; index = child) {
			child = leftChild(index);
			if(child != len - 1 && arr[child] < arr[child + 1])
				child++;
			
			if(tmp < arr[child])
				arr[index] = arr[child];
			else
				break;
		}
		
		arr[index] = tmp;
	}
	
	/**
	 * 返回给定索引的左孩子索引
	 * @param i	给定索引
	 * @return	左孩子索引
	 */
	private static int leftChild(int i) {
		return 2 * i + 1;
	}
}
