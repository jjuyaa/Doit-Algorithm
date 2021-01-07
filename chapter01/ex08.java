package chapter01;
import java.util.Scanner;

public class ex08 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		System.out.println("1부터 " + n + "까지의 합을 구합니다. ");
		
		int sum = (1 + n) * n / 2;
		
		System.out.println("합은 " + sum + "입니다. ");
	}
}