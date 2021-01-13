package chapter05;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다. ");
		System.out.print("정수를 입력하세요 : ");
		int a = scanner.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int b = scanner.nextInt();
		
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		System.out.println("최대 공약수는 " + a + "입니다. ");
	}
}