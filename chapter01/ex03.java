package chapter01;
import java.util.Scanner;

public class ex03 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		System.out.println("�ּڰ��� " + min4(a, b, c, d) + "�Դϴ�. ");
	}
}