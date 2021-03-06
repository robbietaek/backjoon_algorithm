package stack_study;

import java.util.Scanner;
import java.util.Stack;

public class b_10773 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt(); 
		
		for(int i =0; i<cnt; i++) {
			int x = scan.nextInt();
			if(x==0) {stack.pop();}
			else { stack.push(x);}	
		}
		
		int sum = 0;
		for(Integer i : stack) {
			sum += i;
		}
		
		System.out.println(sum);
			
	}
}
