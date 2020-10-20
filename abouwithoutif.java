public class Main {
  public static void main(String[] args) {
    int temp = 99;
    temp = (temp%2==1) ? temp*3+1 : temp/2;
    System.out.printf("계산 후 = %d\n",temp);
  }
}

//if를 간단하게 삼항연산자로 변경할 수 있다.
// D = A? B : C ==>> A가 true면 D = B, false면 D = A
//이를 condition operator라고 함(삼항연산자)
