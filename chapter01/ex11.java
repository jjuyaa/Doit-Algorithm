package chapter01;
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int count = 1;
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		num = scanner.nextInt();
		
		do {
			num = num / 10;
			if (num != 0)
				count++;
		} while (num > 10);
		
		System.out.println("�� ���� " + count + "�ڸ��Դϴ�. ");
	}
}