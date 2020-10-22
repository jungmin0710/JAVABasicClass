/*
Object의 getClass()메서드는 Class를 반환한다. 
Class는 해당 클래스의 선언된 메서드와 생성자들을 반환하는 메서드를 제공한다.
Class는 모든 객체에 대한 객체 자신의 정보(전체)를 제공한다.
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Main {
  public static void main(String[] args) {
    Object obj1 = new Object();//obj1이라는 객체를 Object라는 클래스로 찍어냈다.
    Class classes = obj1.getClass();

    System.out.println(classes.getName());
  }
}
