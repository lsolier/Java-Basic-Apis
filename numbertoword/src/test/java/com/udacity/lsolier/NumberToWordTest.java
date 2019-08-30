package com.udacity.lsolier;


import org.junit.Assert;
import org.junit.Test;

public class NumberToWordTest {

  @Test
  public void numberToWord() {
    String result = NumberToWord.translateNumberToWord(10245);
    System.out.println(result);
    Assert.assertEquals("diez mil dos cientos cuarenta cinco", result);
  }

  @Test
  public void numberToWord2() {
    String result = NumberToWord.translateNumberToWord(125);
    System.out.println(result);
    Assert.assertEquals("ciento veinte cinco", result);
  }

}