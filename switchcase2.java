public class Main {
  public static double toMoney(String c) {
    double tot = 0.0;
    switch(c) {
      case "USD" : tot=1126.5;break;
      case "JPY" : tot=110.6;break;
      case "CNY" : tot=10.5;break;
      default : tot=1;break;
    }
    return tot;
  }

  public static void main(String[] args) {
    String money = "USD";
    double result = toMoney(money);
    System.out.printf("%s => %.1f\n",money,result);
  }
}
//switch는 int char String enum short byte값에 따라 case문이 실행된다. 여기서는 string에 따라 해당 case로 분기한다.
