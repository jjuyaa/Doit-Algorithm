package chapter01;
import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다. ");
		System.out.print("n의 값 : ");
		int n = scanner.nextInt();
		
		int sum = 0;
		int i = 0;
		
		while (i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("마지막 i 값은 " + i + "입니다.");
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다. ");
	}
}