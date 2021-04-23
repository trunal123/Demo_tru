package test;

import java.util.Scanner;

public class scannerdelimiter {

  public static void main(String args[]){
    String str = "Hello! This is JavaTpoint.";
    //Create a new scanner Object
    Scanner scan = new Scanner(str);
    //Print the next line of the string
    System.out.println("" + scan.nextLine());
    //Print the delimiter this scanner is using
    System.out.println("" +scan.delimiter());
    //Close scanner
    scan.close();
  }
}
