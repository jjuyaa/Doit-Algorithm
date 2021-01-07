package chapter01;
import java.util.Scanner;

public class ex16 {
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 단의 피라미드 ? ");
		int level = scanner.nextInt();
		
		spira(level);
	}
}