package chapter05;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�. ");
		System.out.print("������ �Է��ϼ��� : ");
		int a = scanner.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int b = scanner.nextInt();
		
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		System.out.println("�ִ� ������� " + a + "�Դϴ�. ");
	}
}