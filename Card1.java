//Main class
/*
new로 생성한 객체는 해시코드 값이 모두 다르다.(같을 수 없다)
같은 값을 가진 카드라도 Card1 == Card2를 하게 되면 false가 나온다.(string기준) 
그래서 같은 값을 가지면 같은 객체로 만들어야 할 때 equals()오버라이딩을 한다.
예로 수학 좌표에서 P1(1,2)과 P2(1,2)는 같은 위치(1==1/2==2)다. 하지만 프로그래밍에서는 다른 객체가 된다.
같은 객체로 만들기 위해서는 오버라이딩 해야한다.
*/

class Main {
   public static void main(String[] args) {
      Card c1=new Card("H4");               // 생성자 (String 아규먼트)
      Card c2=new Card("H4");               // 생성자 (String 아규먼트)
        System.out.println(c1.hashCode());    // 값은 동일 같은 해쉬
        System.out.println(c2.hashCode());    // 값은 동일 같은 해쉬
        System.out.println(c1.getCardVal());  // 값은 동일
        System.out.println(c2.getCardVal());  // 값은 동일
        System.out.println(c1.equals(c2));    // hashCode 비교- 오버라이딩- 중요
        // 같은 값을 갖을 때 같은 객체로 정의하고 싶다면 
        // hashCode(), equals()를 오버라이딩하자.
   }
}

//Card class
public class Card {
   private String cardVal; //H8
   public String getCardVal() {
      return cardVal;
   }
   public Card() {
      int deck=(int)(Math.random()*CardUtil.SUIT.length); // 0~1
      int suit=(int)(Math.random()*CardUtil.VALU.length); // 0~9
      //임의의 카드 값을 갖는다. H6
      cardVal=CardUtil.SUIT[deck]+CardUtil.VALU[suit];
   }
   // 테스트용
   public Card(String s) {
      this.cardVal=s;  // 문자열은 값 복사
   }
   // 복사 생성자
   public Card(Card c) {
      this(c.getCardVal());  // 문자열은 값 복사
      // this.cardVal=c.getCardVal(); //동일
   }
   @Override
   public String toString() {
      return "[" + cardVal + "]";
   }
    // Eclipse-Source-Generate hashCode() and equals()를 이용하여 자동으로 만들자
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((cardVal == null) ? 0 : cardVal.hashCode());
      return result;
   }
    // 소스를 정리하면  카드값과 카드값을 일대일로 비교한다.
   @Override
   public boolean equals(Object obj) {
      Card cb=(Card)obj; 
      if(cardVal.equals(cb.getCardVal())){
         return true;
      }else{
         return false;
      }
   }
}

//CardUtil class
/*
public 공용
static 객체 생성 없이 사용
final 변수를 상수처럼 만듦(fix)
*/

public class CardUtil {
   public static final int SUTDA=2;
   public static final String[] SUIT={"H","C"};
   public static final String[] VALU={"A","2","3","4","5","6","7","8","9","T"};    
    
   public static int toVal(Card c){
       return toVal(c.getCardVal().charAt(1)); //"H6"에서 '6'
   }
   public static int toVal(Card c, int index){
       return toVal(c.getCardVal().charAt(index));
   }
   public static int toVal(char cc){
      int tot=0;
      switch (cc) {
          case 'A':tot=1;break;
          case 'T':tot=10;break;
          case 'J':tot=11;break;
          case 'Q':tot=12;break;
          case 'K':tot=13;break;
          default: tot=cc-'0';break;
      }
       return tot;
    }
}
