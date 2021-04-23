package test;

import java.util.Scanner;

public class scannerboolean {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Are you above 18?- ");
    boolean bn = sc.nextBoolean();
    if (bn == true) {
      System.out.println("You are over 18");
    } else {
      System.out.println("You are under 18");
    }
    sc.close();
  }
}
