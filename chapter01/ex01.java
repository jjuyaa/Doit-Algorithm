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
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		System.out.println("�ִ��� " + max4(a, b, c, d) + "�Դϴ�. ");
	}
}