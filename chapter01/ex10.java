package chapter01;
import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		int dif;
		
		System.out.print("a의 값 : ");
		a = scanner.nextInt();
		do {
			System.out.print("b의 값 : ");
			b = scanner.nextInt();
		
			if (a >= b)
				System.out.println("a보다 큰 값을 입력하세요 ! ");
		} while (a >= b);
		
		dif = b - a;
		System.out.println("b - a는 " + dif + "입니다. ");
	}
}