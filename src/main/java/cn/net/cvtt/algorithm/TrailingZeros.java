/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * 设计一个算法，计算出n阶乘中尾部零的个数<br>
 * 样例:11! = 39916800，因此应该返回 2<>
 * 
 * @author zongchuanqi
 *
 */
public class TrailingZeros {
	public static int trailingZeros(int n) {
		if (n < 5) {
			return 0;
		}
		int count = 0;
		for (int i = 5; i <= n; i++) {
			int j = i;
			while (j % 5 == 0) {
				count++;
				j /= 5;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(TrailingZeros.trailingZeros(105));
	}
}
