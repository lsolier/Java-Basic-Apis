package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

public class ReserveStringTest {

  @Test
  public void reserveStringTest() {
    String word = "Hello Word";
    ReverseString obj = new ReverseString();
    String result = obj.reverseString(word);
    Assert.assertEquals("droW olleH", result);
  }

  @Test
  public void reserveStringTest2() {
    String word = "abcde";
    ReverseString obj = new ReverseString();
    String result = obj.reverseString(word);
    Assert.assertEquals("edcba", result);
  }
}
