package com.sonly.sort;

import java.util.Arrays;

/**
 *<ul>
 *<li>Description: 基数排序
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月19日
 *</ul>
 */
public class RadixSort {
	
	/**
	 * 从小到大基数排序
	 * @param arr	待排序数组
	 */
	public static void sort(int[] arr) {
		if(arr == null)
			throw new IllegalArgumentException("array cannot be null");
		
		if(1 == arr.length)
			return;
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		if(min < 0)
			throw new IllegalArgumentException("Arrays must no lower than 0");
		
		int bit = Utils.getMaxBit(arr);
		radixSort(arr, bit);
	}
	
	/**
	 * 基数排序
	 * @param arr	待排序数组
	 * @param maxBit最大位数
	 */
	private static void radixSort(int[] arr, int maxBit) {
		int[][] tmp = new int[10][arr.length + 1];
		
		for(int i = 0; i < tmp.length; i++)
			Arrays.fill(tmp[i], 0);
		
		for(int bit = 1; bit <= maxBit; bit++) {
			for(int i = 0; i < arr.length; i++) {
				int row = Utils.getNumInPos(arr[i], bit);
				int col = ++tmp[row][0];
				tmp[row][col] = arr[i];
			}
			
			for(int row = 0, i = 0; row < 10; row++) {
				// 收集过程
                for(int col = 1; col <= tmp[row][0]; col++) 
                    arr[i++] = tmp[row][col];
                
                tmp[row][0] = 0;
                // 复位，下一个pos时还需使用
            }
		}
	}
}
