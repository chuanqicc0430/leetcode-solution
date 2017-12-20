/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * @author zongchuanqi
 *
 */
public class CompareStrings {
	public static boolean compareStrings(String source, String target) {
		// write your code here
		if (source == null || target == null) {
			return false;
		}
		if (source.length() == 0 || target.length() == 0) {
			return false;
		}
		char[] sourceArray = source.toCharArray();
		char[] targetArray = target.toCharArray();

		boolean b = true;
		for (char c : targetArray) {
			boolean check = false;
			for (int i = 0; i < sourceArray.length; i++) {
				if (sourceArray[i] == c) {
					check = true;
					sourceArray[i] = ' ';
					break;
				}
			}
			b &= check;
		}
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println(CompareStrings.compareStrings("ABCD", "AABC"));
	}
}
