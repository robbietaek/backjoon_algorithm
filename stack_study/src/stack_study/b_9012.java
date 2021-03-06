package stack_study;

import java.util.Scanner;
import java.util.Stack;

public class b_9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		while (cnt-- > 0) {
			boolean flag = true;
			Stack<Character> stack = new Stack<>();
			String s = sc.next();
			char[] arr = s.toCharArray();

			for (char c : arr) {
				if (c == '(') {
					stack.push(c);
				} else {
					if (stack.size() == 0) {
						flag = false;
						break;
					} else {
						stack.pop();
					}
				}
			}

			if (stack.size() > 0) {
				flag = false;
			}
			System.out.println(flag ? "YES" : "NO");
		}

	}

}
