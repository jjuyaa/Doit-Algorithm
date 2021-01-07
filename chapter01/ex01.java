package chapter01;

import java.util.Scanner;

public class ex01 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("네 수를 입력하세요 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		System.out.println("최댓값은 " + max4(a, b, c, d) + "입니다. ");
	}
}