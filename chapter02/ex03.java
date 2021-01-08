package chapter02;
import java.util.Scanner;

public class ex03 {
	static int sumOf(int[] a) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "] : ");
			array[i] = scanner.nextInt();
		}
		
		System.out.println("모든 요소의 합은 " + sumOf(array) + "입니다. ");
	}
}