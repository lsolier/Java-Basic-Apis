package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

  @Test
  public void twoSumTest() {
    int[] nums = {1, 2, 3, 4};
    int target = 5;
    TwoSum obj = new TwoSum();
    boolean result = obj.twoSum(nums, target);
    Assert.assertEquals(true, result);
  }

  @Test
  public void twoSumTest2() {
    int[] nums = {1,4,5,1,6};
    int target = 12;
    TwoSum obj = new TwoSum();
    boolean result = obj.twoSum(nums, target);
    Assert.assertEquals(false, result);
  }

}
