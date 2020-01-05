package studytime;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack {

	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		Integer[] stack2 = new Integer[10];
		int idx = 0;
		
		for(int i = 0; i<111; i++) stack2 = push(stack2,i,idx++);
		stack2 = push(stack2,1,idx++);
		stack2 = push(stack2,3,idx++);
		Print(stack2);
		stack2 = pop(stack2,--idx);
		
		stack2 = pop(stack2,--idx);
	}

	private static Integer[] pop(Integer[] stack2, int idx) throws Exception {
		if(idx<0) throw new Exception("StackUnderFlow ¹ß»ý");
		stack2[idx] = null;
		return stack2;
	}

	private static Integer[] push(Integer[] stack2, int i , int idx) {
		stack2[idx] = i;
		return stack2;
	}
	
}
