package ProblemOneTwo;

public class demo2 {
  public static void main(String[] args) {
    System.out.println();
    Circle c1 = new Circle("Circle1", 5.0);
    System.out.println(c1);
    System.out.println("Area: " + c1.area());
    System.out.println("Perimeter: " + c1.perimeter());
    System.out.println("Scaling by 2.0");
    c1.scale(2.0);
    System.out.println(c1);
    System.out.println("Area: " + c1.area());
    System.out.println("Perimeter: " + c1.perimeter());

    System.out.println();
  
    Ellipse e1 = new Ellipse("Ellipse1", 5.0, 3.0);
    System.out.println(e1);
    System.out.println("Area: " + e1.area());
    System.out.println("Perimeter: " + e1.perimeter());
    System.out.println("Scaling by 0.5");
    e1.scale(0.5);
    System.out.println(e1);
    System.out.println("Area: " + e1.area());
    System.out.println("Perimeter: " + e1.perimeter());

    System.out.println();

    Triangle t1 = new Triangle("Triangle1", 3.0, 4.0, 5.0);
    System.out.println(t1);
    System.out.println("Area: " + t1.area());
    System.out.println("Perimeter: " + t1.perimeter());
    System.out.println("Scaling by 4.0");
    t1.scale(4.0);
    System.out.println(t1);
    System.out.println("Area: " + t1.area());
    System.out.println("Perimeter: " + t1.perimeter());

    System.out.println();

    EquilateralTriangle et1 = new EquilateralTriangle("EquilateralTriangle1", 5.0);
    System.out.println(et1);
    System.out.println("Area: " + et1.area());
    System.out.println("Perimeter: " + et1.perimeter());
    System.out.println("Scaling by 3.0");
    et1.scale(3.0);
    System.out.println(et1);
    System.out.println("Area: " + et1.area());
    System.out.println("Perimeter: " + et1.perimeter());
    
  }
  
}
