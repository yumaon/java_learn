public class Slime {
  public static void main(String...args) {
    int hp = 30;
    int hit;
    while(hp > 0) {
      hit = (int)(Math.random() * 10 + 1);
      System.out.println("スライムに" + hit + "ダメージ");
      hp -= hit;
    }
    System.out.println("スライムを倒した");
  }
}