/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * @author zongchuanqi
 *
 */
public class Atoi {
	public static int atoi(String str) {
		// write your code here
		if (str == null || str.length() == 0) {
			return 0;
		}
		str.trim();
		int index = 0, sign = 1;
		while(index < str.length()) {
			if (str.charAt(index) == ' ') {
				index++;
			} else if (str.charAt(index) == '+') {
				index++;
				break;
			} else if (str.charAt(index) == '-') {
				index++;
				sign = -1;
				break;
			} else {
				break;
			}
		}
		
		int result = 0;
		for (int i = index; i < str.length(); i++) {
			if (str.charAt(i) > '9' || str.charAt(i) < '0') {
				break;
			}
			result = result * 10 + (str.charAt(i) - '0');
			if (result > Integer.MAX_VALUE / 10 && (i < str.length() - 1)) {
				result = Integer.MAX_VALUE;
				break;
			}
		}
		result *= sign;
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return result;
	}

	public static void main(String[] args) {
//		System.out.println(Atoi.atoi("-2147483649"));
		System.out.println(-4 > -5);
	}
}
