package chapter05;
import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int facN = 1;
		
		System.out.print("������ �Է��ϼ��� : ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			facN *= i;
		}
		
		System.out.println(n + "�� ���丮���� " + facN + "�Դϴ�. ");
	}
}