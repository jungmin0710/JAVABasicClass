class Main {
  public static void main(String[] args) {
    int temp = 99;
    if(temp%2==1){ //홀수면
      temp=temp*3+1; //3배한 값에 1 더하기
    }else{ //짝수면
      temp=temp/2; //몫을 구하기
    }
    System.out.printf("계산 후 = %d\n", temp);
  }
}
//if절은 연산 결과의 true,false에 따라 다른 구문이 실행된다.
