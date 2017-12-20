/**
 * 
 */
package cn.net.cvtt.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zongchuanqi
 *
 */
public class SearchRange {
	public static List<Integer> searchRange(TreeNode root, int k1, int k2) {
		// write your code here
		List<Integer> results = new ArrayList<Integer>();
		if (root.getVal() < k2 && root.getVal() > k1) {
			results.add(root.getVal());
		}
		if (root.getLeft() != null) {
			results.addAll(searchRange(root.getLeft(), k1, k2));
		}
		if (root.getRight() != null) {
			results.addAll(searchRange(root.getRight(), k1, k2));
		}
		Collections.sort(results);
		return results;
	}

	class TreeNode {
		public int val;
		public TreeNode left, right;

		public TreeNode(int val) {
			this.val = val;
			this.left = this.right = null;
		}

		/**
		 * @return the val
		 */
		public int getVal() {
			return val;
		}

		/**
		 * @param val
		 *            the val to set
		 */
		public void setVal(int val) {
			this.val = val;
		}

		/**
		 * @return the left
		 */
		public TreeNode getLeft() {
			return left;
		}

		/**
		 * @param left
		 *            the left to set
		 */
		public void setLeft(TreeNode left) {
			this.left = left;
		}

		/**
		 * @return the right
		 */
		public TreeNode getRight() {
			return right;
		}

		/**
		 * @param right
		 *            the right to set
		 */
		public void setRight(TreeNode right) {
			this.right = right;
		}

	}
}
