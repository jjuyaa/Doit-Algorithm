package chapter03;
import java.util.Scanner;

public class ex05 {
	static int binSearchX(int[] a, int n, int key) {
		int leftIndex = 0;
		int rightIndex = n-1;
		
		do {
			int centerIndex =(leftIndex + rightIndex) / 2;
			
			if (a[centerIndex] == key) {
				while (a[centerIndex - 1] == key) {
					centerIndex = centerIndex - 1;
				}
				return centerIndex;
			}
			else if (a[centerIndex] > key)
				rightIndex = centerIndex - 1;
			else
				leftIndex = centerIndex + 1;
		} while (leftIndex <= rightIndex);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = scanner.nextInt();
		
		int[] x = new int[num];
		System.out.println("������������ �Է��ϼ���");
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
		
		int index = binSearchX(x, num, key);
		
		if (index == -1)
			System.out.println("�� ��Ҵ� �����ϴ�. ");
		else
			System.out.println(key + "�� x[" + index + "]�� �ֽ��ϴ�. ");
	}
}