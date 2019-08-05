package com.udacity.lsolier;

public class Permutation {

  public static void printPermutn(int[] array, int index) {
    if (index == 1) {
      StringBuilder sb = new StringBuilder();
      for (int value : array) {
        sb.append(value);
      }
      System.out.println(sb.toString());
    } else {
      for (int i = 0; i < index ; i++) {
        printPermutn(array, index - 1);
        if (index % 2 == 0) {
          int temp = array[i];
          array[i] = array[index-1];
          array[index-1] = temp;
        } else {
          int temp = array[0];
          array[0] = array[index-1];
          array[index-1] = temp;
        }
      }
    }
  }
}
