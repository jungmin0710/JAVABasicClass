//자바에서 list는 배열과 같은 역할을 한다(배열은 []형태생성, list는 Array형식인듯)
//차이점 : 더 편리하고 강력한 기능을 제공한다.
//배열은 저장하는 데이터의 수가 제한이 되어 정해진 갯수 만큼 입력되면 더이상 저장할 수 없다.
//list는 저장 공간을 스스로 확보하면서 데이터를 저장한다. 
//list에 입력할 때는 add, 가져올 때는 get을 쓴다.
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    //list에 넣기
    for (int i = 1; i <= 10; i++){
      list.add(i);
    }

    //가져오기
    for (int i = 0; i < list.size(); i++){
      int m = list.get(i);
      System.out.printf("%d\t",m);
    }
  }
}
