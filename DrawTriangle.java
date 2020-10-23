class Main {
  //왼쪽아래 직각삼각형 찍기
  public static void star1(int n){
    for (int i = 0; i < n; i++){
      for(int j = 0; j < i+1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //왼쪽위 직각삼각형 찍기
  public static void star2(int n){
    for (int i = 0; i < n; i++){
      for(int j = 0; j < n-i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 5;    
    star1(n);
    System.out.println("--------------------");
    star2(n);

  }
}
