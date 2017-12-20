/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * @author zongchuanqi
 *
 */
public class MaxSubArray {
	public static int maxSubArray(int[] nums) {
		// write your code here
		if (nums.length == 1) {
			return nums[0];
		}
		int max = 0;
		int currentSum = 0;
		int maxNegative = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				if (maxNegative == 0 || nums[i] > maxNegative) {
					maxNegative = nums[i];
				}
			}
			if (currentSum >= 0) {
				currentSum += nums[i];
			} else {
				currentSum = nums[i];
			}
			if (currentSum > max) {
				max = currentSum;
			}
		}
		if (max == 0) {
			return maxNegative;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] array = new int[] { -2, 2, -3, 4, -1, 2, 1, -5, 3 };
		System.out.println(MaxSubArray.maxSubArray(array));
	}
}
