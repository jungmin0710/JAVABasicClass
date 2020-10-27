/*
for에 for문에서는(2중첩) 바깥 for문의 스텝이 연결될 때마다 안쪽 for문이 실행된다.
바깥 for문 n줄에 대해서 내부 for문을 실행한다. i가 0일때 안쪽 for문의 j < 0가 되므로 공백이 없다.
*/

//방법 1: 쉽게 그리는 방법
class Main {
  //마름모 그리기
  public static void Rhombus1(int n){
    //상단: 정삼각형
    for (int i = 0; i < n; i++){
      for (int j = n-i-1; j > 0; j--){
        System.out.print(" ");
      }
      for (int k = 0; k < (2*i)+1;k++){
        System.out.print("*");
      }
      System.out.println();
    }
    //하단: 정삼각형보다 줄수가 1 적은 역삼각형
    for (int i = 1; i < n; i++){
      for (int j = 0; j < i; j++){
        System.out.print(" ");
      }
      for (int k = 1; k < (2*n)-(2*i);k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }


  //메인메서드
  public static void main(String[] args) {
    Rhombus1(10);//층 수
  }
}
