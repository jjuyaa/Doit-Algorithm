package chapter01;
import java.util.Scanner;

public class ex15 {
	// 왼쪽 아래 직각삼각형
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}
	
	// 왼쪽 위 직각삼각형
	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i + 1; j >= 1; j--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}
	
	// 오른쪽 아래 직각삼각형
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = n - i; j < n; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}
	
	// 오른쪽 위 직각삼각형
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++)
				System.out.print(" ");
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단 수를 입력하세요 : ");
		int level = scanner.nextInt();
		triangleLB(level);
		triangleLU(level);
		triangleRB(level);
		triangleRU(level);
	}

}
