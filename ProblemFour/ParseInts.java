
// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the integers in the line.
//****************************************************************
import java.util.Scanner;

public class ParseInts {

  public static void main(String[] args) {

    int val, sum=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a line of text");
    Scanner scanLine = new Scanner(scan.nextLine());
    while (scanLine.hasNext()) {
      try {
        val = Integer.parseInt(scanLine.next());
        sum += val;
      } catch (NumberFormatException e) {
        // Does Nothing
      }
    }
    System.out.println("The sum of the integers on this is " + sum);
    // Added closing for the scanners
    scan.close();
    scanLine.close();
  }
}
