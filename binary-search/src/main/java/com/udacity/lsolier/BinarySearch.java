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
  public static int find(List<Integer> listNumbers, int numberToFind) {

    int indexMin = 1;
    int indexMax = listNumbers.size();
    boolean attempt = true;
    int position = -1;
    int i = 0;
    while(attempt) {
      System.out.println("Search number: " + ++i);
      int indexAverage = (indexMax + indexMin) / 2;
      if (indexMin > indexMax) {
        break;
      }
      int option = listNumbers.get(indexAverage - 1);
      if (numberToFind == option) {
        attempt = false;
        position = indexAverage - 1;
      } else if (option < numberToFind) {
          indexMin = indexAverage + 1;
      } else {
        indexMax = indexAverage - 1;
      }
    }
    return position;
  }
}
