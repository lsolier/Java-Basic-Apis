package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void calculateTest1() {
    String operation = "1+2";
    int value = Calculator.calculate(operation);
    Assert.assertEquals(3, value);
  }

  @Test
  public void calculateTest2() {
    String operation = "1+2*5";
    int value = Calculator.calculate(operation);
    Assert.assertEquals(11, value);
  }
}
