package com.udacity.lsolier;

public class Main {

  public static void main(String[] args){
    String input = "Archipielagoo";
    StringBuilder msg = new StringBuilder("The input is: ");
    msg.append(input);
    System.out.println("The vowels expected are Aiieao");
    System.out.println(msg.toString());
    System.out.println("Testing Algirthm.....");
    System.out.println(VowelOnly.vowelOnly("Archipielago"));
    System.out.println("Finish");
  }
}
