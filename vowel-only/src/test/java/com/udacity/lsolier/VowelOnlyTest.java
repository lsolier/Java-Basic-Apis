package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

public class VowelOnlyTest {

  @Test
  public void vowelOnlyTest1() throws Exception{

    String input = "Hello word";
    String output = VowelOnly.vowelOnly(input);
    String expected = "eoo";
    Assert.assertEquals(expected, output);

  }

  @Test
  public void vowelOnlyTest2() throws Exception{

    String input = "Archipielago";
    String output = VowelOnly.vowelOnly(input);
    String expected = "Aiieao";
    Assert.assertEquals(expected, output);

  }

}
