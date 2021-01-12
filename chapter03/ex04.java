package chapter03;
import java.util.Scanner;

public class ex04 {
	static int binSearch(int[] x, int n, int key) {
		int leftIndex = 0;
		int rightIndex = n - 1;
		
		do {
			int centerIndex = (leftIndex + rightIndex) / 2;
			
			printProcess(x, n, leftIndex, rightIndex, centerIndex);
			
			if (x[centerIndex] == key)
				return centerIndex;
			else if (x[centerIndex] > key)
				rightIndex = centerIndex - 1;
			else
				leftIndex = centerIndex + 1;
		} while (leftIndex <= rightIndex);
		
		return -1;
	}
	
	static void printProcess(int[] x, int n, int l, int r, int c) {
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			if (i == l)
				System.out.print(" <-");
			else if (i == c)
				System.out.print("  +");
			else if (i == r)
				System.out.print(" ->");
			else
				System.out.print("   ");
		}
		
		System.out.printf("\n%3d|", c);
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", x[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = scanner.nextInt();
		
		int[] x = new int[num]; 
		System.out.println("오름차순으로 입력하세요 ");
		System.out.print("x[0] : ");
		x[0] = scanner.nextInt();
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = scanner.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int key = scanner.nextInt();
		
		System.out.print("   |");
		for(int i = 0; i < num; i++) {
			System.out.printf("%3d", i);
		}
		System.out.print("\n---+");
		for(int i = 0; i < num; i++) {
			System.out.print("---");
		}
		System.out.println();
		
		int index = binSearch(x, num, key);
		
		if (index == -1)
			System.out.println("그 요소는 없습니다. ");
		else
			System.out.println(key + "는 x[" + index + "]에 있습니다. ");
	}
}