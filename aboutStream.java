/*
Stream은 순차적으로 나열된 데이터다.
stream은 저장된 데이터를 쉽고 편하게 연산할 수 있는 기능을 제공한다.

List에 저장된 정수중에서 1~100사이의 짝,홀수를 찾아서 합을 구하자
1.list에 저장한 데이터 중에서 조건에 맞는 수를 찾을 때 filter를 사용
2.합을 구할 때 reduce를 이용해서 간편하게 연산

*/

import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Integer> ilist = new ArrayList<>();

    for (int i = 1; i <=100; i++){
      ilist.add(i);//1~100까지의 리스트를 생성
    }

    //1~100까지의 전체 합
    int s1 = ilist.stream().reduce(0,Integer::sum); // ilist에 순차적으로 들어가있는 데이터를 연산

    //1~100까지의 홀수 합 =>filter를 사용하여 조건에 맞는 수만 골라낸다
    int s2 = ilist.stream().filter(i->i%2==1).reduce(0,Integer::sum);

    //1~100까지의 짝수 합
    int s3 = ilist.stream().filter(i->i%2==0).reduce(0,Integer::sum);

    System.out.println("1~100까지의 합:" + s1);
    System.out.println("1~100까지의 홀수합:" + s2);
    System.out.println("1~100까지의 짝수합:" + s3);
      
    
  }
}
