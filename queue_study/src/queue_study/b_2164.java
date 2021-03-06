package queue_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b_2164 {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		if(n==1) {
			System.out.println(1);
			return;
		}
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i<=n;i++) {
			q.add(i);
		}
		
		while(true) {
			q.poll();
			if(q.size()==1) break;
			int x = q.poll();
			q.add(x);
		}
		System.out.println(q.poll());
	}

}
