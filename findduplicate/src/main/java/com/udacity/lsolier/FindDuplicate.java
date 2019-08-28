package com.udacity.lsolier;

public class FindDuplicate {

  public int findDuplicate(String word) {
    StringBuilder temp = new StringBuilder();
    int position = -1;
    boolean isDuplicate = false;
    char[] arrayWord = word.toCharArray();
    for (int i=0; i < arrayWord.length; i++) {
      if (temp.toString().contains(""+arrayWord[i])) {
        isDuplicate = true;
        position = i;
        break;
      }
      temp.append(arrayWord[i]);
    }
    if (!isDuplicate) {
      position = -1;
    }
    return position;
  }

}
