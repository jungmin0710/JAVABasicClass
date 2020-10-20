class Main {
    public static final int PHYSICAL = 23;
    //상수 선언(개발자 정의). static 메서드 선언, 객체 생성없이 그냥 사용, 호출 가능

    public double getBioRhythm(long days, int index, int max) {
      return max*Math.sin((days % index) * 2 * Math.PI/index);
    }

  public static void main(String[] args) {
    int days = 1200;

    Main bio = new Main();//객체를 생성(원래는 다른 이름이지만, repl.it에서는 메인의 이름을 못바꿔서 임의로 Main으로 작성함)
    
    //멤버 메서드 호출
    double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
    System.out.printf("나의 신체 지수는 %1$.2f 입니다.", phyval);
  }
}

//메서드 앞에 static이 붙으면 static메서드(클래스 메서드), static이 붙지 않으면 멤버 메서드
//멤버 메서드는 new 예약어를 사용해서 객체를 생성해야 한다. 
