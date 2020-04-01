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
		// 解析[[10,3,4],[8,0],[2,4,6,9]]为List<List<Integer>>；使用栈
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
	 * 可达性判断，待理解
	 * 
	 * @param rooms
	 * @return
	 */
	public static boolean canVisitRooms(List<List<Integer>> rooms) {
		// 用栈来存储下一步将要参观的房间
		Stack<Integer> todo = new Stack<>();
		todo.add(0);
		// 用hashset放置已经参观过的房间
		HashSet<Integer> done = new HashSet<>();
		done.add(0);

		while (!todo.isEmpty()) {

			int i = todo.pop();
			// 如果当前所在的房间里的钥匙，对应的那个房间不在已经参观的房间里边，
			// 那么就将钥匙对应的房间，加入将要参观的房间里，同时也加入已经参观的房间里
			for (Integer j : rooms.get(i)) {
				if (!done.contains(j)) {
					todo.add(j);
					done.add(j);
					// 若所有房间都已在已经参观的房间队列，可提前结束
					if (rooms.size() == done.size())
						return true;
				}
			}
		}
		return rooms.size() == done.size();
	}

}
