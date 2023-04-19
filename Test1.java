import java.util.ArrayList;

public class Test1 {
  public static void main(String...args) {
    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("apple");
    fruits.add("orange");
    fruits.add("lemon");

    fruits.forEach(fruit -> System.out.println(fruit));
  }
}