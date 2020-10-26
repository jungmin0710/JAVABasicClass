//빌보드 hot100 html자료 읽어오기(원문 전부임)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

class Main {
  public static void main(String[] args) {
    String urls = "https://www.billboard.com/charts/hot-100";
    URL url = null;
    try {
      url = new URL(urls); //주소 읽어오기
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      String line = null;
      while ((line = reader.readLine()) != null){
        if (!line.trim().equals("")){
          System.out.println(line.trim());
        }
      }
    } catch (Exception e){
      System.out.println("Whoops!");
    }
  }
}
