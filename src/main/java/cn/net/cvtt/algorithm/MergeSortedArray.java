/**
 * 
 */
package cn.net.cvtt.algorithm;

import java.util.Arrays;

/**
 * @author zongchuanqi
 *
 */
public class MergeSortedArray {
	public static int[] mergeSortedArray(int[] A, int[] B) {
		// write your code here
		int newArrayLength = A.length + B.length;
		int[] newArray = new int[newArrayLength];
		int index = 0;
		for (int i = 0; i < A.length; i++) {
			newArray[index++] = A[i];
		}
		for (int i = 0; i < B.length; i++) {
			newArray[index++] = B[i];
		}
		quikSort(newArray, 0, newArray.length - 1);
		return newArray;
	}

	public static void quikSort(int[] array, int low, int height) {
		if (low > height) {
			return;
		}
		int i = low, j = height;
		int index = array[i];
		while (i < j) {
			while (i < j && array[j] >= index) {
				j--;
			}
			if (i < j) {
				array[i++] = array[j];
			}
			while (i < j && array[i] < index) {
				i++;
			}
			if (i < j) {
				array[j--] = array[i];
			}
		}
		array[i] = index;
		quikSort(array, low, i - 1);
		quikSort(array, i + 1, height);
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(MergeSortedArray.mergeSortedArray(new int[] {7}, new int[] {7})));
	}
}
