/*
1.new int[4][3] 4*3으로 12개의 저장공간을 확보한다.
2.new int[3][] 3행에 대한 열의 개수가 정해지지 않았다.
2번과 같은 형태의 배열을 지그재그 배열이라고 한다.
1번은 처음 12개로 숫자가 고정이 되어 결정이 되지만,
2번과 같은 지그재그 배열은 필요에 따라 결정할 수 있다.
*/
class Main {
  public static void println(int[][] p){
    for (int i = 0; i < p.length; i++){
      for (int j = 0; j <p[i].length; j++){
        System.out.print(p[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    //1번
    int[][] a = new int[4][3];//2차원 배열 생성 4*3
    a[0][0] = 1;
    a[0][2] = 2;
    println(a);
  
    System.out.println("-----------------");

    //2번
    int[][] b = new int[3][];
    b[0] = new int[4];
    b[1] = new int[5];
    b[2] = new int[6];
    println(b);

    System.out.println("-----------------");

    //3번(동적으로 바로)
    int[][] c = new int[][]{{1,2,3,4,5},{2,3,4,5,6},{3,6,7,8,9,0}};
    println(c);

    System.out.println("-----------------");

    //4번(정적으로 바로)
    int[][] d = {{1,2,3,4,5},{2,3,4,5,6},{3,6,7,8,9,0}};
    println(d);

    System.out.println("-----------------");

    //5번(다른 배열의 너비와 높이를 가져다 만들기)
    int[][] e = new int[c.length][c[0].length];
    for (int i = 0; i < c.length; i++){
      System.arraycopy(c[i],0,e[i],0,e[i].length);
    }
    //배열의 배열이므로 1차원 배열을 복사하는 System.arraycopy()를 이용해서 복사한다.
    println(e);
  }
}
