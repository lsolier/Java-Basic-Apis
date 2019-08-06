package com.udacity.lsolier;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

  public static List<String>[] groupString(List<String> input) {
    List<String>[] arrayList = new List[3];

    for (int i=0; i< arrayList.length; i++) {
      arrayList[i] = new ArrayList<String>();
    }

    for (String value: input) {
      if (value.charAt(0) =='a') {
        arrayList[0].add(value);
      } else if (value.charAt(0) == 'b') {
        arrayList[1].add(value);
      } else {
        arrayList [2].add(value);
      }
    }

    return arrayList;
  }
}
