/*
배열은 같은 타입의 나열이다. 
배열은 new로 생성하는 동적 배열이 있고 new 없이 사용하는 정적 배열이 있다.
사용 방법은 동일하나 선언 방법이 다르다. 
동적 배열은 필요할 때마다 다시 초기화 할 수 있다. 
정적 배열은 초기화 할 수 없다.
*/

import java.util.Arrays;

class Main {
  public static void print(int[] a){
    for (int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] a; //배열 선언
    a = new int[5];//5개짜리 배열로 초기화
    a[0] = 2;
    a[1] = 5;
    a[2] = 3;
    a[3] = 9;
    a[4] = 8;

    int[] b = new int[]{2,5,3,9,8};
    //동적 배열
    int[] c = {2,5,3,9,8};
    //정적 배열. 다시 대입이 불가(초기화X)
    int[] d = new int[5];
    Arrays.fill(d,-1);
    //int 타입 5개 배열 생성 후 -1로 채우기

    System.arraycopy(c,0,d,0,c.length);
    Arrays.sort(d);//오름차순 정렬
    
    print(d);

    d = new int[]{1,2,3,4,5,6};//동적 배열은 다시 초기화가 가능하다

    print(d);

  }
}
