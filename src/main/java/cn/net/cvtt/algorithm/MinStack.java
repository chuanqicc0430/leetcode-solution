/**
 * 
 */
package cn.net.cvtt.algorithm;

import java.util.Stack;

/**
 * @author zongchuanqi
 *
 */
public class MinStack {
	private volatile int minValue;
	private volatile Stack<Integer> minValStack;
	private Stack<Integer> stack;

	public MinStack() {
		// do intialization if necessary
		stack = new Stack<Integer>();
		minValStack = new Stack<Integer>();
	}

	/*
	 * @param number: An integer
	 * 
	 * @return: nothing
	 */
	public void push(int number) {
		// write your code here
		if (minValue == 0 || minValue >= number) {
			minValue = number;
			minValStack.push(minValue);
		}
		stack.push(number);
	}

	/*
	 * @return: An integer
	 */
	public int pop() {
		// write your code here
		int val = stack.pop();
		if (val == minValue) {
			minValStack.pop();
			if (minValStack.isEmpty()) {
				minValue = 0;
			} else {
				minValue = minValStack.peek();
			}
		}
		return val;
	}

	/*
	 * @return: An integer
	 */
	public int min() {
		// write your code here
		return minValue;
	}

	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(1);
		stack.push(1);
		stack.push(1);
		System.out.println(stack.min());
		System.out.println(stack.pop());
		System.out.println(stack.min());
		System.out.println(stack.pop());
//		System.out.println(stack.min());
	}
}
