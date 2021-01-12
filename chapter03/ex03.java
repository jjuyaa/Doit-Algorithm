package chapter03;
import java.util.Scanner;

public class ex03 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		
		for (int i = 0; i < n; i++)
			if (a[i] == key) {
				idx[count] = i;
				count++;
			}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = scanner.nextInt();
		
		int[] x = new int[num];
		int[] y = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scanner.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int key = scanner.nextInt();
		
		int count = searchIdx(x, num, key, y);
		
		if (count != 0) {
			System.out.println("key " + key + "�� ��ġ�ϴ� ��Ҵ� " + count + "�� �ֽ��ϴ�. ");
			System.out.print("y = ");
			for (int i = 0; i < count; i++)
				System.out.print(y[i] + " ");
		}
		else
			System.out.println("key�� ��ġ�ϴ� ��Ұ� �����ϴ�. ");
	}
}