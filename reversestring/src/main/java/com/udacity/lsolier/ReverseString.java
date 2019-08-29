package com.udacity.lsolier;

import java.util.Stack;

public class ReverseString {

  public String reverseString(String word) {
    StringBuilder reverse = new StringBuilder();
    for (int i = word.length()-1; i >=0; i--) {
      reverse.append(word.charAt(i));
    }
    return reverse.toString();
  }
}
