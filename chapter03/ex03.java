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
		
		System.out.print("요소 수 : ");
		int num = scanner.nextInt();
		
		int[] x = new int[num];
		int[] y = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scanner.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = scanner.nextInt();
		
		int count = searchIdx(x, num, key, y);
		
		if (count != 0) {
			System.out.println("key " + key + "와 일치하는 요소는 " + count + "개 있습니다. ");
			System.out.print("y = ");
			for (int i = 0; i < count; i++)
				System.out.print(y[i] + " ");
		}
		else
			System.out.println("key와 일치하는 요소가 없습니다. ");
	}
}