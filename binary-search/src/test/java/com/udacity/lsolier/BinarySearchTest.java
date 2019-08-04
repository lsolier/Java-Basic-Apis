package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

  @Test
  public void test1() {
    int[] numbersArray = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};

    int target = 11;
    System.out.println("Number to Find: " + target);

    long startTime = System.nanoTime();
    int position = BinarySearch.find(numbersArray, target);
    long endTime = System.nanoTime() - startTime;

    System.out.println("Time elapsed: " + endTime);
    int expected = 5;

    Assert.assertEquals(expected, position);
  }

  @Test
  public void test2() {
    int[] numbersArray = {1, 2, 3, 4, 5};

    int target = 10;
    System.out.println("Number to Find: " + target);

    long startTime = System.nanoTime();
    int position = BinarySearch.find(numbersArray, target);
    long endTime = System.nanoTime() - startTime;

    System.out.println("Time elapsed: " + endTime);
    int expected = -1;

    Assert.assertEquals(expected, position);
  }
}
