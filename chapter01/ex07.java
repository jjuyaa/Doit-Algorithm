package chapter01;
import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�. ");
		System.out.print("n�� �� : ");
		int n = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i != n)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = ");
		}
		
		System.out.print(sum);
	}
}