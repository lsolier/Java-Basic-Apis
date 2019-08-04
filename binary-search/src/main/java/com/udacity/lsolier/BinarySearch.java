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

    int indexMin = 0;
    int indexMax = arrayNumbers.length - 1;
    boolean attempt = true;
    int position = -1;
    int i = 0;
    int indexAverage;
    int likelyNumber;
    while(attempt) {
      System.out.println("Attempt: " + ++i);
      indexAverage = (indexMax + indexMin) / 2;
      if (indexMin > indexMax) {
        attempt = false;
      }
      likelyNumber = arrayNumbers[indexAverage];
      if (target == likelyNumber) {
        attempt = false;
        position = indexAverage;
      } else if (likelyNumber < target) {
          indexMin = indexAverage + 1;
      } else {
        indexMax = indexAverage - 1;
      }
    }
    return position;
  }
}
