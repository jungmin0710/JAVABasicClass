/*

for : 증가 값이 명확할 때
while : 증가 값이 명확하지 않을 때(끝나는 조건이 명확할 때)

입력받은 temp가 1이 될 때까지 while구문을 반복
temp 홀수면 3배값에 1을 더하고 짝수면 2로 나눈다

*/
class Main {

  public static void show(int n){
    int temp = n;
    while (temp != 1) {
      if (n % 2 == 1) {
        temp = temp*3 +1;
      }else {
        temp /= 2;
      }
      System.out.print("[" + temp + "] ");
    }
  }

  public static void main(String[] args) {
    show(122);
  }
}
