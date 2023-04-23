import java.util.*;

public class LoopTest {
  public static void main(String...args) {
    int i = 0;
    while (i <= 10) {
      System.out.println("hello" + i);
      if (i % 2 == 0) {
        System.out.println(i);
      }
      i += 1;
    }
  }
}
