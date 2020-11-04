import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("텍스트 : "); String s1 = stdIn.next();
    System.out.print("패턴 : "); String s2 = stdIn.next();

    int idx1 = s1.indexOf(s2);//문자열 s1에서 s2를 검색

    if (idx1 == -1) System.out.println("찾는 글자가 없습니다.");
    else{
    System.out.printf("찾는 텍스트는 %d번째부터 있습니다.",idx1+1);
    }
  }
}
