package com.udacity.lsolier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {

  public static void main (String[] args){
    List<Integer> numbersList = new ArrayList<>(100);
    for (int i = 0 ;i < 100 ;i++ ) {
      int number = ThreadLocalRandom.current().nextInt(1, 100 + 1);
      numbersList.add(number);
    }
    numbersList = numbersList.stream().sorted().distinct().collect(Collectors.toList());
    System.out.println("Lista: " + numbersList);
    Integer numberToFind = 50;
    System.out.println("Number to Find: " + numberToFind);
    Integer value = BinarySearch.find(numbersList, numberToFind);
    if (value.equals(0)){
      System.out.println("Numero NO encontrado");
    } else {
      System.out.println("Numero encontrado");
    }
  }

}
