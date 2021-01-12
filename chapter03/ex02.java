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
			System.out.println("\n그 요소는 없습니다. ");
		else
			System.out.println("\n" + key + "는 x[" + index + "]에 있습니다. ");
	}
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = scanner.nextInt();
		
		int[] x = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scanner.nextInt();
		}
		
		System.out.print("검색할 값 : ");
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