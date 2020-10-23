/*
Math클래스는 수학 연산에 관련된 메서드를 제공한다.
위치는 java.lang.*안에 있다.
모든 메서드는 static메서드이기 때문에 객체 생성 없이 사용한다.
*/

class Main {
  public static void main(String[] args) {
    System.out.println("1 : 자연로그 E => " + Math.E);
    System.out.println("2 : 원주율 PI => " + Math.PI);
    System.out.println("3 : -5의 절댓값 abs => " + Math.abs(-5));
    System.out.println("4 : 4.3올림 => " + Math.ceil(4.3));
    System.out.println("5 : 4.5반올림 => " + Math.round(4.5));
    System.out.println("6 : 4.5버림 => " + Math.floor(4.5));
    System.out.println("7 : 3,4중 최댓값 => " + Math.max(3,4));
    System.out.println("8 : 3,4중 최솟값 => " + Math.min(3,4));
    System.out.println("9 : 2의2승 => " + Math.pow(2,2));
    System.out.println("10 : 로그30 => " + Math.log(30));
    System.out.println("11 : 100의 제곱근 => " + Math.sqrt(100));
    System.out.println("12 : 무작위 난수 => " + Math.random());
  }
}
