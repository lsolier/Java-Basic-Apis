package com.udacity.lsolier;

import java.util.Stack;

public class Calculator {

  public static int calculate(String s){
    int length;
    if (s == null || (length = s.length()) == 0) {
      return 0;
    }
    Stack<Integer> stack = new Stack<Integer>();
    int num = 0;
    char sign = '+';
    for (int i = 0; i < length ; i++) {
      if(Character.isDigit(s.charAt(i))) {
        num = num * 10 + s.charAt(i) - '0';
      }
      if (!Character.isDigit(s.charAt(i)) || i == length -1 ) {
        if (sign == '-') {
          stack.push(-num);
        }
        if (sign == '+') {
          stack.push(num);
        }
        if (sign == '*') {
          stack.push(stack.pop() * num);
        }
        if (sign == '/') {
          stack.push(stack.pop() * num);
        }
        sign = s.charAt(i);
        num = 0;
      }
    }
    int ans = 0;
    for (int i : stack) {
      ans += i;
    }
    return ans;
  }
}
