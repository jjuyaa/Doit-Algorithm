package chapter01;
import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�. ");
		System.out.print("n�� �� : ");
		int n = scanner.nextInt();
		
		int sum = 0;
		int i = 0;
		
		while (i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("������ i ���� " + i + "�Դϴ�.");
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�. ");
	}
}