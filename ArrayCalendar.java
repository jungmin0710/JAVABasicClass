/*
날과 관련된 날짜 문자를 저장하려면 문자열 배열을 사용한다. 
모든 동적 배열은 다시 초기화가 가능하고 정적 배열은 다시 초기화가 불가능하다.
*/

class Main {
  public static void print(String[] tos){
    for (String ss:tos){
      System.out.printf(ss + "\t");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    //동적
    String[] myNum = new String[]{"2016-08-17","2016-09-17","2016-03-17"};
    //정적
    String[] myNum2 = {"2016-08-17","2016-09-17","2016-03-17"};

    System.out.println(myNum2[0]);

    print(myNum);

    myNum = new String[]{"2016-08-17","2016-09-17","2016-03-17","2016-04-17"};

    print(myNum);

  }
}
