package com.sonly.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 *<ul>
 *<li>Description: 桶计数排序
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月19日
 *</ul>
 */
public class BucketSort {

	/**
	 * 从小到大桶排序
	 * @param arr	待排序数组
	 * @param num	桶的个数
	 */
	public static void sort(int[] arr, int num) {
		if(arr == null)
			throw new IllegalArgumentException("array cannot be null");
		
		if(1 == arr.length)
			return;
		
		if(num < 1)
			throw new IllegalArgumentException("at least 1 bucket:" + num);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		if(min < 0)
			throw new IllegalArgumentException("Arrays must no lower than 0");
		
		int count = (max - min) / num + 1;
		ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
		for(int i = 0; i < num; i++)
			buckets.add(new ArrayList<>());
		
		for(int i = 0; i < arr.length; i++) {
			int index = (arr[i] - min) / count;
			buckets.get(index).add(arr[i]);
		}
		
		int index = 0;
		for(ArrayList<Integer> bucket : buckets) {
			Collections.sort(bucket);
			for(int i : bucket)
				arr[index++] = i;
		}
	}
}
