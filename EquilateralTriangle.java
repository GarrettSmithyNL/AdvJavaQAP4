public class EquilateralTriangle extends Triangle {
  public EquilateralTriangle(String name, double side) {
    super(name, side, side, side);
  }

  public void setSide(double side) {
    super.setSide1(side);
    super.setSide2(side);
    super.setSide3(side);
  }

  public double getSide() {
    return super.getSide1();
  }

  public String toString() {
    return "EquilateralTriangle [name=" + this.getName() + ", side=" + this.getSide1() + "]";
  }
}
