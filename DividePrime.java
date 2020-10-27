//약수와 소인수분해

class Main {
  public static void divide(int n){
    if (n==1){
      System.out.println(n+"의 약수는 [1]이다.");
    }else{
      System.out.print(n + "의 약수는 [1");
      for (int i = 2; i < n+1; i++){
        if (n % i == 0){
          System.out.printf(", %d",i);
        }
      }
      System.out.println("]이다.");
    }
  }

  public static void prime(int n){    
    System.out.print(n + "을 소인수 분해하면 [");
    int a = 2;
    while (n != 1){ 
      if (n%a == 0){
        if (n/a == 1){
          System.out.print(a);
        }else{
          System.out.print(a + " * ");
        }
        n /= a;
      }else{
        a++;
      }
    }
    System.out.println("]이다.");
  }



  public static void main(String[] args) {
    divide(6);
    prime(6);
    divide(100);
    prime(100);
  }
}
