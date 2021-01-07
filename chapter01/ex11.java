package chapter01;
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int count = 1;
		
		System.out.print("양의 정수를 입력하세요 : ");
		num = scanner.nextInt();
		
		do {
			num = num / 10;
			if (num != 0)
				count++;
		} while (num > 10);
		
		System.out.println("그 수는 " + count + "자리입니다. ");
	}
}