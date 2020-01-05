package if_study;

import java.util.Scanner;

public class b_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h>=0&&h<=24&&m>=0&&m<=60) {
		
		if(m>45) {
			m= m-45;
		} else if(m==45){
			m= 0;
		} else {
			h= h-1;
			m= m-45+60;
		}
		
		System.out.println(h==-1?"23":""+ h + " " + m);
		}
	}
}
