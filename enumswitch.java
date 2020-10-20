//main.java

public class Main {
  //메서드 선언
  public static String textInfor(PEI index, double value) {
    String result = "";
    switch( index ) {
      case PHYSICAL : result = "신체지수: ";break;
      case ENOTIONAL : result = "감정지수: ";break;
      case INTELLECTUAL : result = "지성지수: ";break;
      default : result = "미결정: "; break;
    }
    return result + (value*100);
  }

  public static void main(String[] args) {
    PEI index = PEI.PHYSICAL;
    double value = 0.86;
    String st= textInfor(index, value);
    System.out.println(st);
    System.out.println(index.ordinal());//ordinal => enum안의 index개념
    System.out.println(index.name());
    System.out.println(index);
    System.out.println(index.getPei());
  }
}



//PEI.java

public enum PEI{
  PHYSICAL(23), ENOTIONAL(28), INTELLECTUAL(33);

  private final int peiValue;
  PEI(int x){
    this.peiValue=x;
  }
  public int getPei(){
    return peiValue;
  }
}
