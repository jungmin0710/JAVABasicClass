//배열보다 편리하고 강력한 list에 정수를 저장하고 저장한 정수들 중에서 홀수만 찾아서 제곱의 합을 구해보자
//List<> : <>에는 변수선언시 int말고 Integer를 사용해야 한다.(중요)

//정수를 ilist로 저장한다 <Integer>를 이용해서 정수로 저장. 
//list에 저장할 수가 int타입이기 때문에 클래스 Integer를 사용해서 list<Integer>로 선언하고 생성한다.
import java.util.ArrayList;
import java.util.List;


class Main {
  public static void main(String[] args) {
    List<Integer> ilist = new ArrayList<>();

    int s = 0;

    for (int i = 1; i <= 10; i++){
      ilist.add(i);
    }

    for (int m:ilist) { //list에 저장된 정수 하나씩 가져오는 방법 사용
      if (m % 2 == 1) {//홀수인지 판별하기
        s = s+ (m*m);
      }
    }
    System.out.printf("1부터 10까지 홀수의 제곱합은 %d입니다.",s);
  }
}
