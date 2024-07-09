package ProblemOneTwo;

/**
 * Represents a circle shape.
 */
public class Circle extends Shape {
  private double radius;

  /**
   * Constructs a Circle object with the specified name and radius.
   *
   * @param name   the name of the circle
   * @param radius the radius of the circle
   */
  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  /**
   * Returns the radius of the circle.
   *
   * @return the radius of the circle
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Sets the radius of the circle.
   *
   * @param radius the new radius of the circle
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Calculates and returns the area of the circle.
   *
   * @return the area of the circle
   */
  public double area() {
    return Math.PI * radius * radius;
  }

  /**
   * Calculates and returns the perimeter of the circle.
   *
   * @return the perimeter of the circle
   */
  public double perimeter() {
    return 2 * Math.PI * radius;
  }
  
  @Override
  public void scale(double factor) {
    radius *= factor;
  }

  /**
   * Returns a string representation of the circle.
   *
   * @return a string representation of the circle
   */
  public String toString() {
    return "Circle [name=" + getName() + ", radius=" + radius + "]";
  }
}
