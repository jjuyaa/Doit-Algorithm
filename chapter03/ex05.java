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
		
		System.out.print("요소 수 : ");
		int num = scanner.nextInt();
		
		int[] x = new int[num];
		System.out.println("오름차순으로 입력하세요");
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
		
		int index = binSearchX(x, num, key);
		
		if (index == -1)
			System.out.println("그 요소는 없습니다. ");
		else
			System.out.println(key + "는 x[" + index + "]에 있습니다. ");
	}
}