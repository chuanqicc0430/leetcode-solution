/**
 * 
 */
package cn.net.cvtt.algorithm;

/**
 * 计算数字k在0到n中的出现的次数，k可能是0~9的一个值<br>
 * 例如 n=12，k=1，在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]，我们发现1出现了5次 (1, 10, 11, 12)
 * @author zongchuanqi
 *
 */
public class DgitCounts {
	public static int digitCounts(int k, int n) {
		int count = 0;
		if(k == 0) {
			count = 1;
		}
		for (int i = 0; i <= n; i++) {
			int j = i;
			while(j!=0) {
				if(j % 10 == k) {
					count++;
				}
				j /=10;
			}
			
		}
		return count;
    }
	
	public static void main(String[] args) {
		System.out.println(digitCounts(0,100));
	}
}
