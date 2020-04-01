package hfut.cn.simple;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 
 * 有效字符串需满足：
 * 
 * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串。
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * @author Administrator
 *
 */
public class LegalTestSignal {
	public static void main(String[] args) {

		String s = "()";
		
		
		Stack<Character> mStack=new Stack();
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(mStack.empty()) {
				mStack.push(arr[i]);
			}else {
				if(!checkChar(mStack.peek(),arr[i]))
					mStack.push(arr[i]);
				else
					mStack.pop();
					//return false;
			}
		}
		
		System.out.println(mStack.isEmpty());
		//return true; 
	}

	/**
	 * 
	 * @param c
	 * @param peek
	 * @return
	 */
	private static boolean checkChar(char c1, Character c2) {
		// TODO Auto-generated method stub
	  return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
	    
	}
}
