/*
같은 문자열인지 비교할 때는 .equals()를 사용한다.(==와 비교)
new 키워드로 생성하지 않은 문자열에 대해 같은 문자열이면 .equals()와 == 모두 true다.
new 키워드로 생성한 문자열에 대해 같은 문자열이면 .equals()는 true이지만 레퍼런스(주소를 가리키는 것)는 다르므로 ==는 false다.
문자열을 비교할 때는 .equals()를 권장한다.
*/

class Main {
  public static void main(String[] args) {
    String city1 = "Asia";
    String city2 = "Europe";
    String city3 = new String("Asia");
    String city7 = "Asia";

    System.out.println(city1);
    System.out.println(city1.length());
    System.out.println(city1==city2);//레퍼런스를 비교한다. false
    System.out.println(city1.equals(city2)); //false
    System.out.println(city1==city3); //false
    System.out.println(city1==city7); //true
    System.out.println(city1.equals(city3)); //true
    System.out.println(city1.equals(city7)); //true
  }
}
