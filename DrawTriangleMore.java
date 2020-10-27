class Main {
  //1.왼쪽아래 직각삼각형 찍기
  public static void star1(int n){
    for (int i = 0; i < n; i++){
      for(int j = 0; j < i+1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //2.왼쪽위 직각삼각형 찍기
  public static void star2(int n){
    for (int i = 0; i < n; i++){
      for(int j = 0; j < n-i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //3.역삼각형
    public static void star3(int n){
    for (int i = 0; i < n; i++){
      for (int j = 0; j < i; j++){
        System.out.print(" ");
      }
      for (int k = 1; k < (2*n)-(2*i);k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //4.정삼각형
    public static void star4(int n){
    for (int i = 0; i < n; i++){
      for (int j = n-i; j > 0; j--){
        System.out.print(" ");
      }
      for (int k = 0; k < (2*i)+1;k++){
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
    System.out.println("--------------------");
    star3(n);
    System.out.println("--------------------");
    star4(n);

  }
}
