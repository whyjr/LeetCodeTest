package hfut.cn.simple;

/**
 * 给定一个整数数组 nums 和一个目标值 target， 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * 
 * @author why
 *
 */
public class TwoNumsSum {

	public static void main(String[] args) {
		int[] source = new int[] { 2, 0, 1, 9 };
		int destNum = 10;
		for (int i = 0; i < source.length - 1; i++) {
			for (int j = i + 1; j < source.length; j++) {
				if ((source[i] + source[j]) == destNum) {
					System.out.println("f:" + i + ",l:" + j);
					return;
				}
			}
		}
	}
}
