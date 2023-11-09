import java.text.DecimalFormat;

public class Strecke {
  private Punkt p1;
  private Punkt p2;
  public Strecke(Punkt p1, Punkt p2){
    this.p1 = p1;
    this.p2 = p2;
  }
  public double length(){
    return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
  }
  @Override
  public String toString() {
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    String formattedLength = decimalFormat.format(length());
    return "Strecke [p1=Punkt [x="+p1.getX()+", y="+p1.getY() +"], p2=Punkt [x="+p2.getX()+", y="+p1.getY() +"], Länge: " + formattedLength;
  }
}
