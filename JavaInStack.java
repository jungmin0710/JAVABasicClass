import java.util.Stack;//라이브러리로 바로 구현가능

class Main {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    
    stack.push(1);
    stack.push(2);
  
    System.out.println(stack.pop());

    stack.peek();
    System.out.println(stack.peek());

    stack.push(3);
    stack.push(4);
    System.out.println(stack.search(3));//순번은 1부터 검색된다



  }
}
