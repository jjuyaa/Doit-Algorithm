package chapter05;
import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int facN = 1;
		
		System.out.print("정수를 입력하세요 : ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			facN *= i;
		}
		
		System.out.println(n + "의 팩토리얼은 " + facN + "입니다. ");
	}
}