package com.udacity.lsolier;

import java.util.*;
import java.util.stream.Collectors;

public class FindTop {

  public List<Integer> findTop(int[] numbers, int top) {
    TreeSet<Integer> numbersOrdened = new TreeSet<>();
    for (int num: numbers) {
      numbersOrdened.add(num);
      if (numbersOrdened.size() > top) {
        numbersOrdened.pollFirst();
      }
    }
    return numbersOrdened.stream().collect(Collectors.toList());
  }
}
