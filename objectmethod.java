/*
자바에서 최상위 클래스도 object이다. (다 객체다)
object들은 jvm이 메모리를 관리한다.(c,c++과의 차이점 : 개발자가 메모리 관리를 할 필요가 없다. 자동)

클래스로 인스턴스를 생성, 인스턴스를 두개 생성하면 클래스 한개/객체 두개 => 즉 각 객체들에 대한 고유의 주소와 코드가 생성된다.(각각 존재하게 된다.)

*/

class Main {
  public static void main(String[] args) {
    Object obj1 = new Object();
    Object obj2 = new Object();
    
    System.out.println(obj1 == obj2);
    //결과 : false => 각 객체들은 고유하다.(다르다)

    
  }
}
