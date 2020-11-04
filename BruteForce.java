/*
글자만 뽑아오기(brouteforcd)
문자열 검색을 위해 쓰임.
string에서 in을 찾아라

ex)ABABCDEFCHA
합계를 구한다.
1.텍스트의 첫문자 'A'부터 시작하는 3개의 문자와 'ABC가 일치하는지' 검사
2.ABA BAB ABC
단순법, 소박법 이라고도 한다.

*/

import java.util.Scanner;

class Main {

  static int bfMatch(String txt, String pat){
    int pt = 0; //txt에서 위치
    int pp = 0; //찾을 글자의 위치

    while (pt != txt.length() && pp != pat.length()){
      if (txt.charAt(pt) == pat.charAt(pp)){
      pt++;
      pp++;
      }else {
        pt = pt-pp+1;
        pp = 0;
      }
    }
    if (pp == pat.length())//검색 성공
      return pt - pp; 
    return -1;
    

  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("텍스트 : ");
    String s1 = stdIn.next();
    System.out.print("찾을 글자 : ");
    String s2 = stdIn.next();

    int idx = bfMatch(s1, s2);
    
    if (idx == -1) System.out.println("텍스트에 찾는 글자가 없습니다.");
    else {
      //일치하는 문자 바로 앞까지의 길이를 구하자
      int len = 0;
      for (int i = 0; i < idx; i++) 
        len += s1.substring(i,i+1).getBytes().length;
      len += s2.length();

      System.out.println((idx+1) + "번째 문자부터 일치합니다.");
      System.out.println("텍스트  : " + s1);
      System.out.printf(String.format("일치하는 글자는 %s번째 까지\n",len) + s2);
    }//bfMatch매서드는 텍스트에서 찾을 글자를 검색해서 텍스트의 위치(인덱스)만 반환한다. 만약 없으면 -1을 반환한다.
  }
}
