package chapter02;
import java.util.Scanner;

public class ex08 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int day = d;
		
		while (m != 1) {
			day += mdays[isLeap(y)][m - 1];
			m--;
		}
		
		return day;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �� ���� ���մϴ�. ");
		
		do {
			System.out.print("�� : ");
			int year = scanner.nextInt();
			System.out.print("�� : ");
			int month = scanner.nextInt();
			System.out.print("�� : ");
			int day = scanner.nextInt();
			
			System.out.println("�� �� " + dayOfYear(year, month, day) + "�� °�Դϴ�. ");
			System.out.print("�� �� �� �ұ�� ? (1. �� / 2. �ƴϿ�) : ");
			retry = scanner.nextInt();
		} while (retry == 1);
	}
}