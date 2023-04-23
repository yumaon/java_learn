
public class FightMonster {
  public static void main(String...args) {
    int hp = 30;
    int hit;
    int totalHit = 0;
    while (hp > 0) {
      hit = (int)(Math.random() * 10 + 1);
      System.out.println("モンスターに、" + hit + "のダメージを与えた！");
      totalHit += hit;
      hp -= hit;
    }
    System.out.println("ゆうしゃめんまは合計" + totalHit + "のダメージを与えた");
    System.out.println("モンスターを倒した！");
  }
}