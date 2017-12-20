/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * @author zongchuanqi
 *
 */
public class MinSubArray {
	public static int minSubArray(int[] nums) {
		// write your code here
		if (nums.length == 1) {
			return nums[0];
		}
		int min = 0;
		int currentSum = 0;
		int minPositive = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				if (minPositive == 0 || nums[i] < minPositive) {
					minPositive = nums[i];
				}
			}
			if (currentSum < 0) {
				currentSum += nums[i];
			} else {
				currentSum = nums[i];
			}
			if (currentSum < min) {
				min = currentSum;
			}
		}
		if (min == 0) {
			return minPositive;
		}
		return min;
	}
}
