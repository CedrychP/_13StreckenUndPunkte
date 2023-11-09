public class Punkt {
  private Integer x;
  private Integer y;
  public Punkt(Integer x, Integer y){
    this.x = x;
    this.y = y;
  }

  public Integer getY() {
    return y;
  }

  public Integer getX() {
    return x;
  }
  @Override
  public String toString() {
    return "Punkt [x=" + x + ", y=" +y + "]";
  }
}
