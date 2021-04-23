package test;

import java.util.Scanner;

public class scannerfunction {
  public static void main(String args[]){
    String s = "Hi All! This is JavaTpoint.";
    //Create a scanner with the specified Object
    Scanner scanner = new Scanner(s);
    System.out.println("" + scanner.nextLine());
    //Print the delimiter this scanner is using
    System.out.println("" +scanner.delimiter());
    //Close the scanner
    System.out.println("Closing Scanner...");
    scanner.close();
    System.out.println("Scanner Closed.");
  }

}
