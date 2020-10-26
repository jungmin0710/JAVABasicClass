//bill.csv파일이 같은 디렉토리에 있어야 함!


import java.io.*;

class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new FileReader("bill.csv"))){
      String msg = "";//초기화
      while ((msg = br.readLine()) != null){
        System.out.println(msg);
      }
    }catch (Exception e) {
      System.out.println(e);
    }

  }
}
