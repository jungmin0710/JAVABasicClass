class Main {
    public static final int PHYSICAL = 23;
    //상수 선언(개발자 정의). static 메서드 선언, 객체 생성없이 그냥 사용, 호출 가능

    public static double getBioRhythm(long days, int index, int max) {
      return max*Math.sin((days % index) * 2 * Math.PI/index);
    }

  public static void main(String[] args) {
    int days = 1200;
    //메서드 호출
    double phyval = getBioRhythm(days, PHYSICAL, 100);
    System.out.printf("나의 신체 지수는 %1$.2f 입니다.", phyval);
  }
}
