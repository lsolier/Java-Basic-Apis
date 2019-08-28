package com.udacity.lsolier;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class WordFrecuencyTest {

  @Test
  public void wordFrecuencyTest() {
    WordFrecuency wordFrecuency = new WordFrecuency();
    List<String> wordList = Arrays.asList("abc", "bcb", "abc");
    TreeMap<String, Integer> frecuency = wordFrecuency.wordFrecuency(wordList);
    frecuency.forEach((k, v)-> System.out.println(k + "|" + v));
    Assert.assertEquals(Integer.valueOf(2), frecuency.get("abc"));
  }
}
