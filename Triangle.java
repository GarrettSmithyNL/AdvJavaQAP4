/**
 * The Triangle class represents a triangle shape.
 * It extends the Shape class and inherits its properties and methods.
 */
public class Triangle extends Shape {
  private double side1;
  private double side2;
  private double side3;

  /**
   * Constructs a Triangle object with the specified name and side lengths.
   * 
   * @param name   the name of the triangle
   * @param side1  the length of the first side
   * @param side2  the length of the second side
   * @param side3  the length of the third side
   */
  public Triangle(String name, double side1, double side2, double side3) {
    super(name);
    if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
      System.out.println("Invalid side lengths for a triangle.");
      System.exit(0);
    } else {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    }
  }

  /*
   * Sets the length of the first side of the triangle.
   * 
   * @param side1  the length of the first side
   */
  public void setSide1(double side1) {
    this.side1 = side1;
  }

  /**
   * Returns the length of the first side of the triangle.
   * 
   * @return the length of the first side
   */
  public double getSide1() {
    return side1;
  }

  /**
   * Sets the length of the second side of the triangle.
   * 
   * @param side2  the length of the second side
   */
  public void setSide2(double side2) {
    this.side2 = side2;
  }

  /**
   * Returns the length of the second side of the triangle.
   * 
   * @return the length of the second side
   */
  public double getSide2() {
    return side2;
  }

  /**
   * Sets the length of the third side of the triangle.
   * 
   * @param side3  the length of the third side
   */
  public void setSide3(double side3) {
    this.side3 = side3;
  }

  /**
   * Returns the length of the third side of the triangle.
   * 
   * @return the length of the third side
   */
  public double getSide3() {
    return side3;
  }

  /**
   * Calculates and returns the area of the triangle.
   * 
   * @return the area of the triangle
   */
  @Override
  public double area() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  /**
   * Calculates and returns the perimeter of the triangle.
   * 
   * @return the perimeter of the triangle
   */
  @Override
  public double perimeter() {
    return side1 + side2 + side3;
  } 

  /**
   * Returns a string representation of the triangle.
   * 
   * @return a string representation of the triangle
   */
  @Override
  public String toString() {
    return "Triangle [" + "name=" + getName() + ", side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
  }
}
