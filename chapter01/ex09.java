package chapter01;
import java.util.Scanner;

public class ex09 {
	static int sumof(int a, int b) {
		int sum = (a + b) * (b - a + 1) / 2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = scanner.nextInt();
		System.out.print("b : ");
		int b= scanner.nextInt();
		System.out.println(a + "���� " + b + "������ ���� " + sumof(a, b) + "�Դϴ�. ");
	}

}
