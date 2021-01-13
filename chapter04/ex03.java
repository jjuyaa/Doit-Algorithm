package chapter04;

public class ex03 {
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stk;
	
	public enum AorB {
		StackA, StackB
	};
	
	public class EmptyIntStackX2Exception extends RuntimeException {
		public EmptyIntStackX2Exception() {
			
		}
	}
	
	public class OverflowIntStackX2Exception extends RuntimeException {
		public OverflowIntStackX2Exception() {
			
		}
	}
	
	public ex03(int capacity) {
		ptrA = 0;
		ptrB = capacity - 1;
		max = capacity;
		try {
			stk = new int[max];
		}
		catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(AorB ab, int x) throws OverflowIntStackX2Exception {
		if (ptrA >= ptrB + 1)
			throw new OverflowIntStackX2Exception();
		switch(ab) {
		case StackA:
			stk[ptrA++] = x;
			break;
		case StackB:
			stk[ptrB--] = x;
			break;
		}
		return x;
	}
	
	public int pop(AorB ab) throws EmptyIntStackX2Exception {
		int x = 0;
		switch(ab) {
		case StackA:
			if (ptrA <= 0)
				throw new EmptyIntStackX2Exception();
			x = stk[--ptrA];
			break;
		case StackB:
			if (ptrB >= max - 1)
				throw new EmptyIntStackX2Exception();
			x = stk[++ptrB];
			break;
		}
		return x;
	}
	
	public int peek(AorB ab) throws EmptyIntStackX2Exception {
		int x = 0;
		switch(ab) {
		case StackA:
			if (ptrA <= 0)
				throw new EmptyIntStackX2Exception();
			x = stk[ptrA - 1];
			break;
		case StackB:
			if (ptrB >= max - 1)
				throw new EmptyIntStackX2Exception();
			x = stk[ptrB + 1];
			break;
		}
		return x;
	}
	
	public int indexOf(AorB ab, int x) {
		switch (ab) {
		case StackA:
			for (int i = ptrA - 1; i >= 0; i--)
				if (stk[i] == x)
					return i;
			break;
		case StackB:
			for (int i = ptrB + 1; i < max; i++)
				if (stk[i] == x)
					return i;
			break;
		}
		return -1;
	}
	
	public void clear(AorB ab) {
		switch (ab) {
		case StackA:
			ptrA = 0;
			break;
		case StackB:
			ptrB = max - 1;
			break;
		}
	}
	
	public int capacity() {
		return max;
	}
	
	public int size(AorB ab) {
		switch(ab) {
		case StackA:
			return ptrA;
		case StackB:
			return max - ptrB - 1;
		}
		return 0;
	}
	
	public boolean isEmpty(AorB ab) {
		switch(ab) {
		case StackA:
			return ptrA <= 0;
		case StackB:
			return ptrB >= max - 1;
		}
		return true;
	}
	
	public boolean isFull() {
		return ptrA >= ptrB + 1;
	}
	
	public void dump(AorB ab) {
		switch(ab) {
		case StackA:
			if (ptrA <= 0)
				System.out.println("스택이 비었씁니다. ");
			else {
				for (int i = 0; i < ptrA; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		case StackB:
			if (ptrB >= max - 1)
				System.out.println("스택이 비었습니다. ");
			else {
				for (int i = max - 1; i > ptrB; i--)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		}
	}
}