package chapter02;
import java.util.Scanner;

public class ex06 {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		for (int i = 0; i < digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num, r, dnum;
		char[] cnum = new char[32];
		
		System.out.println("10진수를 기수 변환합니다. ");
		
		do {
			System.out.print("변환하는 음이 아닌 정수 : ");
			num = scanner.nextInt();
		} while (num < 0);
		
		do {
			System.out.print("어떤 진수로 변환할까요 ? (2 ~ 36) : ");
			r = scanner.nextInt(); 
		} while (r < 2 || r > 36);
		
		dnum = cardConv(num, r, cnum);
		
		System.out.print(r + "진수로는 ");
		for (int i = 0; i < dnum; i++)
			System.out.print(cnum[i]);
		System.out.print("입니다. ");
	}
}