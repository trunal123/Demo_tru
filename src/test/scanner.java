package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class scanner {


  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter User_name");

    String User_name = scan.nextLine();
    System.out.println("User name is " + User_name);

    Integer age = scan.nextInt();
    System.out.println("User age is " +age);

    double salary = scan.nextDouble();
    System.out.println("salar is " + salary );

    float Percentage = scan.nextFloat();
    System.out.println("percentage is " + Percentage);

    long Curreney = scan.nextLong();
    System.out.println("Currency is " + Curreney);



  }
}
