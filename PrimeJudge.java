//소수 판별하기
//제곱근을 이용해서 소수 판별 Math

//소수는 1과 자기자신으로만 나누어 떨어지는 수
//1과 자기자신을 제외한 수로는 나누어 떨어지지 않는다.
//제곱근을 이용하는 방법(에라토스테네스의 체)
//ex) 101이 소수인지 판별하고 싶다면?
//101의 제곱근의 정수형이 10이므로, 2~10으로 101이 나누어 떨어지는 지 확인.



class Main {
  public static boolean isPrime(int n){
    boolean isS = true;
    for (int i = 2; i < (int)Math.sqrt(n); i++){
      if (n%i == 0){
        isS=false; break;
      }
    }    
    return isS;
  }

  public static void main(String[] args) {
    int number = 101;

    boolean ifPrime = isPrime(number);

    if (ifPrime){
      System.out.printf("%d는 1과 자신으로만 나눠 떨어지는 소수다",number);
      }else{
        System.out.printf("%d는 소수가 아니다",number);
    }
  }
}
