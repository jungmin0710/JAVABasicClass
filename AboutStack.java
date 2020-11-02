//Main class

/*
stack and que

스택 : LIFO(Last in First Out). 나중에 들어간 데이터가 먼저 나온다.
큐 : FIFO(First in First Out). 먼저 들어간 데이터가 먼저 나온다.

푸시(push) : 데이터를 넣는 작업
팝 (pop) : 데이터를 꺼내는 작업
Top, Bottom
Java 메서드를 호출하고 실행할 때 스택을 사용함.
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    IntStack s = new IntStack(64);

    while (true) {
      System.out.println("현재 데이터 수 : "+ s.size() + " / " + s.capacity());
      System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)비움 (7)정보 (0)종료 : ");

      int menu = stdIn.nextInt();
      if (menu == 0) break;
      
      int x;
      switch (menu){
        case 1:
        System.out.print("데이터 : "); 
        x = stdIn.nextInt();
        try {
        s.push(x);
        } catch(IntStack.OverflowIntStackException e) {
          System.out.println("스택이 가득 찼습니다. ");
        }
        break;

        case 2:
        try{
        x = s.pop();
        System.out.println("팝한 데이터는 " + x + "입니다.");
        }catch (IntStack.EmptyIntStackException e) {
          System.out.println("스텍이 비어있습니다.");
        }
        break;

        case 3:
        try{
        x = s.peek();
        System.out.println("피크 데이터는 "+ x + "입니다.");
        } catch (IntStack.EmptyIntStackException e) {
          System.out.println("스텍이 비어있습니다.");
        }
        break;

        case 4:
        try{
        System.out.println("데이터를 덤프합니다.");
        } catch (IntStack.EmptyIntStackException e) {
          System.out.println("스텍이 비어있습니다.");
        }
        s.dump();
        break;

        case 5:
        System.out.print("위치를 반환할 데이터 : "); 
        x = stdIn.nextInt();
        if (s.indexOf(x) >= 0) System.out.println("데이터의 인덱스 번호는 " + s.indexOf(x) + "입니다.");
        else System.out.println("데이터가 스택 안에 없습니다.");
        break;

        case 6:
        s.clear();
        System.out.println("스택을 비웠습니다.");
        break;

        case 7:
        System.out.println("비어" + (s.isEmpty() ? "있습니다." : "있지 않습니다."));
        System.out.println("가득" + (s.isFull() ? "찼습니다." : "차지 않았습니다."));
        break;


      }

    }
  }
}


//IntStack.java


// int형 스택

public class IntStack {
	private int max;			// 스택 용량
	private int ptr;			// 스택 포인터
	private int[] stk;			// 스택 본체

	// 실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}

	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}

	// 생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];				// 스택 본체용 배열을  생성
		} catch (OutOfMemoryError e) {		// 생성할 수 없음
			max = 0;
		}
	}

	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max)									// 스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) 
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)				// 정상 쪽에서 선형 검색
			if (stk[i] == x)
				return i;								// 검색 성공
		return -1;										// 검색 실패
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
