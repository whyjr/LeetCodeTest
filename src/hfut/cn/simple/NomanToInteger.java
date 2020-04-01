package hfut.cn.simple;

/**
 * 字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/roman-to-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author Administrator
 *
 */
public class NomanToInteger {
	public static void main(String[] args) {
		
		String s = "MCMXCIV";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				if ((i + 1) < s.length()&&s.charAt(i + 1) == 'V' ) {
					sum += 4;
					i++;
				} else if ((i + 1) < s.length()&&s.charAt(i + 1) == 'X') {
					sum += 9;
					i++;
				} else {
					sum += 1;
				}
				break;
			case 'V':
				sum += 5;
				break;
			case 'X':
				if ((i + 1) < s.length()&&s.charAt(i + 1) == 'L' ) {
					sum += 40;
					i++;
				} else if ((i + 1) < s.length()&&s.charAt(i + 1) == 'C') {
					sum += 90;
					i++;
				} else {
					sum += 10;
				}
				break;
			case 'L':
				sum += 50;
				break;
			case 'C':
				if ((i + 1) < s.length()&&s.charAt(i + 1) == 'D') {
					sum += 400;
					i++;
				} else if ((i + 1) < s.length()&&s.charAt(i + 1) == 'M' ) {
					sum += 900;
					i++;
				} else {
					sum += 100;
				}
				break;
			case 'D':
				sum += 500;
				break;
			case 'M':
				sum += 1000;
				break;

			}
		}
		System.out.println("result:"+sum);

	}

}
