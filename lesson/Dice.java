public class Dice {
  public static void main(String...args) {
    double rand = Math.random() * 6 + 1;
    int number = (int)rand;
    System.out.println(number);
  }
}