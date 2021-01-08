package chapter02;
import java.util.Scanner;

public class ex04 {
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("¿ä¼Ò ¼ö : ");
		int n = scanner.nextInt();
		int[] b = new int[n];
		
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = scanner.nextInt();
		}
		
		int[] a = new int[n];
		copy(a, b);
		
		System.out.print("a : ");
		printArray(a);
		System.out.print("b : ");
		printArray(b);
	}
}