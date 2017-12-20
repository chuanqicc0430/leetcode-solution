/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * @author zongchuanqi
 *
 */
public class StrStr {
	public static int strStr(String source, String target) {
		if(source == null || target == null) {
			return -1;
		}
		if (source.length() == 0) {
			if (target.length() == 0) {
				return 0;
			}
			return -1;
		}
		if (target.length() == 0) {
			if(source.length() == 0) {
				return -1;
			}
			return 0;
		}
		// write your code here
		if (source.equals(target)) {
			return 0;
		}
		if(target.length() > source.length()) {
			return -1;
		}
		char[] sourceArray = source.toCharArray();
		char[] targetArray = target.toCharArray();
		char targetFirstChar = targetArray[0];

		int max = sourceArray.length - targetArray.length;
		int i = 0;
		while (i <= max) {
			while (i <= max && sourceArray[i] != targetFirstChar) {
				i++;
			}
			if (i <= max) {
				int k = 1, end = 0;
				for (int j = i + 1; j < (max + targetArray.length); j++, k++) {
					if (k == targetArray.length) {
						break;
					}
					if (sourceArray[j] == targetArray[k]) {
						end++;
					}
				}
				if (end == targetArray.length - 1) {
					return i;
				}
				i++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(strStr("tartarget", "target"));
	}
}
