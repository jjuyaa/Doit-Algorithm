package chapter01;
import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		int dif;
		
		System.out.print("a�� �� : ");
		a = scanner.nextInt();
		do {
			System.out.print("b�� �� : ");
			b = scanner.nextInt();
		
			if (a >= b)
				System.out.println("a���� ū ���� �Է��ϼ��� ! ");
		} while (a >= b);
		
		dif = b - a;
		System.out.println("b - a�� " + dif + "�Դϴ�. ");
	}
}