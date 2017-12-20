/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * @author zongchuanqi
 *
 */
public class NthUglyNumber {
	public static int nthUglyNumber(int n) {
		// write your code here
		if (n == 1) {
			return 1;
		}
		int i = 1;
		int number = 0;
		while(i <= n) {
			if (NthUglyNumber.isUglyNumber(++number)) {
				i++;
			}
		}
		return number;
	}

	public static boolean isUglyNumber(int num) {
		if (num == 1) {
			return true;
		}
		while (num % 2 == 0) {
			num /= 2;
		}
		while (num % 3 == 0) {
			num /= 3;
		}
		while (num % 5 == 0) {
			num /= 5;
		}
		if (num == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(NthUglyNumber.nthUglyNumber(1665));
	}
}
