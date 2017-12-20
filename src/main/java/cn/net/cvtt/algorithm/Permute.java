/**
 * 
 */
package cn.net.cvtt.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zongchuanqi
 *
 */
public class Permute {
	/**
	 * 从集合中依次选出每一个元素作为排列的第一个元素，然后对剩余的元素进行全排列，如此递归从而得到全排列。
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> permute(int[] nums) {
		// write your code here
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		backtracking(nums, list, result);
		return result;
	}

	public static void backtracking(int[] nums, List<Integer> list, List<List<Integer>> result) {
		if (list.size() == nums.length) {
			result.add(new ArrayList<>(list));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (list.contains(nums[i])) {
					continue;
				}
				list.add(nums[i]);
				backtracking(nums, list, result);
				list.remove(list.size() - 1);
			}
		}

	}
	
	public static void main(String[] args) {
		System.out.println(Permute.permute(new int[] {1,2,3}));
	}
}
