import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String [] args) {
		String postfix = readInput();
		Double ans = evalPostfix(postfix);
		if (null == ans) {
			System.out.println("invalid postfix!");
		} else {
			System.out.println(ans);
		}
	}
	
	public static Double evalPostfix(String postfix) {
		if (null == postfix) { return null; }
		
		String [] sArr = postfix.split(" ");
		int len = sArr.length;
		Stack<Double> stack = new Stack<Double>();
		
		for (int i=0; i<len; i++) {
			String st = sArr[i].trim();
			
			if (isOperator(st)) {
				if (stack.isEmpty() || stack.size() < 2) { return null; }
				double op1 = stack.pop();
				double op2 = stack.pop();
				Double ans = eval(op2, op1, st);
				if (null == ans) { return null; }
				stack.push(ans);
			} else {
				stack.push(Double.parseDouble(st));
			}
		}
		return stack.pop();
	}
	
	public static Double eval(double a, double b, String op) {
		if (op.equals("+")) {
			return (a+b);
		} else if (op.equals("-")) {
			return (a-b);
		} else if (op.equals("*")) {
			return (a*b);
		} else if (op.equals("/")) {
			if (0 == b) { return null; }
			return (a/b);
		} else {
			return null;
		}
	}
	
	public static boolean isOperator(String st) {
		if (st.equals("+") || st.equals("-") || st.equals("*") || st.equals("/")) {
			return true;
		}
		return false;
	}
	
	public static String readInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String expr = null;
		
		try {
			expr = br.readLine().trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return expr;
	}
}