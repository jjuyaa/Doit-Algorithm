package chapter01;
import java.util.Scanner;

public class ex08 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		System.out.println("1���� " + n + "������ ���� ���մϴ�. ");
		
		int sum = (1 + n) * n / 2;
		
		System.out.println("���� " + sum + "�Դϴ�. ");
	}
}