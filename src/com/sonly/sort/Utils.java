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
}
