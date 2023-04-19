import java.util.*;
import java.util.ArrayList;

public class TestScan {
  public static void main(String...args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> members = new ArrayList<>();
    int num = scan.nextInt();
    String text;
    for(int i = 0; i < num; i++) {
      text = scan.next();
      members.add(text);
    }
    System.out.println(members);
    members.forEach(member -> System.out.println(member));
    // String text = scan.next();
    // System.out.println(members);
  }
}