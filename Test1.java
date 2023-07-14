// import java.util.ArrayList;

// public class Test1 {
//   public static void main(String...args) {
//     ArrayList<String> fruits = new ArrayList<>();

//     fruits.add("apple");
//     fruits.add("orange");
//     fruits.add("lemon");

//     fruits.forEach(fruit -> System.out.println(fruit));
//   }
// }

import java.util.*;
import java.util.ArrayList;

public class Test1 {
  public static void main(String...args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    int num = scan.nextInt();
    String name;
    for(int i = 0; i < num; i++) {
      name = scan.next();
      names.add(name);
    }
    names.forEach(n -> {
      String nUpper = n.toUpperCase();
      System.out.println(nUpper);
    });
  }
}

// コメント