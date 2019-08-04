package com.udacity.lsolier;

public class VowelOnly {

  public static void main(String[] args){
    System.out.println(vowelOnly("Archipielago"));
  }

  /**
   * Returns the vowels that contains a word
   *
   * @param  word  an any word
   * @return       the vowels that contains the word
   */
  public static String vowelOnly(String word){
    //declare the variable as String because the vowel will not changed
    String vowels = "aeiou";
    //declare the variable as StringBuilder because will be changed many times
    StringBuilder vowelsInsideWord = new StringBuilder();
    for (char c : word.toCharArray()) {
      if (vowels.contains(String.valueOf(c).toLowerCase())) {
        vowelsInsideWord.append(c);
      }
    }
    return vowelsInsideWord.toString();
  }
}
