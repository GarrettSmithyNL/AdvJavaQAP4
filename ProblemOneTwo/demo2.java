package ProblemOneTwo;

public class demo2 {
  public static void main(String[] args) {
    System.out.println();
    // Creates a circle object with a radius of 5.0
    Circle c1 = new Circle("Circle1", 5.0);
    System.out.println(c1);
    // Prints the area and the perimeter of the circle
    System.out.println("Area: " + c1.area());
    System.out.println("Perimeter: " + c1.perimeter());
    // Scales the circle by 2.0
    System.out.println("Scaling by 2.0");
    c1.scale(2.0);
    System.out.println(c1);
    // Prints the area and the perimeter of the circle
    System.out.println("Area: " + c1.area());
    System.out.println("Perimeter: " + c1.perimeter());

    System.out.println();
  
    // Creates an ellipse object with a major axis of 5.0 and a minor axis of 3.0
    Ellipse e1 = new Ellipse("Ellipse1", 5.0, 3.0);
    System.out.println(e1);
    // Prints the area and the perimeter of the ellipse
    System.out.println("Area: " + e1.area());
    System.out.println("Perimeter: " + e1.perimeter());
    // Scales the ellipse by 0.5
    System.out.println("Scaling by 0.5");
    e1.scale(0.5);
    System.out.println(e1);
    // Prints the area and the perimeter of the ellipse
    System.out.println("Area: " + e1.area());
    System.out.println("Perimeter: " + e1.perimeter());

    System.out.println();

    //  Creates a triangle object with sides of 3.0, 4.0, and 5.0
    Triangle t1 = new Triangle("Triangle1", 3.0, 4.0, 5.0);
    System.out.println(t1);
    // Prints the area and the perimeter of the triangle
    System.out.println("Area: " + t1.area());
    System.out.println("Perimeter: " + t1.perimeter());
    // Scales the triangle by 4.0
    System.out.println("Scaling by 4.0");
    t1.scale(4.0);
    System.out.println(t1);
    // Prints the area and the perimeter of the triangle
    System.out.println("Area: " + t1.area());
    System.out.println("Perimeter: " + t1.perimeter());

    System.out.println();
    // Creates an equilateral triangle object with a side length of 5.0
    EquilateralTriangle et1 = new EquilateralTriangle("EquilateralTriangle1", 5.0);
    System.out.println(et1);
    // Prints the area and the perimeter of the equilateral triangle
    System.out.println("Area: " + et1.area());
    System.out.println("Perimeter: " + et1.perimeter());
    // Scales the equilateral triangle by 3.0
    System.out.println("Scaling by 3.0");
    et1.scale(3.0);
    System.out.println(et1);
    // Prints the area and the perimeter of the equilateral triangle
    System.out.println("Area: " + et1.area());
    System.out.println("Perimeter: " + et1.perimeter());
    
  }
  
}
