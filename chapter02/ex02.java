package chapter02;
import java.util.Scanner;

public class ex02 {
	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
			System.out.println("array[" + i + "]과(와) array[" + (a.length - i - 1) + "]를 교환합니다. ");
			printArray(a);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i< array.length; i++) {
			System.out.print("array[" + i + "] : ");
			array[i] = scanner.nextInt();
		}
		
		printArray(array);
		reverse(array);
		System.out.println("역순 정렬을 마쳤습니다. ");
	}
}