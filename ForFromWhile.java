//while을 for로 바꾸기
//for (초기값;조건식;스텝){실행문}
//초기값 생략 가능, 스텝도 생략가능
class Main {

  public static void show(int n){
    int temp = n;
    for ( ; temp != 1 ; ){
      if (n % 2 == 1) {
        temp = temp*3 +1;
      }else {
        temp /= 2;
      }
      System.out.print("[" + temp + "] ");
    }
  }

  public static void main(String[] args) {
    show(122);
  }
}
