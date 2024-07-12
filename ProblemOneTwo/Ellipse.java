package ProblemOneTwo;

/**
 * The Ellipse class represents an ellipse shape.
 * It extends the Shape class and inherits its properties and methods.
 */
public class Ellipse extends Shape {
  private double majorAxis;
  private double minorAxis;

  /**
   * Constructs a new Ellipse object with the specified name, major axis, and minor axis.
   * The major axis should be greater than or equal to the minor axis.
   *
   * @param name       the name of the ellipse
   * @param majorAxis  the length of the major axis
   * @param minorAxis  the length of the minor axis
   */
  public Ellipse(String name, double majorAxis, double minorAxis) {
    super(name);
    if (majorAxis > minorAxis) {
      this.majorAxis = majorAxis;
      this.minorAxis = minorAxis;
    } else {
      this.majorAxis = minorAxis;
      this.minorAxis = majorAxis;
    }
  }

  /**
   * Returns the length of the major axis of the ellipse.
   *
   * @return the length of the major axis
   */
  public double getMajorAxis() {
    return majorAxis;
  }

  /**
   * Returns the length of the minor axis of the ellipse.
   *
   * @return the length of the minor axis
   */
  public double getMinorAxis() {
    return minorAxis;
  }

  /**
   * Sets the length of the major axis of the ellipse.
   * If the specified value is less than the current length of the minor axis,
   * the major axis will be set to the current length of the minor axis,
   * and the minor axis will be set to the specified value.
   *
   * @param majorAxis the length of the major axis
   */
  public void setMajorAxis(double majorAxis) {
    if (majorAxis > minorAxis) {
      this.majorAxis = majorAxis;
    } else {
      this.majorAxis = minorAxis;
      this.minorAxis = majorAxis;
    }
  }

  /**
   * Sets the length of the minor axis of the ellipse.
   * If the specified value is greater than the current length of the major axis,
   * the minor axis will be set to the current length of the major axis,
   * and the major axis will be set to the specified value.
   *
   * @param minorAxis the length of the minor axis
   */
  public void setMinorAxis(double minorAxis) {
    if (minorAxis < majorAxis) {
      this.minorAxis = minorAxis;
    } else {
      this.minorAxis = majorAxis;
      this.majorAxis = minorAxis;
    }
  }

  /**
   * Calculates and returns the area of the ellipse.
   *
   * @return the area of the ellipse
   */
  @Override
  public double area() {
    return Math.PI * majorAxis * minorAxis;
  }

  /**
   * Calculates and returns the perimeter of the ellipse.
   *
   * @return the perimeter of the ellipse
   */
  @Override
  public double perimeter() {
    double perimeter = 0;
    if (majorAxis == minorAxis) {
      perimeter = 2 * Math.PI * majorAxis;
    } else {
      perimeter = Math.PI * Math.sqrt((2 * (Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2))) - (Math.pow((majorAxis - minorAxis), 2) / 2));
    }
    return perimeter;
  }

  /**
   * Scales the ellipse by the given factor.
   * 
   * @param factor the scaling factor
   */
  @Override
  public void scale(double factor) {
    majorAxis *= factor;
    minorAxis *= factor;
  }

  /**
   * Returns a string representation of the ellipse.
   *
   * @return a string representation of the ellipse
   */
  @Override
  public String toString() {
    return "Ellipse [name=" + this.getName() + ", majorAxis=" + majorAxis + ", minorAxis=" + minorAxis + "]";
  }
}