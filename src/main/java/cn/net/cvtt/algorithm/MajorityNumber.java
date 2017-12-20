/**
 * 
 */
package cn.net.cvtt.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zongchuanqi
 *
 */
public class MajorityNumber {
	public static int majorityNumber(List<Integer> nums) {
		// write your code here
		if (nums.size() == 1) {
			return nums.get(0);
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			Integer value = map.get(i);
			if (value != null) {
				value++;
			} else {
				value = 1;
			}
			map.put(i, value);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			if(value > nums.size() / 2) {
				return entry.getKey();
			}
		}
		return 0;
	}
}
