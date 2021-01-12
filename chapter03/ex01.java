package chapter03;
import java.util.Scanner;

public class ex01 {
	static int seqSearchSen(int[] a, int n, int key) {
		int index = 0;
		
		a[n] = key;
		
		for(index = 0; index <= n; index++) {
			if (a[index] == key)
				break;
		}
		
		return (index == n) ? -1 : index;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = scanner.nextInt();
		
		int[] x = new int[num + 1];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scanner.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = scanner.nextInt();
		
		if (seqSearchSen(x, num, key) == -1)
			System.out.println("그 요소는 없습니다. ");
		else
			System.out.println(key + "은(는) x[" + seqSearchSen(x, num, key) + "]에 있습니다. ");
	}
}