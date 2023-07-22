import java.util.*;

public class ScannerLesson2 {
  public static void main(String...args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    String data;
    for(int i = 0; i < count; i++) {
      data = sc.next();
      System.out.println(data + " と入力されました。");
    }
  }
}