package leetcode_problem;

import java.util.Stack;

public class valid_parenthesis {

	public static void main(String[] args) {
		String s = "{[}";
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			}else if(ch == ')') {
				if(st!=null && st.peek() != '(') {
					System.out.println(false);
				}
				st.pop();
			}
			else if(ch == ']') {
				if(st!=null && st.peek() != '[') {
					System.out.println(false);
				}
				st.pop();
			}
			else if(ch == '}') {
				if(st!=null && st.peek() != '{') {
					System.out.println(false);
				}
				st.pop();
			}
		}
		if(st.empty()) {
			System.out.println(true);
		}
	}
}
