package ProblemOneTwo;

/**
 * The EquilateralTriangle class represents an equilateral triangle, which is a type of triangle
 * where all three sides are equal in length.
 */
public class EquilateralTriangle extends Triangle {
  /**
   * Constructs a new EquilateralTriangle object with the specified name and side length.
   *
   * @param name the name of the equilateral triangle
   * @param side the length of each side of the equilateral triangle
   */
  public EquilateralTriangle(String name, double side) {
    super(name, side, side, side);
  }

  /**
   * Sets the length of each side of the equilateral triangle.
   *
   * @param side the length of each side of the equilateral triangle
   */
  public void setSide(double side) {
    super.setSide1(side);
    super.setSide2(side);
    super.setSide3(side);
  }

  /**
   * Returns the length of each side of the equilateral triangle.
   *
   * @return the length of each side of the equilateral triangle
   */
  public double getSide() {
    return super.getSide1();
  }

  /**
   * Returns a string representation of the equilateral triangle.
   *
   * @return a string representation of the equilateral triangle
   */
  public String toString() {
    return "EquilateralTriangle [name=" + this.getName() + ", side=" + this.getSide1() + "]";
  }
}
