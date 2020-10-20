public class Main {
  public static int toNum(char c) {
    int tot = 0;
    switch(c) {
      case 'A' : tot=1;break;
      case 'T' : tot=10;break;
      case 'J' : tot=11;break;
      case 'Q' : tot=12;break;
      case 'K' : tot=13;break;
      default : tot=c-'0'; break; // 문자에 '0'을 빼면 숫자처럼 인식이 되게함.
    }
    return tot;
  }

  public static void main(String[] args) {
    char c = 'J';
    int result = toNum(c);
    System.out.printf("%c=>%d\n",c,result);
  }
}
//switch에서 case뒤에 break가 없다면 다음 case의 break를 만날 때 까지 다음 case문이 실행된다. 이를 fall through라고 한다.
//해당 문자가 없을 경우에는 해당 문자의 아스키값이 나온다.
