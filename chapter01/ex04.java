package chapter01;

public class ex04 {
	static int med03(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (c > a)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	
	public static void main(String[] args) {
		System.out.println("med03(3, 2, 1) = " + med03(3, 2, 1));
		System.out.println("med03(3, 2, 2) = " + med03(3, 2, 2));
		System.out.println("med03(3, 1, 2) = " + med03(3, 1, 2));
		System.out.println("med03(3, 2, 3) = " + med03(3, 2, 3));
		System.out.println("med03(2, 1, 3) = " + med03(2, 1, 3));
		System.out.println("med03(3, 3, 2) = " + med03(3, 3, 2));
		System.out.println("med03(3, 3, 3) = " + med03(3, 3, 3));
		System.out.println("med03(2, 2, 3) = " + med03(2, 2, 3));
		System.out.println("med03(2, 3, 1) = " + med03(2, 3, 1));
		System.out.println("med03(2, 3, 2) = " + med03(2, 3, 2));
		System.out.println("med03(1, 3, 2) = " + med03(1, 3, 2));
		System.out.println("med03(2, 3, 3) = " + med03(2, 3, 3));
		System.out.println("med03(1, 2, 3) = " + med03(1, 2, 3));
	}
}