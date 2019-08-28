package com.udacity.lsolier;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordFrecuency {

  public TreeMap<String,Integer> wordFrecuency(List<String> wordList) {
    TreeMap<String, Integer> frecuency = new TreeMap<>();
    for (String word: wordList) {
      frecuency.put(word, frecuency.getOrDefault(word, 0) +1 );
    }
    return frecuency;
  }
}
