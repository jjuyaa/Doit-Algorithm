package chapter02;
import java.util.Scanner;

public class ex09 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, 
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int leftDaysOfYear(int y, int m, int d) {
		int day = d;
		int leftDays;
		
		for (int i = 0; i < m - 1; i++)
			day += mdays[isLeap(y)][i];
		
		if (isLeap(y) == 1)
			leftDays = 366 - day;
		else
			leftDays = 365 - day;
		
		return leftDays;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("그 해 남은 일 수를 구합니다. ");
		
		System.out.print("년 : ");
		int year = scanner.nextInt();
		System.out.print("월 : ");
		int month = scanner.nextInt();
		System.out.print("일 : ");
		int day = scanner.nextInt();
		
		System.out.println("그 해는 " + leftDaysOfYear(year, month, day) + "일 남았습니다. ");
	}
}