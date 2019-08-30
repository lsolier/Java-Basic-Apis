package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindTopTest {

  @Test
  public void findTopTest() {
    int[] numbers = {-1, 15, 59, 22, 6, 42, 45, 0};
    int top = 4;
    FindTop obj = new FindTop();
    List<Integer> topNumbers = obj.findTop(numbers, top);
    topNumbers.forEach(System.out::println);
    Assert.assertEquals(42, topNumbers.get(1).intValue());
  }

  @Test
  public void findTopTest2() {
    int[] numbers = {5, 10, 22, 100, 8};
    int top = 2;
    FindTop obj = new FindTop();
    List<Integer> topNumbers = obj.findTop(numbers, top);
    topNumbers.forEach(System.out::println);
    Assert.assertEquals(22, topNumbers.get(0).intValue());
  }

}