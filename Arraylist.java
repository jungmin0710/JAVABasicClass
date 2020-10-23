/*

Arraylist
add(value) : arrayList의 끝에 값을 추가
add(index, value) : 특정위치에 index 삽입
clear() : 리스트 초기화
indexOf(value) : 특정 값의 인덱스를 반환
get(index) : 특정 위치에 있는 값을 반환
remove(index) : 특정 위치 값을 삭제=>삭제를 하게되면 하나씩 앞으로 밀린다
set(index,value) : 특정 위치 값을 value값으로 변경
size() : 리스트의 갯수를 반환한다
toString() : 리스트 전체의 목록 반환

*/
import java.util.*;

class Main {
  public static void main(String[] args) {
    List<String> Testlist = new ArrayList<>();

    Testlist.add("one");
    Testlist.add("two");
    Testlist.add("three");//리스트의 끝에 추가
    Testlist.add(0,"BigData");//0번에 삽입
    Testlist.add(3,"Test");//3번에 삽입

    System.out.println(Testlist.get(0));
    System.out.println(Testlist.indexOf("one"));
    
    Testlist.set(0,"new");
    System.out.println(Testlist.get(0));
    System.out.println(Testlist.size());    
    System.out.println(Testlist.toString());

   for (String i:Testlist){
    System.out.println(i);
    }
  }
}
