import java.util.*;
import java.util.stream.*;

public class Stream {
  public static void main(String...args) {
    Scanner scan = new Scanner(System.in);
    String[] text = scan.nextLine().split(" ");
    Arrays.stream(text).forEach(t -> System.out.println(t));
  }
}