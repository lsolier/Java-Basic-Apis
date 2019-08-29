package com.udacity.lsolier;

import java.util.Arrays;

public class TwoSum {

  public boolean twoSum(int[] nums, int target) {
    int complement;
    for (int num: nums) {
      complement = target - num;
      return Arrays.stream(nums).anyMatch(n -> n == complement);
    }
    return false;
  }
}
