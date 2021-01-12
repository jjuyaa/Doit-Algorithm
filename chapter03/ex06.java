package chapter03;
import java.util.Arrays;
import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = scanner.nextInt();
		
		System.out.println("오름차순으로 입력하세요. ");
		int[] x = new int[num];
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
		
		int index = Arrays.binarySearch(x, key);
		
		if (index < 0)
			System.out.println("검색에 실패했습니다. 삽입 포인트는 " + (index * (-1) - 1) + "입니다. ");
		else
			System.out.println("검색에 성공했습니다. " + key + "은(는) x[" + index + "]에 있습니다. ");
	}
}
