/*
리스트에서 저장된 데이터에 조건에 맞는 수를 찾을 때는 filter를 이용한다.
filter로 찾은 수에 '무엇인가를 해라'(여기서는 제곱을 모두 적용)

collect는 해당 수의 값을 새로운 리스트로 생성
*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    List<Integer> ilist = new ArrayList<>();

    for(int i = 1; i <= 10; i++){
      ilist.add(i);
    }

    //stream filter map 사용하기 
    ilist = ilist.stream()
                 .filter(i->i%2==1)
                 .map(i->i*i)
                 .collect(Collectors.toList());//새로운 리스트로 생성

    ilist.forEach(i->{System.out.printf(i+"\t");});
    System.out.println();
    
    int s = ilist.stream().reduce(0,Integer::sum);
    System.out.println("1부터 10까지 홀수의 제곱의 합 : " + s);
  }
}
