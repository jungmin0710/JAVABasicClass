//100이하의 자연수를 입력받아 그 숫자의 크기만큼 2차원 배열로 만들고 아래와 같이 출력하시오

/*
입력 : 5

1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25

*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n;
    do{
      n = stdIn.nextInt();
      if (n > 100) System.out.println("다시 입력해주세요.");
    }while (n > 100);

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        arr[i][j] = (i+1)*(j+1);
        System.out.printf("%3d",arr[i][j]);// 따옴표 안의 숫자는 배열의 값 길이가 길어질 때 조정할 것(라인맞추기)
      }
      System.out.println();
    }
  }
}
