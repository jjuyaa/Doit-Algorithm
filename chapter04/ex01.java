package chapter04;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while (true) {
			System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
			System.out.print("(1) Ǫ�� (2) �� (3) ��ũ (4) �˻� (5) �������� ");
			System.out.print("(6) ���� �ִ�ũ�� Ȯ�� (7) ���� ������ Ȯ�� (8) ���� (0) ���� : ");
			
			int menu = scanner.nextInt();
			if (menu == 0)
				break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = scanner.nextInt();
				try {
					s.push(x);
				}
				catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�. ");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�. ");
				}
				catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�. ");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�. ");
				}
				catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�. ");
				}
				break;
			case 4:
				System.out.print("�˻��� �� : ");
				x = scanner.nextInt();
				try {
					int index = s.indexOf(x);
					System.out.println(x + "�� " + index + "���� �ֽ��ϴ�. ");
				}
				catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�. ");
				}
				break;
			case 5:
				try {
					s.clear();
				}
				catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�. ");
				}
				break;
			case 6:
				System.out.println("������ �ִ� ũ��� " + s.capacity() + "�Դϴ�. ");
				break;
			case 7:
				if (s.isEmpty())
					System.out.println("������ ��� �ֽ��ϴ�. ");
				else if (s.isFull())
					System.out.println("������ ���� �� �ֽ��ϴ�. ������ ũ��� " + s.size() + "�Դϴ�. ");
				else
					System.out.println("������ ũ��� " + s.size() + "�Դϴ�. ");
				break;
			case 8:
				s.dump();
				break;
			}
		}
	}
}