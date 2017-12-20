/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * 二分查找实现
 * @author zongchuanqi
 *
 */
public class FindPosition {
	public static int findPosition(int[] nums, int target) {
		// write your code here
		int low = 0;
		int height = nums.length - 1;
		while (low <= height) {
			int mid = low + (height - low) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] > target) {
				height = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(FindPosition.findPosition(new int[] { 1, 2, 2, 4, 5, 5 }, 6));
	}
}
