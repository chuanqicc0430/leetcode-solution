/**
 * 
 */
package cn.net.cvtt.algorithm;

import java.util.Arrays;

/**
 * @author zongchuanqi
 *
 */
public class RotateString {
	public static void rotateString(char[] str, int offset) {
		// write your code here
		if(str.length == 0) {
			return;
		}
		if (offset == 0) {
			return;
		}
		while(offset > str.length) {
			offset = offset % str.length;
		}
		char[] tempArray = Arrays.copyOf(str, str.length);
		for (int i = 0; i < offset; i++) {
			str[i] = tempArray[str.length - offset + i];
		}
		for (int i = offset; i < str.length; i++) {
			str[i] = tempArray[i - offset];
		}
	}

	public static void main(String[] args) {
		char[] array = new char[] { 'c', 'p', 'p', 'j', 'a', 'v', 'a','p','y' };
		RotateString.rotateString(array, 25);
		System.out.println(Arrays.toString(array));
		
		System.out.println('9'-'0');
	}
}
