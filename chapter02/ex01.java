package chapter02;
import java.util.Random;

public class ex01 {
	static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		
		return max;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println("키의 최댓값을 구합니다. ");
		int n = 3 + random.nextInt(8);
		System.out.println("사람 수 : " + n);
		
		int[] height = new int[n];
		
		System.out.println("키 값은 다음과 같습니다. ");
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + random.nextInt(100);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		System.out.println("최댓값은 " + maxOf(height) + "입니다. ");
	}
}