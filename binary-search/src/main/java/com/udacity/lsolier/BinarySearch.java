package com.udacity.lsolier;

public class BinarySearch {

  /**
   * Find a number in a Numbers Sorting List, and return the position of number.
   *
   * @param  arrayNumbers  Number Sorting List
   * @param  target       Number to find
   * @return              The position of number
   */
  public static int find(int[] arrayNumbers, int target) {

    int indexMin = 1;
    int indexMax = arrayNumbers.length;
    boolean attempt = true;
    int position = -1;
    int i = 0;
    while(attempt) {
      System.out.println("Search number: " + ++i);
      int indexAverage = (indexMax + indexMin) / 2;
      if (indexMin > indexMax) {
        attempt = false;
      }
      int option = arrayNumbers[indexAverage];
      if (target == option) {
        attempt = false;
        position = indexAverage - 1;
      } else if (option < target) {
          indexMin = indexAverage + 1;
      } else {
        indexMax = indexAverage - 1;
      }
    }
    return position;
  }
}
