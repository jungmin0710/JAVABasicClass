class Main {
  public static void main(String[] args) {
    FRUIT pear = FRUIT.APPLE;
    FRUIT pear2 = FRUIT.MANGO;
    System.out.println(pear);
    System.out.println(pear.name());
    System.out.println(pear.ordinal());//선언될 때 순서 0
    System.out.println(pear2.ordinal());//선언될 때 순서 2
    FRUIT[] fruits = FRUIT.values();
    System.out.println(fruits[0]);
  }
}

//class 대신에  enum 키워드를 사용. enum상수는 static final을 사용하지 않고 대문자로 선언한다.












//////////FRUIT.java 따로만들기

public enum FRUIT{
  APPLE, BANANA, MANGO
  //0~2 자동 초기화, 대문자로 선언한다.
}
//pear는 APPLE(0번째), pear2는 MANGO(2번째)


//상수의 묶음 클래스 enum
