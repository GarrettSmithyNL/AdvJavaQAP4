package ProblemOneTwo;

/**
 * The abstract class Shape represents a geometric shape.
 * It provides common properties and methods for all shapes.
 */
public abstract class Shape implements Scalable{
  private String name;

  /**
   * Constructs a Shape object with the specified name.
   * 
   * @param name the name of the shape
   */
  public Shape(String name) {
    this.name = name;
  }

  /**
   * Returns the name of the shape.
   * 
   * @return the name of the shape
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the shape.
   * 
   * @param name the name of the shape
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Calculates and returns the area of the shape.
   * 
   * @return the area of the shape
   */
  public abstract double area();

  /**
   * Calculates and returns the perimeter of the shape.
   * 
   * @return the perimeter of the shape
   */
  public abstract double perimeter(); 

  /**
   * Returns a string representation of the shape.
   * 
   * @return a string representation of the shape
   */
  public abstract String toString();
}
