package com.udacity.lsolier;

import java.util.List;

public class BinarySearch {

  /**
   * Find a number in a Numbers Sorting List, and return the position of number.
   *
   * @param  listNumbers  Number Sorting List
   * @param  numberToFind Number to find
   * @return              The position of number
   */
  public static Integer find(List<Integer> listNumbers, Integer numberToFind) {

    int indexMin = 1;
    int indexMax = listNumbers.size();
    boolean attempt = true;
    Integer value = 0;
    int i = 1;
    while(attempt) {
      System.out.println("Search number: " + i);
      int indexAverage = (indexMax + indexMin) / 2;
      if (indexMin > indexMax) {
        break;
      }
      Integer option = listNumbers.get(indexAverage - 1);
      if (numberToFind.equals(option)) {
        attempt = false;
        value = option;
      } else if (option < numberToFind) {
          indexMin = indexAverage + 1;
      } else {
        indexMax = indexAverage - 1;
      }
      i++;
    }
    return value;
  }
}
