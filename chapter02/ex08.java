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
		
		System.out.println("그 해 경과 일 수를 구합니다. ");
		
		do {
			System.out.print("년 : ");
			int year = scanner.nextInt();
			System.out.print("월 : ");
			int month = scanner.nextInt();
			System.out.print("일 : ");
			int day = scanner.nextInt();
			
			System.out.println("그 해 " + dayOfYear(year, month, day) + "일 째입니다. ");
			System.out.print("한 번 더 할까요 ? (1. 예 / 2. 아니오) : ");
			retry = scanner.nextInt();
		} while (retry == 1);
	}
}