public class demo {
  public static void main(String[] args) {
    System.out.println();
    Circle c1 = new Circle("Circle1", 5.0);
    System.out.println(c1);
    System.out.println("Area: " + c1.area());
    System.out.println("Perimeter: " + c1.perimeter());
    System.out.println("Setting radius to 10.0");
    c1.setRadius(10.0);
    System.out.println(c1);
    System.out.println("Area: " + c1.area());
    System.out.println("Perimeter: " + c1.perimeter());

    System.out.println();
  
    Ellipse e1 = new Ellipse("Ellipse1", 5.0, 3.0);
    System.out.println(e1);
    System.out.println("Area: " + e1.area());
    System.out.println("Perimeter: " + e1.perimeter());
    System.out.println("Setting major axis of 2.0");
    e1.setMajorAxis(2.0);
    System.out.println(e1);
    System.out.println("Area: " + e1.area());
    System.out.println("Perimeter: " + e1.perimeter());
    System.out.println("Setting minor axis of 4.0");
    e1.setMinorAxis(4.0);
    System.out.println(e1);
    System.out.println("Area: " + e1.area());
    System.out.println("Perimeter: " + e1.perimeter());
    
    System.out.println();

    Triangle t1 = new Triangle("Triangle1", 3.0, 4.0, 5.0);
    System.out.println(t1);
    System.out.println("Area: " + t1.area());
    System.out.println("Perimeter: " + t1.perimeter());
    System.out.println("Setting side1 to 6.0");
    t1.setSide1(6.0);
    System.out.println(t1);
    System.out.println("Area: " + t1.area());
    System.out.println("Perimeter: " + t1.perimeter());
    System.out.println("Setting side2 to 8.0");
    t1.setSide2(8.0);
    System.out.println(t1);
    System.out.println("Area: " + t1.area());
    System.out.println("Perimeter: " + t1.perimeter());
    System.out.println("Setting side3 to 10.0");
    t1.setSide3(10.0);
    System.out.println(t1);
    System.out.println("Area: " + t1.area());
    System.out.println("Perimeter: " + t1.perimeter());

     System.out.println();

    EquilateralTriangle et1 = new EquilateralTriangle("EquilateralTriangle1", 5.0);
    System.out.println(et1);
    System.out.println("Area: " + et1.area());
    System.out.println("Perimeter: " + et1.perimeter());
    System.out.println("Setting side to 10.0");
    et1.setSide(10.0);
    System.out.println(et1);
    System.out.println("Area: " + et1.area());
    System.out.println("Perimeter: " + et1.perimeter());
     System.out.println();
  }
  
}
