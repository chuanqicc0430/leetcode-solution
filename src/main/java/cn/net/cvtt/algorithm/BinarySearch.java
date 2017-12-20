/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * @author zongchuanqi
 *
 */
public class BinarySearch {
	/**
	 * 二分查找第一次出现的位置
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int binarySearchFirst(int[] nums, int target) {
		// write your code here
		int low = 0;
		int height = nums.length - 1;
		while (low < height) {
			int mid = low + (height - low) / 2;
			if (nums[mid] < target) {
				low = mid + 1;
			} else {
				height = mid;
			}
		}
		if (nums[low] != target) {
			return -1;
		} else {
			return low;
		}
	}

	/*
	 * 二分查找最后一次出现的位置
	 */
	public static int binarySearchLast(int[] nums, int target) {
		int low = 0;
		int height = nums.length - 1;
		while (low < height) {
			int mid = low + (height - low + 1) / 2;
			if (nums[mid] <= target) {
				low = mid;
			} else {
				height = mid - 1;
			}
		}

		if (nums[low] != target) {
			return -1;
		} else {
			return height;
		}
	}

	public static void main(String[] args) {
		System.out.println(BinarySearch.binarySearchFirst(new int[] { 1, 4, 4, 5, 7, 7, 8, 9, 9, 10 }, 1));
		System.out.println(BinarySearch.binarySearchLast(new int[] { 1, 4, 4, 5, 7, 7, 8, 9, 9, 10 }, 4));
	}
}
