package chapter05;
import java.util.Scanner;

public class ex03 {
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
	
	static int gcdArray(int[] a) {
		int allGCD = 1;
		
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++)
				allGCD = gcd(a[i], a[j]);
		
		return allGCD;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = scanner.nextInt();
		int[] x = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scanner.nextInt();
		}
		
		System.out.println("배열 x의 요소들의 최대공약수는 " + gcdArray(x) + "입니다. ");
	}
}