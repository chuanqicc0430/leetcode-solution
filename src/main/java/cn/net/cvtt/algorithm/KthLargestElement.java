/**
 * 
 */
package cn.net.cvtt.algorithm;

import java.util.Arrays;

/**
 * @author zongchuanqi
 *
 */
public class KthLargestElement {
	public static int kthLargestElement(int k, int[] array) {
        // write your code here
		KthLargestElement.quikSort(array, 0, array.length - 1);
		return array[k - 1];
    }
	public static void quikSort(int[] array, int low, int height) {
		if (low > height) {
			return;
		}
		int i = low, j = height;
		int index = array[i];
		while (i < j) {
			while (i < j && array[j] < index) {
				j--;
			}
			if (i < j) {
				array[i++] = array[j];
			}
			while (i < j && array[i] >= index) {
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
		int[] array = new int[] { 9,3,2,4,8 };
		KthLargestElement.quikSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
		
		System.out.println(KthLargestElement.kthLargestElement(3, array));
	}
}
