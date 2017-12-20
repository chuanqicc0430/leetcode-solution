/**
 * 
 */
package cn.net.cvtt.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给出一个具有重复数字的列表，找出列表所有不同的排列。<br>
 * 给出列表 [1,2,2]，不同的排列有：
[
  [1,2,2],
  [2,1,2],
  [2,2,1]
]
 * @author zongchuanqi
 *
 */
public class PermuteUnique {
	public static List<List<Integer>> permuteUnique(int[] nums) {
		// Write your code here
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> tempList = new ArrayList<Integer>();
		boolean used[] = new boolean[nums.length];
		backTracking(nums, result, tempList, used);
		return result;
	}

	private static void backTracking(int[] nums, List<List<Integer>> result, List<Integer> tempList, boolean[] used) {
		if (nums.length == tempList.size()) {
			result.add(new ArrayList<Integer>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false || used[i] == true) {
					continue;
				} else {
					used[i] = true;
					tempList.add(nums[i]);
					backTracking(nums, result, tempList, used);
					used[i] = false;
					tempList.remove(tempList.size() - 1);
				}
			}
		}
	}
}
