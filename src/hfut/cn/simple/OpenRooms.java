package hfut.cn.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class OpenRooms {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String sourceStr = s.nextLine();
		// ����[[10,3,4],[8,0],[2,4,6,9]]ΪList<List<Integer>>��ʹ��ջ
		Stack<Character> mStack = new Stack();
		List<List<Integer>> dataList = new ArrayList<List<Integer>>();

		for (int i = 0; i < sourceStr.length(); i++) {

			if (sourceStr.charAt(i) == ']' && !mStack.isEmpty()) {
				char c = ' ';
				List<Integer> temp = new ArrayList<>();
				while (true) {
					if (!mStack.isEmpty()) {
						c = mStack.pop();
					}
					if (c == '[') {
						break;
					} else if (c <= '9' && c >= '0') {
						temp.add(Integer.parseInt(c + ""));
					}
				}

				if (temp.size() > 0) {
					dataList.add(temp);
				}

			} else {
				mStack.push(sourceStr.charAt(i));
			}
		}

		// System.out.println(" " + dataList);

		System.out.println(canVisitRooms(dataList));

	}

	/**
	 * �ɴ����жϣ������
	 * 
	 * @param rooms
	 * @return
	 */
	public static boolean canVisitRooms(List<List<Integer>> rooms) {
		// ��ջ���洢��һ����Ҫ�ι۵ķ���
		Stack<Integer> todo = new Stack<>();
		todo.add(0);
		// ��hashset�����Ѿ��ι۹��ķ���
		HashSet<Integer> done = new HashSet<>();
		done.add(0);

		while (!todo.isEmpty()) {

			int i = todo.pop();
			// �����ǰ���ڵķ������Կ�ף���Ӧ���Ǹ����䲻���Ѿ��ι۵ķ�����ߣ�
			// ��ô�ͽ�Կ�׶�Ӧ�ķ��䣬���뽫Ҫ�ι۵ķ����ͬʱҲ�����Ѿ��ι۵ķ�����
			for (Integer j : rooms.get(i)) {
				if (!done.contains(j)) {
					todo.add(j);
					done.add(j);
					// �����з��䶼�����Ѿ��ι۵ķ�����У�����ǰ����
					if (rooms.size() == done.size())
						return true;
				}
			}
		}
		return rooms.size() == done.size();
	}

}
