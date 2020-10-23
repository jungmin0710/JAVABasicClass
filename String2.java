class Main {
  public static void main(String[] args) {
    String text = " Hello JAVA ";
    String com = " Hello java ";

    System.out.println(text.charAt(2));//글자에서 n번째
    System.out.println(text.concat("s"));//문자열에 덧붙인다(연결한다. "+"를 의미)
    System.out.println(text.contains("s"));//포함하고 있는지 판별한다(True/False)
    System.out.println(text.equals(com));//같은지 비교(True/False)
    System.out.println(text.equalsIgnoreCase(com));//대소문자를 무시하고 비교(True/False)
    System.out.println(text.indexOf("A"));//처음 등장하는 A의 인덱스를 반환
    System.out.println(text.indexOf("a"));//찾는 글자가 없으면 -1을 반환
    System.out.println(text.lastIndexOf("A"));//마지막 등장하는 A의 인덱스를 반환
    System.out.println(text.length());//글자의 갯수를 반환(공백도 글자수에 포함한다)
    System.out.println(text.trim());// 공백 여백 제거(양쪽 끝만. 중간은 건들지 않는다.)
    String temp = text.trim();
    System.out.println(temp.length());
    System.out.println(text.substring(7));//특정 인덱스부터 문자열을 잘라서 보여준다
    System.out.println(text.substring(7,9));
    System.out.println(text.replace(" ","-"));//특정 문자를 다른 문자로 바꾼다
    System.out.println(text.toUpperCase());//모두 대문자로 바꾼다
    System.out.println(text.toLowerCase());//모두 소문자로 바꾼다

    String[] sp = text.split(" ");//띄어쓰기 기준으로 자른다
    for (String s: sp){
      System.out.print(s);
    }
    System.out.println(sp);//배열의 주소값이 나옴
  }
}
