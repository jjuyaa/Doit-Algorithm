package chapter01;
import java.util.Scanner;

public class ex02 {
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("�ּڰ��� " + min3(a, b, c) + "�Դϴ�. ");
	}
}