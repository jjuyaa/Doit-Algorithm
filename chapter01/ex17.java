package chapter01;
import java.util.Scanner;

public class ex17 {
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print(i);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ���� �Ƕ�̵� ? ");
		int level = scanner.nextInt();
		
		npira(level);
	}
}