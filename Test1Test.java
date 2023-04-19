import java.util.ArrayList;

public class Test1Test {
  public static void main(String...args) {
    ArrayList<String> users = new ArrayList<>();

    users.add("kirishima");
    users.add("rokumura");
    users.add("midorikawa");

    users.forEach(user -> System.out.println(user));
  }
}