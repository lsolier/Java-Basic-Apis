package com.udacity.lsolier;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

  public int findDuplicate(String word) {
    Set<Character> temp = new HashSet<Character>();
    for (int i=0; i < word.length(); i++) {
      if (temp.contains(word.charAt(i))) {
        return i;
      }
      temp.add(word.charAt(i));
    }
    return -1;
  }

}
