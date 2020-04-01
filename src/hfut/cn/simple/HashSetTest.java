package hfut.cn.simple;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String inputData = s.nextLine();
		String[] strs = inputData.split(" ");
		HashSet<Integer> destData = new HashSet();

		if (strs.length <= 0) {
			return;
		}

		else {
			for (int i = 0; i < strs.length; i++) {
				destData.add(Integer.parseInt(strs[i]));
			}
		}
		
		System.out.println(destData);
		

	}

}
