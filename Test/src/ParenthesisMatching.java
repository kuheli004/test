
import java.util.Stack;

public class ParenthesisMatching {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(I want (to write a language parser),would (you) help me)";
	//	System.out.printf("method1) %d, method2) %d%n", parenthesis(s, 2), parenthesisIdx2(s, 0));
		System.out.println(parenthesis(s, 2));
	}

	/*
	 * Time: O(n) Space: O(1)
	 */
	public static int   parenthesis(String s, int openBraceNum) {
		int count=0,pos=0,result=-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(')
				count++;
			if(count==openBraceNum)
			{
				pos=i;
				 result=parenthesisIdx2(s,pos);
				 return (result+1);
			}
			
		}
		return -1;
		
	}
	
	public static int  parenthesisIdx2(String s, int open) {
		if (s == null || open >= s.length())
			return -1;

		int openParenCnt = 0;
		int i = open;
		if (s.charAt(i) == '(')
			openParenCnt++;
		else
			return -1;

		while (openParenCnt > 0 && i < s.length() - 1) {
			i++; // Where i++ goes matters. Can't go after conditions.
			if (s.charAt(i) == '(')
				openParenCnt++;
			else if (s.charAt(i) == ')')
				openParenCnt--;
		}
		return (openParenCnt > 0) ? -1 : i;
	}

	/*
	 * Time: O(n) Space: O(n)
	 */
	public static int parenthesisIdx(String s, int open) {
		if (s == null || open >= s.length())
			return -1;
		Stack<Character> stk = new Stack<Character>();
		int i = open;

		if (s.charAt(i) == '(')
			stk.push(s.charAt(i));
		else
			return -1;

		while (!stk.isEmpty() && i < s.length() - 1) {
			i++;
			if (s.charAt(i) == '(')
				stk.push(s.charAt(i));
			else if (s.charAt(i) == ')')
				stk.pop();
		}

		return (stk.isEmpty()) ? i : -1;
	}
}
