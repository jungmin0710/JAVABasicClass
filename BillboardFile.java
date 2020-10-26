////Main Class

/*
billboard 파일로 저장하기
파일로 저장할 때는 
1. try catch구문을 사용한다
2. 파일을 쓴 후에 파일은 닫아준다(close())
3. 이미 생성된 파일에만 쓸 수 있다. 생성해서 바로 기록한다.
*/
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Billbaord> bills = new ArrayList<Billbaord>();

    Billbaord b1 = new Billbaord(1,"Despacito", 1, "http://www.billboard.com/image/q8746644125.jpg", "Luis fonsi");
    Billbaord b2 = new Billbaord(2,"I love you", 2, "http://www.billboard.com/image/q871384125.jpg", "Bruno Mars");
    Billbaord b3 = new Billbaord(3,"Holy, Moly", 3, "http://www.billboard.com/image/q123456789.jpg", "BTS");

    ArrayList<Billbaord> bblist = new ArrayList<Billbaord>();

    bblist.add(b1);
    bblist.add(b2);
    bblist.add(b3);

    //생성하자마자 집어넣는 방법 사용
     try (PrintWriter pw = new PrintWriter(new FileWriter("bill.csv"))){
      for (Billbaord bb : bblist){
        pw.println(bb);
      }
      pw.close();    
    }catch (IOException e) {
      System.out.println(e);
    }
  }
}

////Billboard Class(따로)

import java.io.Serializable;//인터페이스 상속(인터페이스 => 설계도개념)
//Serializable => 직렬화 인터페이스

public class Billbaord implements Serializable {
  private int rank; // 순위
  private String song; // 노래 제목
  private int lastweek; // 지난주 등수
  private String imagesrc; // 사진 정보
  private String artistsrc; // 가수 사진
  private String artist; // 가수이름

  //생성자
  //빈것
  public Billbaord() {}

  //6개 인수일 때는 이곳으로
  public Billbaord(int rank, String song, int lastweek, String imagesrc, String artistsrc, String artist){
    super();
    this.rank = rank;
    this.song = song;
    this.lastweek = lastweek;
    this.imagesrc = imagesrc;
    this.artistsrc = artistsrc;
    this.artist = artist;
  }

  //5개 인수일 때는 이곳으로
  public Billbaord(int rank, String song, int lastweek, String imagesrc, String artist){
    super();
    this.rank = rank;
    this.song = song;
    this.lastweek = lastweek;
    this.imagesrc = imagesrc;
    this.artist = artist;
  }

  @Override //단순한 표시(but 컴퓨터도 인식하는 주석 : 어노테이션)
  public String toString() {
    return "[rank = " + rank + ", song = " + song + ", lastweek = " + lastweek + ", imagesrc = " + imagesrc + ", artist = " + artist + "]";
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public String getSong() {
    return song;
  }

  public void setSong(String song) {
    this.song = song;
  }

  public int getLastweek() {
    return lastweek;
  }

  public void setLastweek(int lastweek) {
    this.lastweek = lastweek;
  }

  public String getImagesrc() {
    return imagesrc;
  }

  public void setImagesrc(String imagesrc) {
    this.imagesrc = imagesrc;
  }

  public String getArtistsrc() {
    return artistsrc;
  }

  public void setArtistsrc(String artistsrc) {
    this.artistsrc = artistsrc;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

}
