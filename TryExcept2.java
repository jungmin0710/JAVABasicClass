/*
Exception을 사용하면 발생하는 문제를 유연하게 처리할 수 있다.
1.RuntimeException은 실행 시에 발생하는 예외로 잘못된 대입, 배열, 잘못된 입력, 수학관련(0으로 나누기) 등등 프로그램이 정확하게 작동되지 않는 경우 발생한다.

catch는 여러개가 있을 수 있는데 finally는 없거나 단 하나만 있어야 한다.
*/

class Main {
  public static void main(String[] args) {

    try{
      int x = 5;
      int y = 20 / (5-x); //예외발생시키기(0으로 나누는 에러)
      System.out.println(y);
    }catch(ArithmeticException e) {
      System.out.println("예외 발생");
    }finally{
      System.out.println("언제나 수행되는 finally구문");
    }
  }
}
