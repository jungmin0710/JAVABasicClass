public class Main {
  //조건에 따라 신체, 감정, 지성 값을 출력
  public static String textInfor(int index, double value) {
    String result = "";
    switch( index ) {
      case 23 : result = "신체지수: ";break;
      case 28 : result = "감정지수: ";break;
      case 33 : result = "지성지수: ";break;
    }
    return result + (value*100);
  }

  public static void main(String[] args) {
    int index = 23;//신체지수
    double value = 0.86;
    String st= textInfor(index, value);//메서드 호출
    System.out.println(st);
  }
}

//입력된 정수가 23이면 신체지수를 result에 대입하고 break를 만나면서 switch문을 끝낸다.
//case에서 분기한 결과 문자열에 각 지수값을 붙여서 문자열을 반환한다.
//"hello" + 1 + 2 => hello12  // 1 + 2 + "hello" => 3hello
