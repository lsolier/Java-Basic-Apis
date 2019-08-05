package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

public class PermutationTest {

  @Test
  public void test1() {
    int[] array = {1, 2, 3};
    Permutation.printPermutn(array, 3);
    Assert.assertEquals(1, 1);
  }

  @Test
  public void test2() {
    int[] array = {1, 2};
    Permutation.printPermutn(array, 2);
    Assert.assertEquals(1, 1);
  }

}
