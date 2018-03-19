package com.sonly.sort;

/**
 *<ul>
 *<li>Description: 工具类，提供数组操作的方法
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2018年3月18日
 *</ul>
 */
public class Utils {

	/**
	 * 交换给定数组的两个索引位置的元素
	 * @param arr	待交换的数组
	 * @param i		交换索引
	 * @param j		交换索引
	 */
	public static void swap(double[] arr, int i, int j) {
		double tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	/**
	 * 返回指定位的数
	 * @param number	给定数
	 * @param pos		给定位数(1-个位，2-十位)
	 */
	public static int getNumInPos(int number, int pos) {
		int tmp = (int) Math.pow(10, pos - 1);
		
		return (number / tmp) % 10;
	}
	
	/**
	 * 返回最大数的位数
	 * @param arr
	 * @return
	 */
	public static int getMaxBit(int[] arr) {
		int max = Integer.MIN_VALUE;
		int tmp = 1;
		for(int i : arr)
			max = Math.max(i, max);
		
		while((max / (int)Math.pow(10, tmp)) != 0) {
			tmp++;
		}
		
		return tmp;
	}
	
	public static void print(double[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}
}
