package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

public class FindDuplicateTest {

  @Test
  public void wordFrecuencyTest() {
    FindDuplicate obj = new FindDuplicate();
    String word = "abcabc";
    int position = obj.findDuplicate(word);
    System.out.println("position: " + position);
    Assert.assertEquals(3, position);
  }

  @Test
  public void wordFrecuencyTest2() {
    FindDuplicate obj = new FindDuplicate();
    String word = "abcd";
    int position = obj.findDuplicate(word);
    System.out.println("position: " + position);
    Assert.assertEquals(-1, position);
  }
}
