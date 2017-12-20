/**
 * 
 */
package cn.net.cvtt.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zongchuanqi
 *
 */
public class LongestWords {
	public static List<String> longestWords(String[] dictionary) {
		// write your code here
		int maxLength = 0;
		List<String> list = new ArrayList<String>();
		for (String str : dictionary) {
			if (maxLength == 0 || str.length() > maxLength) {
				maxLength = str.length();
				list = new ArrayList<String>();
				list.add(str);
			} else if (str.length() == maxLength) {
				list.add(str);
			}
		}
		return list;
	}
}
