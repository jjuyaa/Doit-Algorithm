package chapter03;
import java.util.Arrays;
import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = scanner.nextInt();
		
		System.out.println("������������ �Է��ϼ���. ");
		int[] x = new int[num];
		System.out.print("x[0] : ");
		x[0] = scanner.nextInt();
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = scanner.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		System.out.print("�˻��� �� : ");
		int key = scanner.nextInt();
		
		int index = Arrays.binarySearch(x, key);
		
		if (index < 0)
			System.out.println("�˻��� �����߽��ϴ�. ���� ����Ʈ�� " + (index * (-1) - 1) + "�Դϴ�. ");
		else
			System.out.println("�˻��� �����߽��ϴ�. " + key + "��(��) x[" + index + "]�� �ֽ��ϴ�. ");
	}
}
