package chapter04;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 검색 (5) 스택정리 ");
			System.out.print("(6) 스택 최대크기 확인 (7) 스택 사이즈 확인 (8) 덤프 (0) 종료 : ");
			
			int menu = scanner.nextInt();
			if (menu == 0)
				break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = scanner.nextInt();
				try {
					s.push(x);
				}
				catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다. ");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다. ");
				}
				catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다. ");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다. ");
				}
				catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다. ");
				}
				break;
			case 4:
				System.out.print("검색할 값 : ");
				x = scanner.nextInt();
				try {
					int index = s.indexOf(x);
					System.out.println(x + "는 " + index + "번에 있습니다. ");
				}
				catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다. ");
				}
				break;
			case 5:
				try {
					s.clear();
				}
				catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다. ");
				}
				break;
			case 6:
				System.out.println("스택의 최대 크기는 " + s.capacity() + "입니다. ");
				break;
			case 7:
				if (s.isEmpty())
					System.out.println("스택이 비어 있습니다. ");
				else if (s.isFull())
					System.out.println("스택이 가득 차 있습니다. 스택의 크기는 " + s.size() + "입니다. ");
				else
					System.out.println("스택의 크기는 " + s.size() + "입니다. ");
				break;
			case 8:
				s.dump();
				break;
			}
		}
	}
}