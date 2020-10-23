/*
stringbuffer는 string과 비슷하지만 다른 특징을 가진다.
string은 새로운 문자열을 얻으면 새로운 주소를 받는다. (원본을 바꾸는 것이 아니다)
stringbuffer의 주소는 동일하다.

stringbuffer에 저장하는 내용이 변경되어도 처음 주소가 변경되지 않는다.(원본을 계속 바꾸는 것이다)

*/
import java.util.*;

class Main {
  public static void main(String[] args) {

    // StringBuffer sb1 = new StringBuffer();
    // sb1.append("안녕하세요.").append(" 또 만나요. ").append("안녕!");
    // System.out.println( sb1.toString() + sb1.hashCode() );

    // sb1.replace(0,2,"나보기가 역겨워");
    // System.out.println( sb1.toString() + sb1.hashCode() );

    // sb1.reverse();
    // System.out.println( sb1.toString() + sb1.hashCode() );

/*
string은 문자열의 내용이 조금이라도 바뀌거나 + 또는 concat을 사용하면 새로운 객체를 만든다. 
레퍼런스를 잃어버린 객체는 가비지 컬렉션의 대상이 되고 새로운 객체에게 새 주소를 주므로 위치값도 변한다.
그러나 stringbuffer은 원래 있던 객체의 내용만 바뀌어(주소는 변하지 않고) 뮤터블한 특성이 있어서 stringbuffer의 사용을 권장한다.
*/


    StringBuilder sbu = new StringBuilder();
    sbu.append("I")
    .append(" go")
    .append(" to school.");
    System.out.println(sbu);

    sbu.replace(7,11,"");
    System.out.println(sbu);

    sbu.reverse();
    System.out.println(sbu);

    sbu.deleteCharAt(3);
    System.out.println(sbu);

    sbu.delete(1,1);
    System.out.println(sbu);

    String ss = sbu.substring(0);
    System.out.println(ss);
    System.out.println(sbu);

    String st = sbu.substring(0,4);
    System.out.println(st);
    System.out.println(sbu);
  }
}
