/*
예외처리하기
try{}에 코드를 넣고 예외가 발생하면 catch{}해서 해당 예외를 처리
try {
    수행문
    }catch(예외상황1){
    수행문
    }catch(예외상황2){
    수행문
    }finally{ 
    수행문
    }
예외처리를 할 때는 예외를 안전하게 끝내는 것이 목적이므로 catch를 되도록이면 간단하게 작성하는 것이 좋다.
finally는 예외가 발생하거나, 발생하지 않아도 반드시 실행된다.(catch는 해당 예외가 나타날 때만 실행된다.))
*/

class Main {
  public static void main(String[] args) {
    String sNum = "123";
    String nNum = "h";

    try {
      int a = Integer.parseInt(nNum);
      //Integer.parseInt는 정수 타입 문자열을 정수로 변환할 때 사용한다. 
      //잘못된 타입을 변환하려고 하면 NumberFormatException 예외가 발생한다.
      System.out.println(a);
    }catch( NumberFormatException ee){
      System.out.println("int인지 확인해봐!");
      System.out.println(ee.getMessage());
    }catch(Exception ee){
      System.out.println("잘 넣어봐!");
    }finally{
      System.out.println("난 수행되어야만 해!");
    }
  }
}
