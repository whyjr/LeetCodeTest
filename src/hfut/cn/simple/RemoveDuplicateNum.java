package hfut.cn.simple;

/**
 * ����һ���������飬����Ҫ�� ԭ�� ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ� �����Ƴ���������³��ȡ� ��Ҫʹ�ö��������ռ䣬������� ԭ��
 * �޸��������� ����ʹ�� O(1) ����ռ����������� ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 * 
 * @author Administrator
  *  ˫ָ��˼��
 *
 */

public class RemoveDuplicateNum {
	public static void main(String[] args) {

		int[] nums = new int[] { 0, 0 };
		int i = 0, j = 1;
		while (j < nums.length) {
			if (nums[i] == nums[j]) {
				j++;
			} else {
				i++;
				nums[i] = nums[j];
				j++;
			}
		}

		System.out.println(i + 1);

	}

}
