//홀수들의 합
//1부터 100까지의 홀수들 합/ 짝수들 합
//for문을 사용해서 1부터 100까지 증가

class Main {
  public static void main(String[] args) {
    int s1 = 0;
    int s2 = 0;

    for (int i = 1; i <= 100; i++){
      if (i % 2 == 1){
        s1 += i;
      }else {
        s2 += i;
      }
    }

    System.out.printf("1부터 100까지 홀수들의 합은 %d입니다.\n",s1);
    System.out.printf("1부터 100까지 짝수들의 합은 %d입니다.",s2);


  }
}
