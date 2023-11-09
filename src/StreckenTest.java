public class StreckenTest {
  public static void main(String[] args) {

    for (Strecke strecke: strecken) {
      System.out.println(strecke.toString());
    }
    System.out.println("Die 2te Strecke ist am Längsten!");
  }
  public static Strecke strecken[] = {
      new Strecke(new Punkt(3, 5), new Punkt(7, 6)),
      new Strecke(new Punkt(3, 6), new Punkt(8, 7)),
      new Strecke(new Punkt(4, 7), new Punkt(9, 7)),
      new Strecke(new Punkt(10, 11), new Punkt(12, 13))
  };
}