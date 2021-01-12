package chapter03;
import java.util.Scanner;

public class ex02 {
	static void seqSearchSen(int[] a, int n, int key) {
		int index = 0;
		
		for(index = 0; index < n; index++) {
			System.out.print("\n   |");
			for (int j = 0; j <= index; j++) {
				if (j != index)
					System.out.print("   ");
				else
					System.out.print("  *");
			}
			
			System.out.printf("\n%3d|", index);
			printArray(a);
			
			if (a[index] == key)
				break;
		}
		if (index == n)
			System.out.println("\n�� ��Ҵ� �����ϴ�. ");
		else
			System.out.println("\n" + key + "�� x[" + index + "]�� �ֽ��ϴ�. ");
	}
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = scanner.nextInt();
		
		int[] x = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scanner.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int key = scanner.nextInt();
		
		System.out.print("   |");
		for (int i = 0; i < num; i++)
			System.out.print("  " + i);
		System.out.print("\n---+");
		for (int i = 0; i < num; i++)
			System.out.print("---");
		
		seqSearchSen(x, num, key);
	}
}